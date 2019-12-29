package coursework.Forms;

import Default.FileIO;
import Default.Functions;
import coursework.Users.Patient;

public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        
        fnWarning.setVisible(false);
        lnWarning.setVisible(false);
        passWarning.setVisible(false);
        checkWarning.setVisible(false);
        addressWarning.setVisible(false);
        dateWarning.setVisible(false);
        genderWarning.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        passwordPrimaryField = new javax.swing.JPasswordField();
        passwordSecondaryField = new javax.swing.JPasswordField();
        dateOfBirthField = new javax.swing.JTextField();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fnWarning = new javax.swing.JLabel();
        lnWarning = new javax.swing.JLabel();
        passWarning = new javax.swing.JLabel();
        checkWarning = new javax.swing.JLabel();
        addressWarning = new javax.swing.JLabel();
        dateWarning = new javax.swing.JLabel();
        genderWarning = new javax.swing.JLabel();

        jLabel9.setText("LOL");

        jLabel11.setText("LOL");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        femaleRadio.setText("Female");
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jLabel3.setText("Password:");

        jLabel4.setText("Confirm Password:");

        jLabel5.setText("Date Of Birth(DDMMYYYY): ");

        jLabel6.setText("Address:");

        fnWarning.setText("!");

        lnWarning.setText("!");

        passWarning.setText("!");

        checkWarning.setText("!");

        addressWarning.setText("!");

        dateWarning.setText("!");

        genderWarning.setText("!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addressField)
                                .addComponent(lastNameField)
                                .addComponent(firstNameField)
                                .addComponent(passwordPrimaryField)
                                .addComponent(passwordSecondaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(registerButton)
                        .addGap(50, 50, 50)
                        .addComponent(maleRadio)
                        .addGap(30, 30, 30)
                        .addComponent(femaleRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passWarning)
                        .addComponent(checkWarning, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(addressWarning)
                    .addComponent(dateWarning)
                    .addComponent(lnWarning)
                    .addComponent(fnWarning)
                    .addComponent(genderWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(fnWarning))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lnWarning))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordPrimaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(passWarning))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordSecondaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(checkWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(addressWarning))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(dateWarning))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio)
                    .addComponent(genderWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        //Do nothing.
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed

        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String password = Functions.convertCharToString(passwordPrimaryField.getPassword());
        String passwordConfirm = Functions.convertCharToString(passwordSecondaryField.getPassword());
        String address = addressField.getText();
        String dateOfBirth = dateOfBirthField.getText();
        char sex = 'N';
        
        if(maleRadio.isSelected() == true){
            sex = 'M';
        }
        else if(femaleRadio.isSelected() == true){
            sex = 'F';
        }
        
        //Checks if the gender is not selected.
        if(sex == 'N'){
            genderWarning.setVisible(true);
        }else{
            genderWarning.setVisible(false);
        }
        
        //Checks if the first name is null.
        if(firstName.compareTo("") == 0){ 
            fnWarning.setVisible(true);
        }else{
            fnWarning.setVisible(false);
        }
        
        //Checks if the last name is null.
        if(lastName.compareTo("") == 0){
            lnWarning.setVisible(true);
        }else{
            lnWarning.setVisible(false);
        }
        
        //Checks if the password is null.
        if(password.compareTo("") == 0){
            passWarning.setVisible(true);
        }else{
            passWarning.setVisible(false);
        }
        
        //Checks if the confirm password is null.
        if(passwordConfirm.compareTo("") == 0){
            checkWarning.setVisible(true);
        }else{
            checkWarning.setVisible(false);
        }
        
        //Checks if the address is null.
        if(address.compareTo("") == 0){
            addressWarning.setVisible(true);
        }else{
            addressWarning.setVisible(false);
        }
        
        //Checks if the password matches.
        if(password.compareTo(passwordConfirm) == 0 ){
            //Do nothing.
        }
        else{
            System.out.println("Passwords do not match!");
            checkWarning.setVisible(true);
        }
        
        //Checks if the date entered is valid.
        if(Functions.validateDate(dateOfBirth) == false){
            dateWarning.setVisible(true);
        }
        
        //Generate new id for the patient.
        String newID = Functions.generateID('A');
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        femaleRadio.setSelected(false);
    }//GEN-LAST:event_maleRadioActionPerformed

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        maleRadio.setSelected(false);
    }//GEN-LAST:event_femaleRadioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressWarning;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel checkWarning;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JLabel dateWarning;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel fnWarning;
    private javax.swing.JLabel genderWarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lnWarning;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel passWarning;
    private javax.swing.JPasswordField passwordPrimaryField;
    private javax.swing.JPasswordField passwordSecondaryField;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
