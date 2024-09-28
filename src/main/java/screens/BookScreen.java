package screens;

import ImplDAO.BooksImpl;
import interfacesDAO.BooksInterface;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import textStyleManager.TextStyleManager;

public class BookScreen extends javax.swing.JPanel {

    public BookScreen() {
        initComponents();
        SetDate();
        initTextStyles();
//        loadBooks();
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    private void initTextStyles() {

        TextStyleManager.textStyleScreensNegrita(instruccionText);
        TextStyleManager.textStyleDate(dateText);
        enterBookName.putClientProperty("JTextField.placeholderText", "  Ingrese el título del libro a buscar.");

    }
    
//    private void loadBooks() {
//
//        try {
//            BooksInterface createList = new BooksImpl();
//            DefaultTableModel modelTable = (DefaultTableModel) booksTable.getModel();
//            createList.listBooks("").forEach(u -> {
//                modelTable.addRow(new Object[]{
//                    u.get(),
//                    u.getNames(),
//                    u.getSurname(),
//                    u.getSecondSurname(),
//                    u.getCollege(),
//                    u.getNumberCarnet(),
//                    u.getAddress(),
//                    u.getPhone(),
//                    u.getEmail(),
//                    u.getSanctions(),
//                    u.getSanctionsMoney()});
//            });
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//
//        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returns = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        enterBookName = new javax.swing.JTextField();
        returnButton = new javax.swing.JButton();
        instruccionText = new javax.swing.JLabel();
        jScrollPanelBooks = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        returns.setBackground(new java.awt.Color(255, 255, 255));

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        enterBookName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterBookName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        enterBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBookNameActionPerformed(evt);
            }
        });

        returnButton.setBackground(new java.awt.Color(55, 92, 196));
        returnButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("Buscar");
        returnButton.setBorder(null);
        returnButton.setBorderPainted(false);
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.setDefaultCapable(false);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        instruccionText.setText("Libros Disponibles");

        jScrollPanelBooks.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPanelBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));

        booksTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Fecha de Pub", "Autor", "Categoria", "Edicion ", "Idioma", "Paginas", "Descripcion ", "Ejemplares ", "Stock", "Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booksTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        booksTable.setInheritsPopupMenu(true);
        booksTable.setName(""); // NOI18N
        booksTable.setPreferredSize(new java.awt.Dimension(900, 0));
        booksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                booksTableMousePressed(evt);
            }
        });
        jScrollPanelBooks.setViewportView(booksTable);

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

        javax.swing.GroupLayout returnsLayout = new javax.swing.GroupLayout(returns);
        returns.setLayout(returnsLayout);
        returnsLayout.setHorizontalGroup(
            returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnsLayout.createSequentialGroup()
                .addGroup(returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(returnsLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(enterBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(returnsLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnsLayout.createSequentialGroup()
                                .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(returnsLayout.createSequentialGroup()
                                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPanelBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        returnsLayout.setVerticalGroup(
            returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnsLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instruccionText)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPanelBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnButtonActionPerformed

    private void enterBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterBookNameActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
//        BooksInterface deleteUserID = new BooksImpl();
//        DefaultTableModel modelTable = (DefaultTableModel) booksTable.getModel();
//        if (booksTable.getSelectedRow() < 1) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Debe Seleccionar Uno o Varios Libros  \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//        } else {
//
//            for (int i : booksTable.getSelectedRows()) {
//                try {
//                    deleteBooksID.deleteBook((int) booksTable.getValueAt(i, 0));
//                    modelTable.removeRow(i);
//                    javax.swing.JOptionPane.showMessageDialog(this, "Usuario Eliminado con EXITO \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void booksTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_booksTableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booksTable;
    private javax.swing.JLabel dateText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField enterBookName;
    private javax.swing.JLabel instruccionText;
    private javax.swing.JScrollPane jScrollPanelBooks;
    private javax.swing.JButton newButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JPanel returns;
    // End of variables declaration//GEN-END:variables
}
