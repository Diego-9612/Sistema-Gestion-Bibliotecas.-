package screens;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import models.Users;
import services.UsersRegistrationService;
import textStyleManager.TextStyleManager;

public class UpUsersScreen extends javax.swing.JPanel {

    boolean isEdition = false;
    Users userEdition = new Users();

    public UpUsersScreen() {
        initComponents();
        SetDate();
        initTextStyles();
    }

    public UpUsersScreen(Users user) {
        initComponents();
        SetDate();
        isEdition = true;
        userEdition = user;
        userData(userEdition);
        initTextStyles();
    }

    private void userData(Users user) {
        enterNames.setText(user.getNames());
        enterSuername.setText(user.getSurname());
        enterSurname2.setText(user.getSecondSurname());
        enterCollege.setText(user.getCollege());
        enterNumberCarnet.setText(user.getNumberCarnet());
        enterAddress.setText(user.getAddress());
        enterPhone.setText(user.getPhone());
        enterEmail.setText(user.getEmail());
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    private void initTextStyles() {

        TextStyleManager.textStyleScreensH1(namesText);
        TextStyleManager.textStyleScreensH1(collegeText);
        TextStyleManager.textStyleScreensH1(surnameText);
        TextStyleManager.textStyleScreensNegrita(instruccionText);
        TextStyleManager.textStyleDate(dateText);
        TextStyleManager.textStyleScreensH1(surname2Text);
        TextStyleManager.textStyleScreensH1(addressText);
        TextStyleManager.textStyleScreensH1(emailText);
        TextStyleManager.textStyleScreensH1(numberCarnetText);
        TextStyleManager.textStyleScreensH1(phoneText);

        enterNames.putClientProperty("JTextField.placeholderText", "  Ingrese el Nombre Completo del Usuario.");
        enterSuername.putClientProperty("JTextField.placeholderText", "  Ingrese el Apellido Paterno del Usuario.");
        enterSurname2.putClientProperty("JTextField.placeholderText", "  Ingrese el Apellido Materno del Usuario.");
        enterAddress.putClientProperty("JTextField.placeholderText", "  Ingrese la Direccion de Residencia del Usuario.");
        enterPhone.putClientProperty("JTextField.placeholderText", "  Ingrese el Numero de Celular del Usuario.");
        enterCollege.putClientProperty("JTextField.placeholderText", "  Ingrese el Programa al cual Pertenece el Usuario.");
        enterEmail.putClientProperty("JTextField.placeholderText", "  Ingrese el Correo Electronico Institucional del Usuario.");
        enterNumberCarnet.putClientProperty("JTextField.placeholderText", " Ingrese el Numero de Carnet Estudiantil.");

        if (isEdition) {
            instruccionText.setText("Editar Usuario");
            createButton.setText("Guardar");
        }
        if (userEdition != null) {
            enterNames.setText(userEdition.getNames());
            enterSuername.setText(userEdition.getSurname());
            enterSurname2.setText(userEdition.getSecondSurname());
            enterCollege.setText(userEdition.getCollege());
            enterNumberCarnet.setText(userEdition.getNumberCarnet());
            enterAddress.setText(userEdition.getAddress());
            enterPhone.setText(userEdition.getPhone());
            enterEmail.setText(userEdition.getEmail());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upUsers = new javax.swing.JPanel();
        instruccionText = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        namesText = new javax.swing.JLabel();
        enterNames = new javax.swing.JTextField();
        surnameText = new javax.swing.JLabel();
        enterSuername = new javax.swing.JTextField();
        surname2Text = new javax.swing.JLabel();
        enterSurname2 = new javax.swing.JTextField();
        collegeText = new javax.swing.JLabel();
        enterCollege = new javax.swing.JTextField();
        numberCarnetText = new javax.swing.JLabel();
        enterNumberCarnet = new javax.swing.JTextField();
        addressText = new javax.swing.JLabel();
        enterAddress = new javax.swing.JTextField();
        phoneText = new javax.swing.JLabel();
        enterPhone = new javax.swing.JTextField();
        emailText = new javax.swing.JLabel();
        enterEmail = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        upUsers.setBackground(new java.awt.Color(255, 255, 255));

        instruccionText.setText("Registrar nuevo usuario");

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        jSeparator1.setBackground(new java.awt.Color(55, 92, 196));
        jSeparator1.setForeground(new java.awt.Color(55, 92, 196));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        namesText.setText("Nombres");

        enterNames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNamesActionPerformed(evt);
            }
        });

        surnameText.setText("Primer Apellido");

        enterSuername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));

        surname2Text.setText("Segundo Apellido");

        enterSurname2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterSurname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterSurname2ActionPerformed(evt);
            }
        });

        collegeText.setText("Carrera ");

        enterCollege.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterCollegeActionPerformed(evt);
            }
        });

        numberCarnetText.setText("Numero de carnet ");

        enterNumberCarnet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterNumberCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNumberCarnetActionPerformed(evt);
            }
        });

        addressText.setText("Direccion ");

        enterAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAddressActionPerformed(evt);
            }
        });

        phoneText.setText("Telefono ");

        enterPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPhoneActionPerformed(evt);
            }
        });

        emailText.setText("Correo Electronico");

        enterEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterEmailActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(55, 92, 196));
        createButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Registrar");
        createButton.setBorder(null);
        createButton.setBorderPainted(false);
        createButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createButton.setDefaultCapable(false);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout upUsersLayout = new javax.swing.GroupLayout(upUsers);
        upUsers.setLayout(upUsersLayout);
        upUsersLayout.setHorizontalGroup(
            upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upUsersLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instruccionText, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addGroup(upUsersLayout.createSequentialGroup()
                        .addGroup(upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namesText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(enterNames)
                                .addComponent(enterSuername)
                                .addComponent(surnameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterSurname2)
                                .addComponent(surname2Text, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(collegeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterCollege)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(upUsersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, upUsersLayout.createSequentialGroup()
                        .addGroup(upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enterEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, upUsersLayout.createSequentialGroup()
                                .addGroup(upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterNumberCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberCarnetText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        upUsersLayout.setVerticalGroup(
            upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upUsersLayout.createSequentialGroup()
                        .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namesText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enterNames, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(surnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterSuername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(surname2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterSurname2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(collegeText, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upUsersLayout.createSequentialGroup()
                        .addGroup(upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(upUsersLayout.createSequentialGroup()
                                .addGroup(upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(upUsersLayout.createSequentialGroup()
                                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(upUsersLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(numberCarnetText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(upUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(enterNumberCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))
                                .addComponent(enterAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNamesActionPerformed

    private void enterCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterCollegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterCollegeActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed

        String nombres = enterNames.getText();
        String primerApellido = enterSuername.getText();
        String segundoApellido = enterSurname2.getText();
        String carrera = enterCollege.getText();
        String numeroCarnet = enterNumberCarnet.getText();
        String direccion = enterAddress.getText();
        String celular = enterPhone.getText();
        String correo = enterEmail.getText();

        UsersRegistrationService userService = new UsersRegistrationService();

        try {
            userEdition.setNames(nombres);
            userEdition.setSurname(primerApellido);
            userEdition.setSecondSurname(segundoApellido);
            userEdition.setCollege(carrera);
            userEdition.setNumberCarnet(numeroCarnet);
            userEdition.setAddress(direccion);
            userEdition.setPhone(celular);
            userEdition.setEmail(correo);

            // Llamar al método que decide si registrar o modificar
            userService.saveUpdateUser(this, userEdition);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_createButtonActionPerformed

    private void enterSurname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterSurname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterSurname2ActionPerformed

    private void enterEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterEmailActionPerformed

    private void enterNumberCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNumberCarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNumberCarnetActionPerformed

    private void enterAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAddressActionPerformed

    private void enterPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterPhoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressText;
    private javax.swing.JLabel collegeText;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel emailText;
    private javax.swing.JTextField enterAddress;
    private javax.swing.JTextField enterCollege;
    private javax.swing.JTextField enterEmail;
    private javax.swing.JTextField enterNames;
    private javax.swing.JTextField enterNumberCarnet;
    private javax.swing.JTextField enterPhone;
    private javax.swing.JTextField enterSuername;
    private javax.swing.JTextField enterSurname2;
    private javax.swing.JLabel instruccionText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel namesText;
    private javax.swing.JLabel numberCarnetText;
    private javax.swing.JLabel phoneText;
    private javax.swing.JLabel surname2Text;
    private javax.swing.JLabel surnameText;
    private javax.swing.JPanel upUsers;
    // End of variables declaration//GEN-END:variables
}
