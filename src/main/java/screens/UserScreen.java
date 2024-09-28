package screens;

import ImplDAO.UsersImpl;
import dashboard.Dashboard;
import interfacesDAO.UsersInterface;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import textStyleManager.TextStyleManager;

public class UserScreen extends javax.swing.JPanel {

    public UserScreen() {
        initComponents();
        SetDate();
        initTextStyles();
        loadUsers();
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    private void initTextStyles() {

        TextStyleManager.textStyleScreensNegrita(instruccionText);
        TextStyleManager.textStyleDate(dateText);

        enterNameUser.putClientProperty("JTextField.placeholderText", "  Ingrese los Nombres del Usuario a Buscar.");

    }

    private void loadUsers() {

        try {
            UsersInterface createList = new UsersImpl();
            DefaultTableModel modelTable = (DefaultTableModel) usersTable.getModel();
            createList.listUsers("").forEach(u -> {
                modelTable.addRow(new Object[]{
                    u.getUserID(),
                    u.getNames(),
                    u.getSurname(),
                    u.getSecondSurname(),
                    u.getCollege(),
                    u.getNumberCarnet(),
                    u.getAddress(),
                    u.getPhone(),
                    u.getEmail(),
                    u.getSanctions(),
                    u.getSanctionsMoney()});
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        users = new javax.swing.JPanel();
        jScrollPanelUsers = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        instruccionText = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        enterNameUser = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        users.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPanelUsers.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPanelUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Primer Apellido ", "Segundo Apellido ", "Carrera", "N° Carnet ", "Dirrecion ", "Telefono ", "Correro"
            }
        ));
        jScrollPanelUsers.setViewportView(usersTable);

        instruccionText.setText("Usuarios Registrados");

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        enterNameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNameUserActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(55, 92, 196));
        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Buscar");
        searchButton.setBorder(null);
        searchButton.setBorderPainted(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setDefaultCapable(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(55, 92, 196));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Borrar");
        deleteButton.setBorder(null);
        deleteButton.setBorderPainted(false);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setDefaultCapable(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        newButton.setBackground(new java.awt.Color(55, 92, 196));
        newButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        newButton.setForeground(new java.awt.Color(255, 255, 255));
        newButton.setText("Nuevo");
        newButton.setBorder(null);
        newButton.setBorderPainted(false);
        newButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newButton.setDefaultCapable(false);
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(55, 92, 196));
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Editar");
        editButton.setBorder(null);
        editButton.setBorderPainted(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.setDefaultCapable(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usersLayout = new javax.swing.GroupLayout(users);
        users.setLayout(usersLayout);
        usersLayout.setHorizontalGroup(
            usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersLayout.createSequentialGroup()
                .addGroup(usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(enterNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(usersLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, usersLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(usersLayout.createSequentialGroup()
                                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPanelUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        usersLayout.setVerticalGroup(
            usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instruccionText)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPanelUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        try {
            String searchUser = enterNameUser.getText();

            if (searchUser.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ingresa el Nombre del Usuario a Buscar", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                enterNameUser.requestFocus();
                return;
            }
            UsersInterface createList = new UsersImpl();
            DefaultTableModel modelTable = (DefaultTableModel) usersTable.getModel();
            modelTable.setRowCount(0);
            createList.listUsers(searchUser).forEach(u -> {
                modelTable.addRow(new Object[]{
                    u.getUserID(),
                    u.getNames(),
                    u.getSurname(),
                    u.getSecondSurname(),
                    u.getCollege(),
                    u.getNumberCarnet(),
                    u.getAddress(),
                    u.getPhone(),
                    u.getEmail(),
                    u.getSanctions(),
                    u.getSanctionsMoney()});
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void enterNameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNameUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNameUserActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        UsersInterface deleteUserID = new UsersImpl();
        DefaultTableModel modelTable = (DefaultTableModel) usersTable.getModel();
        if (usersTable.getSelectedRow() < 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe Seleccionar Uno o Varios Usuarios  \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {

            for (int i : usersTable.getSelectedRows()) {
                try {
                    deleteUserID.deleteUser((int) usersTable.getValueAt(i, 0));
                    modelTable.removeRow(i);
                    javax.swing.JOptionPane.showMessageDialog(this, "Usuario Eliminado con EXITO \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        Dashboard.ShowJPanel(new UpUsersScreen());
    }//GEN-LAST:event_newButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (usersTable.getSelectedRow() > -1) {
            try {
                int userId = (int) usersTable.getValueAt(usersTable.getSelectedRow(), 0);
                UsersInterface userDao = new UsersImpl();
                Dashboard.ShowJPanel(new UpUsersScreen(userDao.getUserByID(userId)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe Seleccionar un Usuario para Modificar \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_editButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField enterNameUser;
    private javax.swing.JLabel instruccionText;
    private javax.swing.JScrollPane jScrollPanelUsers;
    private javax.swing.JButton newButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel users;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
