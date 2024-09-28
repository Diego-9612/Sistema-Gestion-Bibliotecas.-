package screens;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import models.Books;
import services.BooksRegistrationService;
import textStyleManager.TextStyleManager;

public class UpBooksScreen extends javax.swing.JPanel {

    boolean isEdition = false;
    Books bookEdition = new Books();

    public UpBooksScreen() {
        initComponents();
        SetDate();
        initTextStyles();
    }

    public UpBooksScreen(Books book) {
        initComponents();
        SetDate();
        isEdition = true;
        bookEdition = book;
        bookData(bookEdition);
        initTextStyles();
    }

    private void bookData(Books book) {
        enterTitle.setText(book.getTitle());
        // Maneja la conversión de Date a String
        Date publicationDate = book.getPublicationDate();
        if (publicationDate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(publicationDate);
            enterPublicationDate.setText(formattedDate);
        } else {
            enterPublicationDate.setText("");
        }

        enterAutor.setText(book.getAuthor());
        enterCategory.setText(book.getCategory());
        enterEdition.setText(String.valueOf(book.getEdition()));
        enterLenguage.setText(book.getLanguage());
        enterPages.setText(String.valueOf(book.getPages()));
        enterDescription.setText(book.getDescription());
        enterSpecimens.setText(String.valueOf(book.getSpecimens()));
        enterStock.setText(String.valueOf(book.getStock()));
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    private void initTextStyles() {

        TextStyleManager.textStyleScreensH1(titleText);
        TextStyleManager.textStyleScreensH1(publicationDateText);
        TextStyleManager.textStyleScreensH1(autorText);
        TextStyleManager.textStyleScreensH1(categoryText);
        TextStyleManager.textStyleScreensH1(editionText);
        TextStyleManager.textStyleScreensH1(languageText);
        TextStyleManager.textStyleScreensH1(pagesText);
        TextStyleManager.textStyleScreensH1(descriptionText);
        TextStyleManager.textStyleScreensH1(stockText);
        TextStyleManager.textStyleScreensH1(availableText);
        TextStyleManager.textStyleScreensH1(specimensText);
        TextStyleManager.textStyleScreensNegrita(instruccionText);
        TextStyleManager.textStyleDate(dateText);

        enterTitle.putClientProperty("JTextField.placeholderText", "  Ingrese el título del libro");
        enterPublicationDate.putClientProperty("JTextField.placeholderText", "  Ingrese la de publicación del libro.");
        enterAutor.putClientProperty("JTextField.placeholderText", "  Ingrese el autor del libro.");
        enterCategory.putClientProperty("JTextField.placeholderText", "  Ingrese la categoría del libro.");
        enterEdition.putClientProperty("JTextField.placeholderText", "  Ingrese la editorial del libro.");
        enterLenguage.putClientProperty("JTextField.placeholderText", "  Ingrese el idioma del libro.");
        enterPages.putClientProperty("JTextField.placeholderText", "  Ingrese las páginas totales del libro.");
        enterDescription.putClientProperty("JTextField.placeholderText", "  Ingrese la descripción del libro.");
        enterStock.putClientProperty("JTextField.placeholderText", "  Ingrese el stock total del libro.");
        enterAvailable.putClientProperty("JTextField.placeholderText", "  Ingrese el númeor de libros disponibles.");
        enterSpecimens.putClientProperty("JTextField.placeholderText", "  Ingrese el número de ejemplares.");

        if (isEdition) {
            instruccionText.setText("Editar Libro");
        }
        if (bookEdition != null) {
            enterTitle.setText(bookEdition.getTitle());
            // Maneja la conversión de Date a String
            Date publicationDate = bookEdition.getPublicationDate();
            if (publicationDate != null) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String formattedDate = dateFormat.format(publicationDate);
                enterPublicationDate.setText(formattedDate);
            } else {
                enterPublicationDate.setText("");
            }

            enterAutor.setText(bookEdition.getAuthor());
            enterCategory.setText(bookEdition.getCategory());
            enterEdition.setText(String.valueOf(bookEdition.getEdition()));
            enterLenguage.setText(bookEdition.getLanguage());
            enterPages.setText(String.valueOf(bookEdition.getPages()));
            enterDescription.setText(bookEdition.getDescription());
            enterSpecimens.setText(String.valueOf(bookEdition.getSpecimens()));
            enterStock.setText(String.valueOf(bookEdition.getStock()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpBooks = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        instruccionText = new javax.swing.JLabel();
        titleText = new javax.swing.JLabel();
        enterTitle = new javax.swing.JTextField();
        publicationDateText = new javax.swing.JLabel();
        enterPublicationDate = new javax.swing.JTextField();
        autorText = new javax.swing.JLabel();
        enterAutor = new javax.swing.JTextField();
        categoryText = new javax.swing.JLabel();
        enterCategory = new javax.swing.JTextField();
        editionText = new javax.swing.JLabel();
        enterEdition = new javax.swing.JTextField();
        languageText = new javax.swing.JLabel();
        enterLenguage = new javax.swing.JTextField();
        pagesText = new javax.swing.JLabel();
        enterPages = new javax.swing.JTextField();
        descriptionText = new javax.swing.JLabel();
        enterDescription = new javax.swing.JTextField();
        stockText = new javax.swing.JLabel();
        enterStock = new javax.swing.JTextField();
        availableText = new javax.swing.JLabel();
        enterAvailable = new javax.swing.JTextField();
        specimensText = new javax.swing.JLabel();
        enterSpecimens = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        saveButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        UpBooks.setBackground(new java.awt.Color(255, 255, 255));

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        instruccionText.setText("Subir nuevo libro");

        titleText.setText("Titulo");

        enterTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterTitleActionPerformed(evt);
            }
        });

        publicationDateText.setText("Fecha de publicacion");

        enterPublicationDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));

        autorText.setText("Autor ");

        enterAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAutorActionPerformed(evt);
            }
        });

        categoryText.setText("Categoria ");

        enterCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterCategoryActionPerformed(evt);
            }
        });

        editionText.setText("Edicion");

        enterEdition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterEditionActionPerformed(evt);
            }
        });

        languageText.setText("Idioma");

        enterLenguage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterLenguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterLenguageActionPerformed(evt);
            }
        });

        pagesText.setText("Paginas");

        enterPages.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterPages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPagesActionPerformed(evt);
            }
        });

        descriptionText.setText("Descripcion");

        enterDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterDescriptionActionPerformed(evt);
            }
        });

        stockText.setText("Stock");

        enterStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterStockActionPerformed(evt);
            }
        });

        availableText.setText("Disponibles ");

        enterAvailable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAvailableActionPerformed(evt);
            }
        });

        specimensText.setText("Ejemplares ");

        enterSpecimens.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 92, 196)));
        enterSpecimens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterSpecimensActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(55, 92, 196));
        jSeparator1.setForeground(new java.awt.Color(55, 92, 196));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        saveButton.setBackground(new java.awt.Color(55, 92, 196));
        saveButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Guardar");
        saveButton.setBorder(null);
        saveButton.setBorderPainted(false);
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.setDefaultCapable(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(55, 92, 196));
        jSeparator2.setForeground(new java.awt.Color(55, 92, 196));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout UpBooksLayout = new javax.swing.GroupLayout(UpBooks);
        UpBooks.setLayout(UpBooksLayout);
        UpBooksLayout.setHorizontalGroup(
            UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpBooksLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(enterAutor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterPublicationDate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instruccionText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterCategory)
                    .addComponent(titleText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(publicationDateText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(autorText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterTitle, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enterLenguage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(enterPages, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descriptionText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(languageText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pagesText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterEdition))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpBooksLayout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(UpBooksLayout.createSequentialGroup()
                        .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(specimensText, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availableText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(enterSpecimens)
                            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enterStock))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        UpBooksLayout.setVerticalGroup(
            UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpBooksLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpBooksLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(UpBooksLayout.createSequentialGroup()
                                .addComponent(instruccionText)
                                .addGap(30, 30, 30)
                                .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(publicationDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterPublicationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(autorText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(categoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpBooksLayout.createSequentialGroup()
                        .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UpBooksLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(editionText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpBooksLayout.createSequentialGroup()
                                .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(stockText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(languageText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availableText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterLenguage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterAvailable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pagesText, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(specimensText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UpBooksLayout.createSequentialGroup()
                                .addComponent(enterPages, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(enterSpecimens, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(UpBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(175, 175, 175))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpBooks, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterTitleActionPerformed

    private void enterCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterCategoryActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        String tituloLibro = enterTitle.getText();
        String añoPub = enterPublicationDate.getText();
        String autor = enterAutor.getText();
        String categoria = enterCategory.getText();
        String edicion = enterEdition.getText();
        String lenguaje = enterLenguage.getText();
        String paguinas = enterPages.getText();
        String descripcion = enterDescription.getText();
        String ejemplares = enterSpecimens.getText();
        String stock = enterStock.getText();

        BooksRegistrationService booksService = new BooksRegistrationService();

        try {
            bookEdition.setTitle(tituloLibro);
//            java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd"); // Ajusta el formato según tu entrada
//            java.util.Date publicationDate = dateFormat.parse(añoPub);
//            bookEdition.setPublicationDate(new java.sql.Date(publicationDate.getTime()));
            bookEdition.setAuthor(autor);
            bookEdition.setCategory(categoria);
            int edition_ = Integer.parseInt(edicion);
            bookEdition.setEdition(edition_);
            bookEdition.setLanguage(lenguaje);
            int pages_ = Integer.parseInt(paguinas);
            bookEdition.setPages(pages_);
            bookEdition.setDescription(descripcion);
            int specimens_ = Integer.parseInt(ejemplares);
            bookEdition.setSpecimens(specimens_);
            int stock_ = Integer.parseInt(stock);
            bookEdition.setStock(stock_);

            // Llamar al método que decide si registrar o modificar
            booksService.saveUpdateBook(this, bookEdition);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_saveButtonActionPerformed

    private void enterAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAutorActionPerformed

    private void enterDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterDescriptionActionPerformed

    private void enterEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterEditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterEditionActionPerformed

    private void enterLenguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterLenguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterLenguageActionPerformed

    private void enterPagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterPagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterPagesActionPerformed

    private void enterStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterStockActionPerformed

    private void enterSpecimensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterSpecimensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterSpecimensActionPerformed

    private void enterAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterAvailableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UpBooks;
    private javax.swing.JLabel autorText;
    private javax.swing.JLabel availableText;
    private javax.swing.JLabel categoryText;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel descriptionText;
    private javax.swing.JLabel editionText;
    private javax.swing.JTextField enterAutor;
    private javax.swing.JTextField enterAvailable;
    private javax.swing.JTextField enterCategory;
    private javax.swing.JTextField enterDescription;
    private javax.swing.JTextField enterEdition;
    private javax.swing.JTextField enterLenguage;
    private javax.swing.JTextField enterPages;
    private javax.swing.JTextField enterPublicationDate;
    private javax.swing.JTextField enterSpecimens;
    private javax.swing.JTextField enterStock;
    private javax.swing.JTextField enterTitle;
    private javax.swing.JLabel instruccionText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel languageText;
    private javax.swing.JLabel pagesText;
    private javax.swing.JLabel publicationDateText;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel specimensText;
    private javax.swing.JLabel stockText;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables
}
