package gestors;

import java.io.DataInputStream;
import connection.Connection;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import models.Institut;

/**
 * Classe controler dels professors
 *
 * @author Montse
 */
public class ClientProfessor extends Connection {

    //Necesari per des serialitzar: 
    //https://stackoverflow.com/questions/29946475/writing-aborted-java-io-notserializableexception
    private static final long serialVersionUID = -1892561327013038124L;

    //Constructor. Instanciem una connexió de tipus client
    public ClientProfessor() throws IOException {
        super("client");
    }

    /**
     * Métode per iniciar el client
     */
    public void startClient(String codi) {
        try {
            entradaClient = new DataInputStream(cs.getInputStream());
            String line = entradaClient.readUTF();
            System.out.println("Server Message: " + line);

            //Flujo de datos hacia el servidor
            sortidaClient = new DataOutputStream(cs.getOutputStream());

            //Enviem un 1 perque el servidor sàpiga que es connecta un professor
            sortidaClient.writeInt(1);
            
            //TODO mètode seleccio 1 login 2 registre
            sortidaClient.writeUTF(codi);

            
            //cs.close();//Fin de la conexión
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int login(String user, String password) throws IOException {

        sortidaClient.writeUTF(user);
        System.out.println(user);

        sortidaClient.writeUTF(password);
        System.out.println(password);

        entradaClient = new DataInputStream(cs.getInputStream());
        int line = entradaClient.readInt();
        System.out.println("Server Message: " + line);
        //1 existeix / 2 no existeix / 3 error
        
        return line;
    }

    public String registreProfessor(String nick, String password, String nom, String cognoms, String mail, String image, int id_institut, String materia) throws IOException {

        //La id l'hauria de posar automàticament la BD
                      
        sortidaClient.writeUTF(nick);
        sortidaClient.writeUTF(password);
        sortidaClient.writeUTF(nom);
        sortidaClient.writeUTF(cognoms);
        sortidaClient.writeUTF(mail);
        sortidaClient.writeUTF(image);
        sortidaClient.writeInt(id_institut);
        sortidaClient.writeUTF(materia);

        entradaClient = new DataInputStream(cs.getInputStream());
        String line = entradaClient.readUTF();
        System.out.println("Server Message: " + line);
        //1- tot correcte, 2-error en algun camp, 3-error
        
        return line;
    }

    private void allInstituts() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("instituts.obj"));
        String str = (String) entrada.readObject();
        List<Institut> llista = (List<Institut>) entrada.readObject();

        System.out.println(str);

        for (Institut in : llista) {
            System.out.println(in.getNom());
        }
    }

    private void logout() {
        try {
            cs.close();
        } catch (IOException ex) {
            System.out.println("Error al close()");
            ex.printStackTrace();
        }
    }

    

}