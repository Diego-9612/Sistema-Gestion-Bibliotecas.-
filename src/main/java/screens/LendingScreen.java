package screens;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import textStyleManager.TextStyleManager;

public class LendingScreen extends javax.swing.JPanel {

    public LendingScreen() {
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
        TextStyleManager.textStyleScreensH1(BookIDText);
        TextStyleManager.textStyleScreensH1(carnetIDText);
        TextStyleManager.textStyleDate(dateText);
        TextStyleManager.textStyleScreensNegrita(InstruccionText);

        enterBook.putClientProperty("JTextField.placeholderText", "  Ingrese el ID del libro.");
        enterCarnetID.putClientProperty("JTextField.placeholderText", "  Ingrese el ID del carnet del usuario.");
        enterName.putClientProperty("JTextField.placeholderText", "  Ingrese el nombre del usuario.");
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lendings = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nameText = new javax.swing.JLabel();
        enterName = new javax.swing.JTextField();
        carnetIDText = new javax.swing.JLabel();
        enterCarnetID = new javax.swing.JTextField();
        BookIDText = new javax.swing.JLabel();
        enterBook = new javax.swing.JTextField();
        lendButton = new javax.swing.JButton();
        InstruccionText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lendings.setBackground(new java.awt.Color(255, 255, 255));

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        jSeparator1.setBackground(new java.awt.Color(55, 92, 196));
        jSeparator1.setForeground(new java.awt.Color(55, 92, 196));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        nameText.setText("Nombre del Usuario");

        enterName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNameActionPerformed(evt);
            }
        });

        carnetIDText.setText("ID de Carnet ");

        enterCarnetID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));

        BookIDText.setText("Libro ID");

        enterBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBookActionPerformed(evt);
            }
        });

        lendButton.setBackground(new java.awt.Color(55, 92, 196));
        lendButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lendButton.setForeground(new java.awt.Color(255, 255, 255));
        lendButton.setText("Prestar");
        lendButton.setBorder(null);
        lendButton.setBorderPainted(false);
        lendButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lendButton.setDefaultCapable(false);
        lendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lendButtonActionPerformed(evt);
            }
        });

        InstruccionText.setText("Prestamos");

        javax.swing.GroupLayout lendingsLayout = new javax.swing.GroupLayout(lendings);
        lendings.setLayout(lendingsLayout);
        lendingsLayout.setHorizontalGroup(
            lendingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lendingsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(InstruccionText, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(160, 160, 160)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(lendingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lendingsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(lendingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lendingsLayout.createSequentialGroup()
                                .addComponent(BookIDText, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addGap(239, 239, 239))
                            .addGroup(lendingsLayout.createSequentialGroup()
                                .addGroup(lendingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(enterBook)
                                    .addComponent(enterCarnetID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(carnetIDText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enterName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lendingsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        lendingsLayout.setVerticalGroup(
            lendingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lendingsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carnetIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterCarnetID, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BookIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterBook, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(lendingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(lendingsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(InstruccionText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        enterBook.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lendings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lendings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNameActionPerformed

    private void enterBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterBookActionPerformed

    private void lendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lendButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lendButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookIDText;
    private javax.swing.JLabel InstruccionText;
    private javax.swing.JLabel carnetIDText;
    private javax.swing.JLabel dateText;
    private javax.swing.JTextField enterBook;
    private javax.swing.JTextField enterCarnetID;
    private javax.swing.JTextField enterName;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton lendButton;
    private javax.swing.JPanel lendings;
    private javax.swing.JLabel nameText;
    // End of variables declaration//GEN-END:variables
}
