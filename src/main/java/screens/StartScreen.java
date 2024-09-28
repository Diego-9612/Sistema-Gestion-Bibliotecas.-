package screens;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import textStyleManager.TextStyleManager;

public class StartScreen extends javax.swing.JPanel {

    public StartScreen() {
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

        TextStyleManager.textStyleDate(dateText);
        TextStyleManager.textStyleScreensNegrita(bienvenida);
        TextStyleManager.textStyleScreensNegrita(bienvenida2);
        TextStyleManager.textStyleScreensH2(linea1Text);
        TextStyleManager.textStyleScreensH2(linea2Text);
        TextStyleManager.textStyleScreensH2(linea3Text);
        TextStyleManager.textStyleScreensH2(linea4Text);
        TextStyleManager.textStyleScreensH2(linea5Text);
        TextStyleManager.textStyleScreensH2(linea6Text);
        TextStyleManager.textStyleScreensH2(linea7Text);
        TextStyleManager.textStyleScreensH2(linea8Text);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        bienvenida = new javax.swing.JLabel();
        bienvenida2 = new javax.swing.JLabel();
        linea1Text = new javax.swing.JLabel();
        linea2Text = new javax.swing.JLabel();
        linea3Text = new javax.swing.JLabel();
        linea4Text = new javax.swing.JLabel();
        linea5Text = new javax.swing.JLabel();
        linea6Text = new javax.swing.JLabel();
        linea7Text = new javax.swing.JLabel();
        linea8Text = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        start.setBackground(new java.awt.Color(255, 255, 255));

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        bienvenida.setText("Bienvenido al Sistema de Gestión para la Biblioteca de la Universidad ");

        bienvenida2.setText("Hermana Elisabeth Guerrero");

        linea1Text.setText("Nuestro sistema está diseñado para la Biblioteca de la Universidad Mariana, permitiéndole gestionar");

        linea2Text.setText("y administrar de manera óptima y sencilla el flujo de préstamos y devoluciones de libros. Con esta ");

        linea3Text.setText("herramienta, podrá llevar un control completo y detallado de su biblioteca. Las funcionalidades ");

        linea4Text.setText("específicas incluyen:");

        linea5Text.setText("- Préstamos de Libros: Registre y administre los préstamos de libros de forma eficiente.");

        linea6Text.setText("- Devoluciones de Libros: Gestione las devoluciones de libros de manera fácil y rápida");

        linea7Text.setText("- Registro de Usuarios y Libros Nuevos: Añada nuevos usuarios y libros al sistema con facilidad.");

        linea8Text.setText("- Nuestra plataforma le proporcionará las herramientas necesarias para realizar tareas específicas.");

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startLayout.createSequentialGroup()
                        .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(dateText)
                        .addGap(17, 17, 17))
                    .addGroup(startLayout.createSequentialGroup()
                        .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linea8Text)
                            .addComponent(linea7Text)
                            .addComponent(linea6Text)
                            .addComponent(linea5Text)
                            .addComponent(linea4Text)
                            .addComponent(linea3Text)
                            .addComponent(linea2Text)
                            .addComponent(linea1Text)
                            .addGroup(startLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(bienvenida2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateText)
                    .addComponent(bienvenida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bienvenida2)
                .addGap(50, 50, 50)
                .addComponent(linea1Text)
                .addGap(18, 18, 18)
                .addComponent(linea2Text)
                .addGap(18, 18, 18)
                .addComponent(linea3Text)
                .addGap(18, 18, 18)
                .addComponent(linea4Text)
                .addGap(18, 18, 18)
                .addComponent(linea5Text)
                .addGap(18, 18, 18)
                .addComponent(linea6Text)
                .addGap(18, 18, 18)
                .addComponent(linea7Text)
                .addGap(18, 18, 18)
                .addComponent(linea8Text)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(start, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JLabel bienvenida2;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel linea1Text;
    private javax.swing.JLabel linea2Text;
    private javax.swing.JLabel linea3Text;
    private javax.swing.JLabel linea4Text;
    private javax.swing.JLabel linea5Text;
    private javax.swing.JLabel linea6Text;
    private javax.swing.JLabel linea7Text;
    private javax.swing.JLabel linea8Text;
    private javax.swing.JPanel start;
    // End of variables declaration//GEN-END:variables
}
