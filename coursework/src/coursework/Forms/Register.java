package coursework.Forms;

import coursework.Functions.*;
import coursework.Users.*;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    
    //GLOBAL VARIABLES
    String firstname;
    String lastname;
    String password;
    String checkPassword;
    String address;
    String birthDate;
    char sex = 'N';
    char userType;
    
    public Register() {
        initComponents();
    }
    
    public Register(char _userType) {
        initComponents();
        this.setResizable(false);
        firstnameWarning.setVisible(false);
        lastnameWarning.setVisible(false);
        passwordWarning.setVisible(false);
        checkWarning.setVisible(false);
        addressWarning.setVisible(false);
        birthWarning.setVisible(false);
        genderWarning.setVisible(false);
        setAccess(_userType);
        userType = _userType;
    }
    
    public void setAccess(char _userType){
        if(_userType == 'A'){
            firstnameField.setEnabled(true);
            lastnameField.setEnabled(true);
            passwordField.setEnabled(true);
            checkField.setEnabled(true);
        }else if(_userType == 'D'){
            firstnameField.setEnabled(true);
            lastnameField.setEnabled(true);
            passwordField.setEnabled(true);
            checkField.setEnabled(true);
            addressField.setEnabled(true);
        }else if(_userType == 'P'){
            firstnameField.setEnabled(true);
            lastnameField.setEnabled(true);
            passwordField.setEnabled(true);
            checkField.setEnabled(true);
            addressField.setEnabled(true);
            birthField.setEnabled(true);
            femaleRadio.setEnabled(true);
            maleRadio.setEnabled(true);
        }else if(_userType == 'S'){
            firstnameField.setEnabled(true);
            lastnameField.setEnabled(true);
            passwordField.setEnabled(true);
            checkField.setEnabled(true);
        }
    }
    
    public void createUser(char _userType){
        boolean validInput = true;
        
        //Checks if the first name is null.
        if(firstname.compareTo("") == 0){ 
            firstnameWarning.setVisible(true);
            validInput = false;
        }else{
            firstnameWarning.setVisible(false);
        }
        
        //Checks if the last name is null.
        if(lastname.compareTo("") == 0){ 
            lastnameWarning.setVisible(true);
            validInput = false;
        }else{
            lastnameWarning.setVisible(false);
        }
        
        //Checks if the password is null.
        if(password.compareTo("") == 0){
            passwordWarning.setVisible(true);
            validInput = false;
        }else{
            passwordWarning.setVisible(false);
        }
        
        //Checks if the confirm password is null.
        if(checkPassword.compareTo("") == 0){
            checkWarning.setVisible(true);
            validInput = false;
        }else{
            checkWarning.setVisible(false);
        }
        
        //Checks if the password matches.
        if(password.compareTo(checkPassword) == 0 ){
            checkWarning.setVisible(false);
        }else{
            checkWarning.setVisible(true);
            validInput = false;
        }
        if(_userType == 'A'){
        }else if(_userType == 'D'){
            if(address.compareTo("") == 0){
                addressWarning.setVisible(true);
                validInput = false;
            }else{
                addressWarning.setVisible(false);
            }
        }else if(_userType == 'P'){
            if(address.compareTo("") == 0){
                addressWarning.setVisible(true);
                validInput = false;
            }else{
                addressWarning.setVisible(false);
            }
            if(birthDate.compareTo("") == 0){
                birthWarning.setVisible(true);
                validInput = false;
            }else{
                birthWarning.setVisible(false);
            }
            if(MainFunctions.validateDate(birthDate)){
                birthWarning.setVisible(false);
            }else{
                birthWarning.setVisible(true);
                validInput = false;
            }
            if(sex == 'N'){
                genderWarning.setVisible(true);
                validInput = false;
            }else{
                genderWarning.setVisible(false);
            }
        }else if(_userType == 'S'){}
            
        if(validInput == true){
            String newID = "";
            if(userType == 'A'){
                newID = GenerateID.userID('A');
                this.setVisible(false);
                this.dispose();
            }else if(userType == 'D'){
                newID = GenerateID.userID('D');
                this.setVisible(false);
                this.dispose();
            }else if(userType == 'P'){
                newID = GenerateID.userID('P');
                this.setVisible(false);
                this.dispose();
            }else if(userType == 'S'){
                newID = GenerateID.userID('S');
                this.setVisible(false);
                this.dispose();
            }
            UserCreator creator = new UserCreator();
            creator.addUserToSystem(newID, password, firstname, lastname, address, sex, birthDate);
            JOptionPane.showMessageDialog(this, "Your UID: " + newID);
        }else{
            JOptionPane.showMessageDialog(this, "Register incomplete: One or more fields are empty.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField2 = new javax.swing.JTextField();
        usernameField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        firstnameField = new javax.swing.JTextField();
        lastnameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        birthField = new javax.swing.JTextField();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        firstnameWarning = new javax.swing.JLabel();
        lastnameWarning = new javax.swing.JLabel();
        passwordWarning = new javax.swing.JLabel();
        addressWarning = new javax.swing.JLabel();
        checkWarning = new javax.swing.JLabel();
        birthWarning = new javax.swing.JLabel();
        genderWarning = new javax.swing.JLabel();
        checkField = new javax.swing.JPasswordField();
        passwordField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        usernameField2.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N

        usernameField4.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("⚠");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        firstnameField.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N
        firstnameField.setEnabled(false);

        lastnameField.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N
        lastnameField.setEnabled(false);

        addressField.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N
        addressField.setEnabled(false);

        birthField.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N
        birthField.setEnabled(false);

        maleRadio.setText("Male");
        maleRadio.setEnabled(false);
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        femaleRadio.setText("Female");
        femaleRadio.setEnabled(false);
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        firstnameWarning.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        firstnameWarning.setForeground(new java.awt.Color(255, 0, 0));
        firstnameWarning.setText("⚠");

        lastnameWarning.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lastnameWarning.setForeground(new java.awt.Color(255, 0, 0));
        lastnameWarning.setText("⚠");

        passwordWarning.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordWarning.setForeground(new java.awt.Color(255, 0, 0));
        passwordWarning.setText("⚠");

        addressWarning.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addressWarning.setForeground(new java.awt.Color(255, 0, 0));
        addressWarning.setText("⚠");

        checkWarning.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        checkWarning.setForeground(new java.awt.Color(255, 0, 0));
        checkWarning.setText("⚠");

        birthWarning.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        birthWarning.setForeground(new java.awt.Color(255, 0, 0));
        birthWarning.setText("⚠");

        genderWarning.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        genderWarning.setForeground(new java.awt.Color(255, 0, 0));
        genderWarning.setText("⚠");

        checkField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        checkField.setEnabled(false);

        passwordField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passwordField.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastnameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstnameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(maleRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(femaleRadio)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderWarning)
                            .addComponent(birthWarning)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnameWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField)
                    .addComponent(passwordWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkWarning)
                    .addComponent(checkField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femaleRadio)
                    .addComponent(maleRadio)
                    .addComponent(genderWarning))
                .addGap(7, 7, 7))
        );

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Confirm Password");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Address");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Password");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("DOB(DDMMYYYY)");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Last Name");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("First Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel14))
                                .addComponent(jLabel12)
                                .addComponent(jLabel11)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(1, 1, 1)))
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel10)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel11)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed

        firstname = firstnameField.getText();
        lastname = lastnameField.getText();
        password = MainFunctions.charToString(passwordField.getPassword());
        checkPassword = MainFunctions.charToString(checkField.getPassword());
        address = addressField.getText();
        birthDate = birthField.getText();
        
        createUser(userType);
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        sex = 'M';
        femaleRadio.setSelected(false);
    }//GEN-LAST:event_maleRadioActionPerformed

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        sex = 'F';
        maleRadio.setSelected(false);
    }//GEN-LAST:event_femaleRadioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressWarning;
    private javax.swing.JTextField birthField;
    private javax.swing.JLabel birthWarning;
    private javax.swing.JPasswordField checkField;
    private javax.swing.JLabel checkWarning;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JLabel firstnameWarning;
    private javax.swing.JLabel genderWarning;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JLabel lastnameWarning;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordWarning;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField usernameField2;
    private javax.swing.JTextField usernameField4;
    // End of variables declaration//GEN-END:variables
}
