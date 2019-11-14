/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistes.panels;

import gestors.ClientProfessor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author montse
 */
public class PM04Modifica extends javax.swing.JPanel {

    String contrasenya;
    String nick, password, name, surname, school, mail, image;
    String subject = "";
    int id_institut = 1;

    boolean dadesOK = false;
    /**
     * Creates new form PM04Modifica
     */
    public PM04Modifica(String nick) {
        initComponents();
        user.setText(nick);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPModifica = new javax.swing.JPanel();
        lbIcona = new javax.swing.JLabel();
        lbUsuari = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        lbContrasenya = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        lbNom = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        lbCognoms = new javax.swing.JLabel();
        cognoms = new javax.swing.JTextField();
        lbCorreu = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        imatge = new javax.swing.JTextField();
        lbImatge = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        lbMateria = new javax.swing.JLabel();
        cbInstitut = new javax.swing.JComboBox<>();
        lbInsti = new javax.swing.JLabel();
        btModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(162, 215, 41));
        setPreferredSize(new java.awt.Dimension(600, 500));

        jPModifica.setBackground(new java.awt.Color(162, 215, 41));
        jPModifica.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        jPModifica.setPreferredSize(new java.awt.Dimension(600, 500));

        lbIcona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icon_rounded_user_login.png"))); // NOI18N

        lbUsuari.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbUsuari.setText("*Usuari:");

        user.setBackground(new java.awt.Color(239, 247, 207));
        user.setToolTipText("nom usuari");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        lbContrasenya.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbContrasenya.setText("*Contrasenya:");

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

        lbCognoms.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbCognoms.setText("Cognoms:");

        cognoms.setBackground(new java.awt.Color(239, 247, 207));
        cognoms.setToolTipText("nom usuari");
        cognoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cognomsActionPerformed(evt);
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

        imatge.setBackground(new java.awt.Color(239, 247, 207));
        imatge.setToolTipText("nom usuari");
        imatge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imatgeActionPerformed(evt);
            }
        });

        lbImatge.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbImatge.setText("Imatge:");

        cbMateria.setBackground(new java.awt.Color(239, 247, 207));
        cbMateria.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        cbMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMateriaItemStateChanged(evt);
            }
        });

        lbMateria.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbMateria.setText("Matèria:");

        cbInstitut.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbInstitutItemStateChanged(evt);
            }
        });

        lbInsti.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        lbInsti.setText("Centre educatiu:");

        btModificar.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N
        jLabel1.setText("* Aquests camps són obligatoris");

        lbLogo.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(251, 139, 36));
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icon_logo_saberapp_64.png"))); // NOI18N
        lbLogo.setText("SaberApp");

        btCancelar.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        btCancelar.setText("Cancel·lar");
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btCancelarMousePressed(evt);
            }
        });
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPModificaLayout = new javax.swing.GroupLayout(jPModifica);
        jPModifica.setLayout(jPModificaLayout);
        jPModificaLayout.setHorizontalGroup(
            jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPModificaLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPModificaLayout.createSequentialGroup()
                            .addComponent(lbIcona)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPModificaLayout.createSequentialGroup()
                                    .addComponent(lbNom)
                                    .addGap(253, 253, 253)
                                    .addComponent(lbInsti))
                                .addGroup(jPModificaLayout.createSequentialGroup()
                                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(cbInstitut, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPModificaLayout.createSequentialGroup()
                                    .addComponent(lbCognoms)
                                    .addGap(219, 219, 219)
                                    .addComponent(lbMateria))
                                .addGroup(jPModificaLayout.createSequentialGroup()
                                    .addComponent(cognoms, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPModificaLayout.createSequentialGroup()
                                    .addComponent(lbCorreu)
                                    .addGap(149, 149, 149)
                                    .addComponent(lbImatge))
                                .addGroup(jPModificaLayout.createSequentialGroup()
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(imatge, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPModificaLayout.createSequentialGroup()
                                    .addComponent(lbLogo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPModificaLayout.createSequentialGroup()
                                .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPModificaLayout.createSequentialGroup()
                                        .addComponent(lbUsuari)
                                        .addGap(4, 4, 4)
                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPModificaLayout.createSequentialGroup()
                                        .addComponent(lbContrasenya)
                                        .addGap(11, 11, 11)
                                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(133, 133, 133))))
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPModificaLayout.setVerticalGroup(
            jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPModificaLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(lbIcona)
                    .addGap(33, 33, 33)
                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPModificaLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lbUsuari))
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPModificaLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lbContrasenya))
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbNom)
                        .addComponent(lbInsti))
                    .addGap(3, 3, 3)
                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbInstitut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCognoms)
                        .addComponent(lbMateria))
                    .addGap(3, 3, 3)
                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cognoms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCorreu)
                        .addComponent(lbImatge))
                    .addGap(3, 3, 3)
                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imatge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel1)
                    .addGap(27, 27, 27)
                    .addGroup(jPModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPModificaLayout.createSequentialGroup()
                            .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(3, 3, 3)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPModifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPModifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void cognomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cognomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cognomsActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void imatgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imatgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imatgeActionPerformed

    private void cbMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMateriaItemStateChanged
        subject = (String) cbMateria.getSelectedItem();
    }//GEN-LAST:event_cbMateriaItemStateChanged

    private void cbInstitutItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbInstitutItemStateChanged
        id_institut = ((int) cbInstitut.getSelectedIndex())+1;
    }//GEN-LAST:event_cbInstitutItemStateChanged

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        String res = "";

        // Connectar, buscar i retornar
        try {
            ClientProfessor ges = new ClientProfessor();
            ges.startClient("2");//TODO canviar pel num codi modifica dades

            //TODO setText de tots els camps segons qui sigui l'usuari logat
            contrasenya = new String(pass.getPassword());
            nick = user.getText();
            name = nom.getText();
            surname = cognoms.getText();
            mail = email.getText();
            school = (String) cbInstitut.getSelectedItem();
            subject = (String) cbMateria.getSelectedItem();
            image = imatge.getText();

            Pattern p = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
            Matcher m = p.matcher(mail);

            //Validar dades
            //TODO millorar validació
            if (m.find() == true) {
                System.out.println("El email ingresado es válido.");
                if (!nick.isEmpty() || !mail.isEmpty() || !password.isEmpty()) {
                    dadesOK= true;

                } else {
                    JOptionPane.showMessageDialog(null, "Hi ha camps obligatoris buits", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "L'adreça de correu no és vàlida", "Alerta", JOptionPane.WARNING_MESSAGE);
                System.out.println("El email ingresado es inválido.");

            }

            if(dadesOK){
                res = ges.registreProfessor(nick, contrasenya, name, surname, mail, image, id_institut, subject);
                System.out.println("La resposta del servidor és " + res + "\n" + nick + contrasenya + name
                    + surname + mail + image + id_institut + school + subject);

                JOptionPane.showMessageDialog(null, "Benvolgut " + nick + "!!\n"
                    + "Les dades s'han modificat correctament", "Missatge de confirmació",
                    JOptionPane.INFORMATION_MESSAGE);
                
                new CanviaPanel(jPModifica, new vistes.panels.PM08Inici());
                
            }else{
                JOptionPane.showMessageDialog(null, "Alguna cosa ha anat malament", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException ex) {
            Logger.getLogger(PM04Modifica.class
                .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btModificarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        new CanviaPanel(jPModifica, new vistes.panels.PM08Inici());
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarMousePressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox<String> cbInstitut;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JTextField cognoms;
    private javax.swing.JTextField email;
    private javax.swing.JTextField imatge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPModifica;
    private javax.swing.JLabel lbCognoms;
    private javax.swing.JLabel lbContrasenya;
    private javax.swing.JLabel lbCorreu;
    private javax.swing.JLabel lbIcona;
    private javax.swing.JLabel lbImatge;
    private javax.swing.JLabel lbInsti;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbMateria;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbUsuari;
    private javax.swing.JTextField nom;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
