/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package hr.algebra.view;

import hr.algebra.model.Registerable;
import hr.algebra.model.Users;
import hr.algebra.utilities.MessageUtils;
import java.util.Arrays;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author zvonimir.ZI.ivancic
 */
public class RegisterDialog extends javax.swing.JDialog {

    //private final Registerable registerable;

    /**
     * Creates new form RegisterDialog
     */
    public RegisterDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //registerable = (Registerable) parent;
        initComponents();
        initValidation();
        hideErrors();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUsername = new javax.swing.JTextField();
        lbUsername = new javax.swing.JLabel();
        lbUsernameError = new javax.swing.JLabel();
        lbPasswordError = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        lbPassword = new javax.swing.JLabel();
        pfConfirmPassword = new javax.swing.JPasswordField();
        lbConfirmPassword = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lbInvalidPasswordConfirmationError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbUsername.setForeground(new java.awt.Color(0, 153, 153));
        lbUsername.setText("Username:");

        lbUsernameError.setForeground(new java.awt.Color(255, 0, 0));
        lbUsernameError.setText("X");

        lbPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        lbPasswordError.setText("X");

        lbPassword.setForeground(new java.awt.Color(0, 153, 153));
        lbPassword.setText("Password:");

        lbConfirmPassword.setForeground(new java.awt.Color(0, 153, 153));
        lbConfirmPassword.setText("Confirm Password:");

        btnRegister.setBackground(new java.awt.Color(0, 102, 102));
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lbInvalidPasswordConfirmationError.setForeground(new java.awt.Color(102, 0, 0));
        lbInvalidPasswordConfirmationError.setText("Invalid confirmation of Password!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbConfirmPassword)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbInvalidPasswordConfirmationError))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pfConfirmPassword)
                            .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lbPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfPassword, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPasswordError)
                            .addComponent(lbUsernameError))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsernameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPasswordError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lbInvalidPasswordConfirmationError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if (!formValid()) {
            return;
        }

       /* Users user = new Users(
                tfUsername.getText().trim(),
                Arrays.toString(pfPassword.getPpassword())
        );

        if (registerable.addRegister(user)) {
            dispose();
        } else {
            MessageUtils.showErrorMessage("Error", "Duplicate user");
        }*/

    }
    private List<JTextField> validationFieldsJTextFields;
    private List<JPasswordField> validationFieldJPasswordFields;
    private List<JLabel> errorLabels;


        private void initValidation() {
        validationFieldsJTextFields = Arrays.asList(
                tfUsername
        );
        validationFieldJPasswordFields = Arrays.asList(
                pfPassword,
                pfConfirmPassword
        );
        errorLabels = Arrays.asList(
                lbUsernameError,
                lbPasswordError,
                lbInvalidPasswordConfirmationError
        );
    }

    private void hideErrors() {
        errorLabels.forEach(e -> e.setVisible(false));
    }

    private boolean formValid() {
        hideErrors();
        boolean ok = true;

        for (int i = 0; i < validationFieldsJTextFields.size(); i++) {
            ok &= !validationFieldsJTextFields.get(i).getText().trim().isEmpty();
            errorLabels.get(i).setVisible(validationFieldsJTextFields.get(i).getText().trim().isEmpty());
        }
        for (int i = 0; i < validationFieldJPasswordFields.size(); i++) {
            ok &= !validationFieldJPasswordFields.get(i).getText().trim().isEmpty();
            errorLabels.get(i).setVisible(validationFieldJPasswordFields.get(i).getText().trim().isEmpty());
        }

        return ok;
   
    }//GEN-LAST:event_btnRegisterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lbConfirmPassword;
    private javax.swing.JLabel lbInvalidPasswordConfirmationError;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPasswordError;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbUsernameError;
    private javax.swing.JPasswordField pfConfirmPassword;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
