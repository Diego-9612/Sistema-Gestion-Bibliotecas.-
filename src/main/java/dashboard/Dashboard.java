package dashboard;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import screens.*;
import textStyleManager.TextStyleManager;

/**
 *
 * @author Diego Guerrero
 */
public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        initTextStyles();
        initContent();

    }

    private void initTextStyles() {

        TextStyleManager.textStyleH1(bibliotecaText);
        TextStyleManager.textStyleH2(hnaText);
        TextStyleManager.textStyleH3(mottoText);

    }

    private void initContent() {
        ShowJPanel(new UpBooksScreen());
    }

    public static void ShowJPanel(JPanel p) {
        p.setSize(1020, 470);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        bibliotecaText = new javax.swing.JLabel();
        logo = new javax.swing.JPanel();
        hnaText = new javax.swing.JLabel();
        mottoText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        startButton = new javax.swing.JButton();
        lendButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        usersButton = new javax.swing.JButton();
        booksButton = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(55, 92, 196));

        header.setBackground(new java.awt.Color(255, 255, 255));

        bibliotecaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bibliotecaText.setText("B     I     B     L     I     O     T     E     C     A");

        logo.setBackground(new java.awt.Color(55, 92, 196));

        hnaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hnaText.setText("  HNA.     ELISABETH     GUERRERO     N.      f.m.i.  ");

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hnaText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hnaText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bibliotecaText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bibliotecaText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        mottoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mottoText.setText("Somos   el   cerebro   vivo   de   la   Umariana");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        startButton.setBackground(new java.awt.Color(55, 92, 196));
        startButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("INICIO");
        startButton.setBorder(null);
        startButton.setBorderPainted(false);
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startButton.setIconTextGap(13);
        startButton.setInheritsPopupMenu(true);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        lendButton.setBackground(new java.awt.Color(55, 92, 196));
        lendButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lendButton.setForeground(new java.awt.Color(255, 255, 255));
        lendButton.setText("PRESTAMOS");
        lendButton.setBorder(null);
        lendButton.setBorderPainted(false);
        lendButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lendButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lendButton.setIconTextGap(13);
        lendButton.setInheritsPopupMenu(true);
        lendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lendButtonActionPerformed(evt);
            }
        });

        returnButton.setBackground(new java.awt.Color(55, 92, 196));
        returnButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("DEVOLUCIONES");
        returnButton.setBorder(null);
        returnButton.setBorderPainted(false);
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        returnButton.setIconTextGap(13);
        returnButton.setInheritsPopupMenu(true);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        usersButton.setBackground(new java.awt.Color(55, 92, 196));
        usersButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usersButton.setForeground(new java.awt.Color(255, 255, 255));
        usersButton.setText("USUARIOS");
        usersButton.setBorder(null);
        usersButton.setBorderPainted(false);
        usersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        usersButton.setIconTextGap(13);
        usersButton.setInheritsPopupMenu(true);
        usersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersButtonActionPerformed(evt);
            }
        });

        booksButton.setBackground(new java.awt.Color(55, 92, 196));
        booksButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        booksButton.setForeground(new java.awt.Color(255, 255, 255));
        booksButton.setText("LIBROS");
        booksButton.setBorder(null);
        booksButton.setBorderPainted(false);
        booksButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        booksButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        booksButton.setIconTextGap(13);
        booksButton.setInheritsPopupMenu(true);
        booksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksButtonActionPerformed(evt);
            }
        });

        reportsButton.setBackground(new java.awt.Color(55, 92, 196));
        reportsButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        reportsButton.setForeground(new java.awt.Color(255, 255, 255));
        reportsButton.setText("REPORTES");
        reportsButton.setBorder(null);
        reportsButton.setBorderPainted(false);
        reportsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reportsButton.setIconTextGap(13);
        reportsButton.setInheritsPopupMenu(true);
        reportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BuhoLogo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(booksButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mottoText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(138, 138, 138))))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 85, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mottoText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(booksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(1020, 470));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lendButtonActionPerformed
        ShowJPanel(new LendingScreen());
    }//GEN-LAST:event_lendButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        ShowJPanel(new StartScreen());
    }//GEN-LAST:event_startButtonActionPerformed

    private void usersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersButtonActionPerformed
        ShowJPanel(new UserScreen());
    }//GEN-LAST:event_usersButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        ShowJPanel(new ReturnScreen());
    }//GEN-LAST:event_returnButtonActionPerformed

    private void booksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksButtonActionPerformed
        ShowJPanel(new BookScreen());
    }//GEN-LAST:event_booksButtonActionPerformed

    private void reportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsButtonActionPerformed
        ShowJPanel(new ReportScreen());
    }//GEN-LAST:event_reportsButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel bibliotecaText;
    private javax.swing.JButton booksButton;
    private static javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JLabel hnaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton lendButton;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel mottoText;
    private javax.swing.JButton reportsButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton startButton;
    private javax.swing.JButton usersButton;
    // End of variables declaration//GEN-END:variables
}
