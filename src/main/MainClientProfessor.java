/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.IOException;
import gestors.ClientProfessorProvaPau;

/**
 *
 * @author Pau
 */
public class MainClientProfessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ClientProfessorProvaPau cli = new ClientProfessorProvaPau();

        System.out.println("Iniciant Client Professor\n");

        cli.startClient();
    }

}
