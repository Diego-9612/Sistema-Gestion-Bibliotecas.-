package screens;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import textStyleManager.TextStyleManager;

public class ReturnScreen extends javax.swing.JPanel {

    public ReturnScreen() {
        initComponents();
        SetDate();
        initTextStyles();
    }
    
    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    private void initTextStyles() {

        TextStyleManager.textStyleScreensH1(nameText);
        TextStyleManager.textStyleScreensH1(bookText);
        TextStyleManager.textStyleScreensH1(carnetText);
        TextStyleManager.textStyleScreensNegrita(instruccionText);
        TextStyleManager.textStyleDate(dateText);
        
        enterBookID.putClientProperty("JTextField.placeholderText", "  Ingrese el ID del libro.");
        enterCarnetID.putClientProperty("JTextField.placeholderText", "  Ingrese el ID del carnet del usuario.");
        enterName.putClientProperty("JTextField.placeholderText", "  Ingrese el nombre del usuario.");
        
       
       
        
        

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returns = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nameText = new javax.swing.JLabel();
        enterName = new javax.swing.JTextField();
        carnetText = new javax.swing.JLabel();
        enterCarnetID = new javax.swing.JTextField();
        bookText = new javax.swing.JLabel();
        enterBookID = new javax.swing.JTextField();
        returnButton = new javax.swing.JButton();
        instruccionText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        returns.setBackground(new java.awt.Color(255, 255, 255));

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        jSeparator1.setBackground(new java.awt.Color(55, 92, 196));
        jSeparator1.setForeground(new java.awt.Color(55, 92, 196));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        nameText.setText("Nombre");

        enterName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNameActionPerformed(evt);
            }
        });

        carnetText.setText("ID de Carnet ");

        enterCarnetID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));

        bookText.setText("Libro ID");

        enterBookID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterBookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBookIDActionPerformed(evt);
            }
        });

        returnButton.setBackground(new java.awt.Color(55, 92, 196));
        returnButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("Devolver");
        returnButton.setBorder(null);
        returnButton.setBorderPainted(false);
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.setDefaultCapable(false);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        instruccionText.setText("Devoluciones de libros");

        javax.swing.GroupLayout returnsLayout = new javax.swing.GroupLayout(returns);
        returns.setLayout(returnsLayout);
        returnsLayout.setHorizontalGroup(
            returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instruccionText, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addGroup(returnsLayout.createSequentialGroup()
                        .addGroup(returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carnetText, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterCarnetID, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        returnsLayout.setVerticalGroup(
            returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(428, 428, 428))
            .addGroup(returnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(returnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, returnsLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(returnsLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(instruccionText)
                        .addGap(18, 18, 18)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carnetText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterCarnetID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bookText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void enterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNameActionPerformed

    private void enterBookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterBookIDActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookText;
    private javax.swing.JLabel carnetText;
    private javax.swing.JLabel dateText;
    private javax.swing.JTextField enterBookID;
    private javax.swing.JTextField enterCarnetID;
    private javax.swing.JTextField enterName;
    private javax.swing.JLabel instruccionText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameText;
    private javax.swing.JButton returnButton;
    private javax.swing.JPanel returns;
    // End of variables declaration//GEN-END:variables
}
