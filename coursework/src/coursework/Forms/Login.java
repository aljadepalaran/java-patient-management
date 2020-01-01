package coursework.Forms;

import coursework.Functions.*;
import coursework.Objects.Session;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminTest = new javax.swing.JButton();
        patientTest = new javax.swing.JButton();
        secretaryTest = new javax.swing.JButton();
        doctorTest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameField.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        adminTest.setText("A");
        adminTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTestActionPerformed(evt);
            }
        });

        patientTest.setText("P");
        patientTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTestActionPerformed(evt);
            }
        });

        secretaryTest.setText("S");
        secretaryTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secretaryTestActionPerformed(evt);
            }
        });

        doctorTest.setText("D");
        doctorTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adminTest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientTest))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doctorTest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secretaryTest))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(39, 39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminTest)
                            .addComponent(patientTest))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctorTest)
                            .addComponent(secretaryTest))
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        //registration form param=p for patient
        Register registrationForm = new Register('P');
        registrationForm.setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        String uniqueID;
        String password;
        boolean authFlag = false;       
        
        uniqueID = usernameField.getText();
        password = MainFunctions.charToString(passwordField.getPassword());
        
        if(uniqueID.compareTo("") == 0 || password.compareTo("") == 0){            
            JOptionPane.showMessageDialog(this, "One or more fields are empty.");
        }else{
            authFlag = MainFunctions.authenticateLogin(uniqueID, password);                     //Checks if the credentials are correct.
            if(authFlag == true){                                                           //If the credentials match.
                Session userSession = Session.getInstance(uniqueID);
                userSession.setUID(uniqueID);
                MainFunctions.displayMainForm(userSession);
                this.setVisible(false);
            }else{                                                                           //If the credentials do not match.
                JOptionPane.showMessageDialog(this, "Login unsuccessful.");                                  
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void adminTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTestActionPerformed
        Session userSession = Session.getInstance("A0001");
        userSession.setUID("A0001");
        MainAdministrator newForm = new MainAdministrator(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_adminTestActionPerformed

    private void patientTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTestActionPerformed
        Session userSession = Session.getInstance("P0001");
        userSession.setUID("P0001");
        MainPatient newForm = new MainPatient(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_patientTestActionPerformed

    private void secretaryTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secretaryTestActionPerformed
        Session userSession = Session.getInstance("S0001");
        userSession.setUID("S0001");
        MainSecretary newForm = new MainSecretary(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_secretaryTestActionPerformed

    private void doctorTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorTestActionPerformed
        Session userSession = Session.getInstance("D0007");
        userSession.setUID("D0007");
        MainDoctor newForm = new MainDoctor(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_doctorTestActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminTest;
    private javax.swing.JButton doctorTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton patientTest;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton secretaryTest;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
