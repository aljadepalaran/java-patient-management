package coursework.Views;

import coursework.Models.Objects.Session;
import coursework.Models.Objects.Appointment;
import coursework.Models.Users.User;
import coursework.Controllers.GenerateID;
import coursework.Controllers.MainFunctions;
import coursework.Controllers.Augment;
import coursework.Controllers.FileReader;
import javax.swing.JOptionPane;

public class RequestAppointment extends javax.swing.JFrame {

    Session userSession;
    Appointment proposedAppointment = null;
    User allUsers[] = null;
    
    public RequestAppointment() {
        initComponents();
    }
    
    public RequestAppointment(Session _input) {
        initComponents();
        userSession = _input;
        doctorSelect.removeAllItems();
        loadProposed();
        loadDoctors();
    }
    
    //A controller to load proposed appointments from the data file and display it into the form.
    public void loadProposed(){
        Appointment proposed[] = null;
        User all[] = null;
        try{
            String doctorID = "";
            proposed = FileReader.readProposedAppointments();
            all = FileReader.readUsers();
            for(int i = 0; i < proposed.length; i++){
                if(proposed[i].getPatientID().compareTo(userSession.getUID()) == 0){
                    dateField.setText(proposed[i].getDate());
                    doctorID = proposed[i].getDoctorID();
                    proposedAppointment = proposed[i];
                }
            }
            System.out.println(doctorID);
            for(int i = 0; i < all.length; i++){
                if(all[i].getUniqueID().compareTo(doctorID) == 0){
                    doctorField.setText(all[i].getFirstName() + " " + all[i].getLastName());
                }
            }     
        }catch(Exception e){}
    }
    
    public void loadDoctors(){
        try{
            allUsers = FileReader.readUsers();
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().substring(0,1).compareTo("D") == 0){
                    doctorSelect.addItem(allUsers[i].getUniqueID());
                }
            }
        }catch(Exception e){}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        requestButton = new javax.swing.JButton();
        dateField = new javax.swing.JTextField();
        doctorField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        doctorSelect = new javax.swing.JComboBox<>();
        requestButton2 = new javax.swing.JButton();
        dateInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        doctorName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("PROPOSED DATE:");

        jLabel2.setText("PROPOSED BY: ");

        requestButton.setText("Request");
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });

        dateField.setEditable(false);

        doctorField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateField)
                    .addComponent(doctorField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(requestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(doctorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        doctorSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        doctorSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorSelectActionPerformed(evt);
            }
        });

        requestButton2.setText("Request");
        requestButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("SELECT DOCTOR:");

        jLabel4.setText("DATE:");

        doctorLabel.setText("DOCTOR NAME:");

        doctorName.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(doctorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateInput, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorSelect, javax.swing.GroupLayout.Alignment.LEADING, 0, 185, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(requestButton2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(requestButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctorLabel)
                            .addComponent(doctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
        try{
            Augment.addAppointmentRequest(proposedAppointment); //added to requests
            Augment.removeProposedAppointment(proposedAppointment.getAppointmentID());
            JOptionPane.showMessageDialog(this, "The appointment has been requested.");
            this.setVisible(false);
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "You have no proposed appointment.");
        }
        
    }//GEN-LAST:event_requestButtonActionPerformed

    private void requestButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButton2ActionPerformed
        try{
            Appointment allAppointments[] = FileReader.readAppointments();
            String date = dateInput.getText();
        
            boolean valid = true;
            boolean doctorBusy = false;
            if(MainFunctions.validateDate(date)){
            }else{
                valid = false;
            }
            
            if(valid == true){
                String appID = GenerateID.appointmentID();
                String doctorID = doctorSelect.getSelectedItem().toString();
                
                for(int i = 0; i < allAppointments.length; i++){
                    if(allAppointments[i].getDoctorID().compareTo(doctorID) == 0){
                        if(allAppointments[i].getDate().compareTo(date) == 0){
                            doctorBusy = true;
                        }
                    }
                }
                if(doctorBusy == false){
                    Appointment newApp = new Appointment(appID, userSession.getUID(), doctorID, date, "");
                    Augment.addAppointmentRequest(newApp);
                    JOptionPane.showMessageDialog(this, "Appointment request added.");
                    this.setVisible(false);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "The doctor is busy on this date.");
                }
                
            }else{
            JOptionPane.showMessageDialog(this, "Invalid appointment.");}
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error with operation: " + e);
        }
    }//GEN-LAST:event_requestButton2ActionPerformed

    private void doctorSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorSelectActionPerformed
        try{
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().compareTo(doctorSelect.getSelectedItem().toString()) == 0){
                    doctorName.setText(allUsers[i].getFirstName() + " " + allUsers[i].getLastName());
                }
            }
        }catch(Exception e){}
        
    }//GEN-LAST:event_doctorSelectActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField dateInput;
    private javax.swing.JTextField doctorField;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JTextField doctorName;
    private javax.swing.JComboBox<String> doctorSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton requestButton;
    private javax.swing.JButton requestButton2;
    // End of variables declaration//GEN-END:variables
}
