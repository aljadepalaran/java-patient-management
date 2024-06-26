package coursework.Views;

import coursework.Models.Objects.Session;
import coursework.Models.Objects.Appointment;
import coursework.Models.Users.User;
import coursework.Models.Users.Patient;
import coursework.Controllers.GenerateID;
import coursework.Controllers.MainFunctions;
import coursework.Controllers.Augment;
import coursework.Controllers.FileReader;
import javax.swing.JOptionPane;

/**
 * Form used to create appointments.
 * 
 */

public class Creator extends javax.swing.JFrame {

    Session userSession;
    Patient[] patientArray;
    User[] allUsers = null;
    
    public Creator() {
        initComponents();
    }
    
    /**
     * The constructor for the creator form.
     */
    public Creator(Session _input) {
        initComponents();
        this.setResizable(false);
        userSession = _input;
        clearForm();
        try{
            allUsers = FileReader.readUsers();
            int counter = 0;
            for(int i = 0; i < allUsers.length; i++){
                counter++;
            }
            int newCounter = 0;
            patientArray = new Patient[counter];
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().substring(0,1).compareTo("P") == 0){
                    patientArray[newCounter] = (Patient)allUsers[i];
                    newCounter++;
                }else{}
            }
            for(int i = 0; i < patientArray.length; i++){
                patientSelect.addItem((patientArray[i].getUniqueID()));
            }
        }catch(Exception e){}
    }
    
    /**
     * Clears the form.
     */
    public void clearForm(){
        patientSelect.removeAllItems();
        firstnameText.setText("");
        lastnameText.setText("");
        addressText.setText("");
        dobText.setText("");
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientSelect = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        firstnameText = new javax.swing.JTextField();
        lastnameText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        dobText = new javax.swing.JTextField();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        setDateField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        patientSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patientSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSelectActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        firstnameText.setEditable(false);

        lastnameText.setEditable(false);

        addressText.setEditable(false);

        dobText.setEditable(false);

        maleRadio.setText("M");
        maleRadio.setEnabled(false);

        femaleRadio.setText("F");
        femaleRadio.setEnabled(false);

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Address");

        jLabel4.setText("Date of Birth");

        jLabel5.setText("Gender");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(maleRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(femaleRadio))
                    .addComponent(firstnameText, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(lastnameText)
                    .addComponent(addressText)
                    .addComponent(dobText))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        setDateField.setFont(new java.awt.Font("Dosis", 0, 14)); // NOI18N

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Date (DDMMYYYY)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientSelect, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6))
                            .addComponent(setDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(255, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Displays the information of the patient.
     */
    private void patientSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSelectActionPerformed
        try{
            Patient selected = patientArray[patientSelect.getSelectedIndex()];
            firstnameText.setText(selected.getFirstName());
            lastnameText.setText(selected.getLastName());
            addressText.setText(selected.getAddress());
            String birthDate = "" + selected.getDOB().substring(0,2) + "/" + selected.getDOB().substring(2,4) + "/" + selected.getDOB().substring(4,8);
            dobText.setText(birthDate);
            if(selected.getSex() == 'M'){
                maleRadio.setSelected(true);
            }else{
                femaleRadio.setSelected(true);
            }
        }catch(Exception e){}
    }//GEN-LAST:event_patientSelectActionPerformed

    /**
     * Activates when the button is pressed.
     * Creates the appointment and adds it to the system as a proposed appointment.
     */
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        try{
            Appointment allAppointments[] = FileReader.readAppointments();
            String patientID = patientSelect.getSelectedItem().toString();              
            String doctorID = userSession.getUID();
            String newID = GenerateID.appointmentID();
            boolean check = false;
            boolean doctorBusy = false;
            if(MainFunctions.validateDate(setDateField.getText())){ //checks if the date is in the correct format.
                String date = setDateField.getText();
                for(int i = 0; i < allAppointments.length; i++){
                    if(allAppointments[i].getDoctorID().compareTo(doctorID) == 0){  //checks if the doctor is busy.
                        if(allAppointments[i].getDate().compareTo(date) == 0){
                            doctorBusy = true;
                        }
                    }
                }
                if(doctorBusy == false){
                    Appointment newAppointment = new Appointment(newID, patientID, doctorID, date, "");
                    check = Augment.addProposedAppointment(newAppointment);
                    if(check == true){
                        JOptionPane.showMessageDialog(this, "Proposal created.");
                    }else{
                        JOptionPane.showMessageDialog(this, "You have already created a proposal for this patient.");
                    }
                    this.setVisible(false);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "You are busy on this date.");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Incorrect date format.");
            }
        }catch(Exception e){}
    }//GEN-LAST:event_createButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressText;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField dobText;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstnameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastnameText;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JComboBox<String> patientSelect;
    private javax.swing.JTextField setDateField;
    // End of variables declaration//GEN-END:variables
}
