package textStyleManager;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComponent;

public class TextStyleManager {

    // Tamaño de fuente deseado
    private static final int H1_FONT_SIZE = 41;
    private static final int H2_FONT_SIZE = 26;
    private static final int H3_FONT_SIZE = 15;
    private static final int H4_FONT_SIZE = 17;
    private static final int H5_FONT_SIZE = 12;
  

    // Colores
    public static final Color MAIN_BLUE_COLOR = new Color(55, 92, 196);
    public static final Color WHITE_COLOR = new Color(255, 255, 255);

    // Métodos para aplicar estilos a un componente
    public static void textStyleH1(JComponent component) {
        Font newFont = component.getFont().deriveFont((float) H1_FONT_SIZE);
        component.setFont(newFont);
        component.setForeground(MAIN_BLUE_COLOR);
    }

    public static void textStyleH2(JComponent component) {
        Font newFont = component.getFont().deriveFont((float) H2_FONT_SIZE);
        component.setFont(newFont);
        component.setForeground(WHITE_COLOR);
    }

    public static void textStyleH3(JComponent component) {
        Font newFont = new Font("Lucida Handwriting", Font.ITALIC, H3_FONT_SIZE);
        component.setFont(newFont);
        component.setForeground(WHITE_COLOR);

    }

    public static void textStyleScreensH1(JComponent component) {
        Font newFont = component.getFont().deriveFont((float) H3_FONT_SIZE);
        component.setFont(newFont);
        component.setForeground(MAIN_BLUE_COLOR);

    }

    public static void textStyleScreensNegrita(JComponent component) {
        Font currentFont = component.getFont();
        Font newFont = currentFont.deriveFont(Font.BOLD, (float) H4_FONT_SIZE);
        component.setFont(newFont);
        component.setForeground(MAIN_BLUE_COLOR);
    }

    public static void textStyleScreensH2(JComponent component) {
        Font newFont = component.getFont().deriveFont((float) H5_FONT_SIZE);
        component.setFont(newFont);
        component.setForeground(MAIN_BLUE_COLOR);

    }

    public static void textStyleDate(JComponent component) {
        Font newFont = component.getFont().deriveFont((float) H3_FONT_SIZE);
        component.setFont(newFont);
        component.setForeground(MAIN_BLUE_COLOR);

    }
}
