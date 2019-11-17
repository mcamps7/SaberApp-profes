/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistes;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Alumne;

/**
 *
 * @author montse
 */
public class PM06ARegistrarAlumne extends javax.swing.JFrame {

    //SaberAppClient sac = new SaberAppClientImpl();
    List<String> nomsInstituts = new ArrayList<>();
    List<Integer> cursos = new ArrayList<>();
    String contrasenya;
    String nick, password, name, surname, school, level, mail, image;
    
    boolean dadesOK = false;
    
    private ModelTaulaDadesAlumne modelTaulaAlumnes;
    
    /**
     * Creates new form PM06aAfegirAlumne
     */
    public PM06ARegistrarAlumne() throws ParseException {
        initComponents();
        
        setSize(750, 625);
        setResizable(false);
        setLocationRelativeTo(null);

        jPanel1.setSize(750, 340);
        jPanel2.setSize(750, 460);
        
        setModelTaula();
    }
    
    private void setModelTaula() throws ParseException{
        modelTaulaAlumnes = new ModelTaulaDadesAlumne();
        modelTaulaAlumnes.setAlumnes(obtenirAlumnes());
        this.taulaAlumnes.setModel(modelTaulaAlumnes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbUsuari = new javax.swing.JLabel();
        lbContrasenya = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        lbNom = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        lbInsti = new javax.swing.JLabel();
        cbInstitut = new javax.swing.JComboBox<>();
        lbCognoms = new javax.swing.JLabel();
        cognoms = new javax.swing.JTextField();
        lbCurs = new javax.swing.JLabel();
        cbCurs = new javax.swing.JComboBox<>();
        lbCorreu = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        lbImatge = new javax.swing.JLabel();
        imatge = new javax.swing.JTextField();
        btAfegir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taulaAlumnes = new javax.swing.JTable();
        btInfo = new javax.swing.JButton();
        btModifica = new javax.swing.JButton();
        btEsborra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(162, 215, 41));

        jLabel1.setText("Registrar Alumnes");

        lbUsuari.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbUsuari.setText("*Usuari:");

        lbContrasenya.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbContrasenya.setText("*Contrasenya:");

        user.setBackground(new java.awt.Color(239, 247, 207));
        user.setToolTipText("nom usuari");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        pass.setBackground(new java.awt.Color(239, 247, 207));
        pass.setToolTipText("jPasswo");

        lbNom.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbNom.setText("Nom:");

        nom.setBackground(new java.awt.Color(239, 247, 207));
        nom.setToolTipText("nom usuari");
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });

        lbInsti.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbInsti.setText("Centre educatiu:");

        cbInstitut.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInstitutItemStateChanged(evt);
            }
        });

        lbCognoms.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbCognoms.setText("Cognoms:");

        cognoms.setBackground(new java.awt.Color(239, 247, 207));
        cognoms.setToolTipText("nom usuari");
        cognoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cognomsActionPerformed(evt);
            }
        });

        lbCurs.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbCurs.setText("Curs:");

        cbCurs.setBackground(new java.awt.Color(239, 247, 207));
        cbCurs.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        cbCurs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCursItemStateChanged(evt);
            }
        });

        lbCorreu.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbCorreu.setText("*Adreça electrònica:");

        email.setBackground(new java.awt.Color(239, 247, 207));
        email.setToolTipText("nom usuari");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        lbImatge.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbImatge.setText("Imatge:");

        imatge.setBackground(new java.awt.Color(239, 247, 207));
        imatge.setToolTipText("nom usuari");
        imatge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imatgeActionPerformed(evt);
            }
        });

        btAfegir.setText("Afegir");
        btAfegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAfegirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbNom)
                            .addGap(253, 253, 253)
                            .addComponent(lbInsti))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(cbInstitut, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbCognoms)
                            .addGap(219, 219, 219)
                            .addComponent(lbCurs))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cognoms, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(cbCurs, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbCorreu)
                            .addGap(149, 149, 149)
                            .addComponent(lbImatge))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(imatge, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbUsuari)
                            .addGap(4, 4, 4)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbContrasenya)
                            .addGap(11, 11, 11)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(btAfegir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbUsuari))
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbContrasenya))
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNom)
                    .addComponent(lbInsti))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbInstitut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCognoms)
                    .addComponent(lbCurs))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cognoms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCurs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCorreu)
                    .addComponent(lbImatge))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imatge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btAfegir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(162, 215, 41));

        taulaAlumnes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(taulaAlumnes);

        btInfo.setText("Obtenir dades");

        btModifica.setText("Modificar");

        btEsborra.setText("Esborrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btModifica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEsborra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btInfo)
                .addGap(18, 18, 18)
                .addComponent(btModifica)
                .addGap(18, 18, 18)
                .addComponent(btEsborra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void cbInstitutItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInstitutItemStateChanged
        school = (String) cbInstitut.getSelectedItem();
    }//GEN-LAST:event_cbInstitutItemStateChanged

    private void cognomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cognomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cognomsActionPerformed

    private void cbCursItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCursItemStateChanged
        level = (String) cbCurs.getSelectedItem();
    }//GEN-LAST:event_cbCursItemStateChanged

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void imatgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imatgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imatgeActionPerformed

    private void btAfegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAfegirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAfegirActionPerformed

    public ArrayList<Alumne> obtenirAlumnes() throws ParseException{
        
        ArrayList<Alumne> llista = new ArrayList();
        llista.add(new Alumne(1, "Pepe", "123","Josep","Macià Casals","jmacia@iesguillembergueda.cat","IES Guillem de Berguedà", 3, 0, 0));
        llista.add(new Alumne(2, "HarryPotter", "123","Ot","Travé Sanchez","otrave@iesguillembergueda.cat","IES Guillem de Berguedà", 1, 5, 1));
        llista.add(new Alumne(3, "Mary", "123","Maria","Freixa Cabanillas","mfcabanillas@insserradenoet.cat","INS Serra de Noet", 4, 2, 20));

        return llista;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PM06ARegistrarAlumne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PM06ARegistrarAlumne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PM06ARegistrarAlumne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PM06ARegistrarAlumne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PM06ARegistrarAlumne().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(PM06ARegistrarAlumne.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAfegir;
    private javax.swing.JButton btEsborra;
    private javax.swing.JButton btInfo;
    private javax.swing.JButton btModifica;
    private javax.swing.JComboBox<String> cbCurs;
    private javax.swing.JComboBox<String> cbInstitut;
    private javax.swing.JTextField cognoms;
    private javax.swing.JTextField email;
    private javax.swing.JTextField imatge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCognoms;
    private javax.swing.JLabel lbContrasenya;
    private javax.swing.JLabel lbCorreu;
    private javax.swing.JLabel lbCurs;
    private javax.swing.JLabel lbImatge;
    private javax.swing.JLabel lbInsti;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbUsuari;
    private javax.swing.JTextField nom;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTable taulaAlumnes;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}