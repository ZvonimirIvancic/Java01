/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hr.algebra.user.view;

import hr.algebra.dal.Repository;
import hr.algebra.dal.RepositoryFactory;
import hr.algebra.model.Movie;
import hr.algebra.utilities.FileUtils;
import hr.algebra.utilities.IconUtils;
import hr.algebra.utilities.MessageUtils;
import hr.algebra.model.MovieTableModel;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author zvonimir.ZI.ivancic
 */
public class EditMoviesPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditMoviesPanel
     */
    public EditMoviesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spMovies = new javax.swing.JScrollPane();
        tbMovies = new javax.swing.JTable();
        lbIcon = new javax.swing.JLabel();
        btnChoose = new javax.swing.JButton();
        tfPicturePath = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        tfOriginalTitle = new javax.swing.JTextField();
        lbOriginalTitle = new javax.swing.JLabel();
        tfDuration = new javax.swing.JTextField();
        lbDuration = new javax.swing.JLabel();
        tfReleaseYear = new javax.swing.JTextField();
        lbReleaseYear = new javax.swing.JLabel();
        tfGenre = new javax.swing.JTextField();
        lbGenre = new javax.swing.JLabel();
        tfPublishedDate = new javax.swing.JTextField();
        lbPublishedDate = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        spDescription = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lbTitleError = new javax.swing.JLabel();
        lbOriginalTitleError = new javax.swing.JLabel();
        lbDescriptionError = new javax.swing.JLabel();
        lbDurationError = new javax.swing.JLabel();
        lbReleaseYearError = new javax.swing.JLabel();
        lbPicturePathError = new javax.swing.JLabel();
        lbGenreError = new javax.swing.JLabel();
        lbPublishedDateError = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tbMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbMovies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMoviesMouseClicked(evt);
            }
        });
        tbMovies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbMoviesKeyReleased(evt);
            }
        });
        spMovies.setViewportView(tbMovies);

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/no_image.jpeg"))); // NOI18N

        btnChoose.setBackground(new java.awt.Color(0, 102, 102));
        btnChoose.setForeground(new java.awt.Color(204, 255, 255));
        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        lbTitle.setText("Title:");

        lbOriginalTitle.setText("Original title:");

        lbDuration.setText("Duration:");

        lbReleaseYear.setText("Release year:");

        lbGenre.setText("Genre: ");

        lbPublishedDate.setText("Published date:");

        lbDescription.setText("Description:");

        taDescription.setColumns(20);
        taDescription.setRows(5);
        spDescription.setViewportView(taDescription);

        btnAdd.setBackground(new java.awt.Color(0, 102, 0));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbTitleError.setForeground(new java.awt.Color(255, 0, 51));
        lbTitleError.setText("X");

        lbOriginalTitleError.setForeground(new java.awt.Color(255, 0, 51));
        lbOriginalTitleError.setText("X");

        lbDescriptionError.setForeground(new java.awt.Color(255, 0, 51));
        lbDescriptionError.setText("X");

        lbDurationError.setForeground(new java.awt.Color(255, 0, 51));
        lbDurationError.setText("X");

        lbReleaseYearError.setForeground(new java.awt.Color(255, 0, 51));
        lbReleaseYearError.setText("X");

        lbPicturePathError.setForeground(new java.awt.Color(255, 0, 51));
        lbPicturePathError.setText("X");

        lbGenreError.setForeground(new java.awt.Color(255, 0, 51));
        lbGenreError.setText("X");

        lbPublishedDateError.setForeground(new java.awt.Color(255, 0, 51));
        lbPublishedDateError.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spMovies)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(tfPicturePath, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnChoose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lbPicturePathError, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPublishedDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(tfGenre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTitle, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfOriginalTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(tfDuration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(tfReleaseYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(lbOriginalTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spDescription, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDuration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReleaseYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGenre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPublishedDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitleError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOriginalTitleError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescriptionError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDurationError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReleaseYearError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGenreError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPublishedDateError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitleError))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbDescriptionError)
                                .addGap(53, 53, 53)))
                        .addComponent(lbOriginalTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfOriginalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbOriginalTitleError))
                        .addGap(18, 18, 18)
                        .addComponent(lbDuration)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDurationError))
                        .addGap(29, 29, 29)
                        .addComponent(lbReleaseYear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfReleaseYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbReleaseYearError))
                        .addGap(18, 18, 18)
                        .addComponent(lbGenre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbGenreError)))
                    .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbPublishedDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPublishedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChoose)
                    .addComponent(tfPicturePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPicturePathError)
                    .addComponent(lbPublishedDateError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        Optional<File> file = FileUtils.uploadFile("Images", "jpg", "jpeg", "png");
        if (file == null) {
            return;
        }
        tfPicturePath.setText(file.get().getAbsolutePath());
        setIcon(lbIcon, file);
    }//GEN-LAST:event_btnChooseActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        init();
    }//GEN-LAST:event_formComponentShown

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!formValid()) {
            return;
        }
        try {
            String localPath = uploadPicture();

            Movie movie = new Movie(
                    tfTitle.getText().trim(),
                    LocalDateTime.parse(
                            tfPublishedDate.getText().trim(),
                            Movie.DATE_FORMATTER
                    ),
                    taDescription.getText().trim(),
                    tfOriginalTitle.getText().trim(),
                    Integer.parseInt(tfDuration.getText().trim()),
                    Integer.parseInt(tfReleaseYear.getText().trim()),
                    tfGenre.getText().trim(),
                    localPath);

            repository.createMovie(movie);
            movieTableModel.setMovies(repository.selectMovies());
            clearForm();
        } catch (Exception ex) {
            Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Error", "Unable to ADD movie!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (selectedMovie == null) {
            MessageUtils.showInformationMessage("Info", "Woke up");
            return;
        }
        if (!formValid()) {
            return;
        }

        try {
            if (!tfPicturePath.getText().equals(selectedMovie.getPicturePath())) { // ako meni tekstualni field na formi ne odgovara onome sto je u bazi; tj. ako treba nesto promijeniti
                if (selectedMovie.getPicturePath() != null) {
                    Files.deleteIfExists(Paths.get(selectedMovie.getPicturePath())); // onda cu staru sliku izbrisati
                }
                String localPath = uploadPicture();
                selectedMovie.setPicturePath(localPath); // a novu sliku cu uploadat
            }

            selectedMovie.setTitle(tfTitle.getText().trim());
            selectedMovie.setDescription(taDescription.getText().trim());
            selectedMovie.setOrginalTitle(tfOriginalTitle.getText().trim());
            selectedMovie.setDuration(Integer.parseInt(tfDuration.getText().trim()));
            selectedMovie.setReleaseYear(Integer.parseInt(tfReleaseYear.getText().trim()));
            selectedMovie.setGenre(tfGenre.getText().trim());
            selectedMovie.setPublishedDate(LocalDateTime.parse(
                    tfPublishedDate.getText().trim(),
                    Movie.DATE_FORMATTER
            ));

            repository.updateMovie(selectedMovie.getIdMovie(), selectedMovie);
            movieTableModel.setMovies(repository.selectMovies());
            clearForm();
        } catch (Exception ex) {
            Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Error", "Unable to UPDATE movie!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tbMoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMoviesMouseClicked
        showMovie();
    }//GEN-LAST:event_tbMoviesMouseClicked

    private void tbMoviesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbMoviesKeyReleased
        showMovie();
    }//GEN-LAST:event_tbMoviesKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (selectedMovie == null) {
            MessageUtils.showInformationMessage("Info", "Woke up");
            return;
        }

        if (MessageUtils.showConfirmDialog("Delete", "Do you want to DELETE movie?")) {
            try {
                if (selectedMovie.getPicturePath() != null) {
                    Files.deleteIfExists(Paths.get(selectedMovie.getPicturePath())); // delete ako slika postoji
                }

                repository.deleteMovie(selectedMovie.getIdMovie());
                movieTableModel.setMovies(repository.selectMovies());
                clearForm();
            } catch (Exception ex) {
                Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
                MessageUtils.showErrorMessage("Error", "Unable to DELETE movie!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbDescriptionError;
    private javax.swing.JLabel lbDuration;
    private javax.swing.JLabel lbDurationError;
    private javax.swing.JLabel lbGenre;
    private javax.swing.JLabel lbGenreError;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbOriginalTitle;
    private javax.swing.JLabel lbOriginalTitleError;
    private javax.swing.JLabel lbPicturePathError;
    private javax.swing.JLabel lbPublishedDate;
    private javax.swing.JLabel lbPublishedDateError;
    private javax.swing.JLabel lbReleaseYear;
    private javax.swing.JLabel lbReleaseYearError;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitleError;
    private javax.swing.JScrollPane spDescription;
    private javax.swing.JScrollPane spMovies;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JTable tbMovies;
    private javax.swing.JTextField tfDuration;
    private javax.swing.JTextField tfGenre;
    private javax.swing.JTextField tfOriginalTitle;
    private javax.swing.JTextField tfPicturePath;
    private javax.swing.JTextField tfPublishedDate;
    private javax.swing.JTextField tfReleaseYear;
    private javax.swing.JTextField tfTitle;
    // End of variables declaration//GEN-END:variables

    private void setIcon(JLabel label, Optional<File> file) {
        try {
            label.setIcon(IconUtils.createIcon(file, label.getWidth(), label.getHeight()));
        } catch (IOException ex) {
            Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Error", "Unable to set icon!");
        }
    }

    private List<JTextComponent> validationFields;
    private List<JLabel> errorLabels;
    private Repository repository;
    private MovieTableModel movieTableModel;
    private Movie selectedMovie;
    private static final String DIR = "assets";

    private void init() {
        try {
            initValidation();
            hideErrors();
            initRepository();
            initTable();
        } catch (Exception ex) {
            Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Unrecoverable error", "Cannot initiate the form");
            System.exit(1);
        }
    }

    private void initValidation() {
        validationFields = Arrays.asList( // ne mora ici po redu
                tfTitle,
                taDescription,
                tfOriginalTitle,
                tfDuration,
                tfReleaseYear,
                tfGenre,
                tfPublishedDate,
                tfPicturePath
        );
        errorLabels = Arrays.asList( // mora odgovarati ovima gore
                lbTitleError,
                lbDescriptionError,
                lbOriginalTitleError,
                lbDurationError,
                lbReleaseYearError,
                lbGenreError,
                lbPublishedDateError,
                lbPicturePathError
        );
    }

    private void hideErrors() {
        errorLabels.forEach(e -> e.setVisible(false));
    }

    private void initRepository() {
        repository = RepositoryFactory.getRepository();
    }

    private void initTable() throws Exception {
        tbMovies.setRowHeight(25);
        tbMovies.setAutoCreateRowSorter(true);
        tbMovies.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION);

        movieTableModel = new MovieTableModel(
                repository.selectMovies());
        tbMovies.setModel(movieTableModel);
    }

    private String uploadPicture() throws IOException {
        String path = tfPicturePath.getText();
        String ext = path.substring(path.lastIndexOf("."));
        String name = UUID.randomUUID() + ext;
        String localPath = DIR + File.separator + name;

        FileUtils.copy(path, localPath);

        return localPath;
    }

    private boolean formValid() {
        hideErrors();
        boolean ok = true;

        for (int i = 0; i < validationFields.size(); i++) {
            ok &= !validationFields.get(i).getText().trim().isEmpty();
            errorLabels.get(i).setVisible(validationFields.get(i).getText().trim().isEmpty());

            if ("DATE".equals(
                    validationFields.get(i).getName())) {

                try {
                    LocalDateTime.parse(
                            validationFields.get(i).getText().trim(),
                            Movie.DATE_FORMATTER
                    );
                } catch (Exception e) {
                    ok = false;
                    errorLabels.get(i).setVisible(true);
                }
            }
        }
        return ok;
    }

    private void clearForm() {
        hideErrors();
        validationFields.forEach(e -> e.setText(""));
        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/no_image.png")));
        selectedMovie = null;
    }

    private void showMovie() {
        int selectedRow = tbMovies.getSelectedRow();
        int rowIndex
                = tbMovies.convertRowIndexToModel(selectedRow);

        int id = (int) movieTableModel.getValueAt(rowIndex, 0); // na nultom mjestu je id

        try {
            Optional<Movie> opt = repository.selectMovie(id);
            if (opt.isPresent()) {
                selectedMovie = opt.get();
                fillForm(selectedMovie);
            }
        } catch (Exception ex) {
            Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Error", "Prikazati ovaj film je Nemoguca misija");
        }
    }

    private void fillForm(Movie movie) {
        tfTitle.setText(movie.getTitle());
        taDescription.setText(movie.getDescription());
        tfOriginalTitle.setText(movie.getOrginalTitle());
        tfDuration.setText(String.valueOf(movie.getDuration()));
        tfReleaseYear.setText(String.valueOf(movie.getReleaseYear()));
        tfGenre.setText(movie.getGenre());
        tfPublishedDate.setText(movie.getPublishedDate().format(Movie.DATE_FORMATTER));

        if (movie.getPicturePath() != null
                && Files.exists(Paths.get(movie.getPicturePath()))) {
            Optional opt = Optional.of(movie.getPicturePath());
            setIcon(lbIcon, opt);
        }
    }
}
