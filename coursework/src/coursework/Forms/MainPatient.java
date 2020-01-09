package coursework.Forms;

import coursework.Functions.Augment;
import coursework.Functions.FileReader;
import coursework.Functions.FileWriter;
import coursework.Objects.Appointment;
import coursework.Objects.Rating;
import coursework.Objects.Session;
import coursework.Users.Doctor;
import coursework.Users.User;
import javax.swing.JOptionPane;

public class MainPatient extends javax.swing.JFrame {
    
    //GLOBAL VARIABLES
    Session userSession;
    User allUsers[] = null;
    Doctor allDoctors[] = null;
    Appointment appointments[] = null;
    Appointment proposedAppointment = null;
    
    public MainPatient(){
        initComponents();
    }
    
    public MainPatient(Session _session){
        initComponents();
        this.setResizable(false); 
        userSession = _session;
        checkObservables();
        loadData();
        loadProposed();
        if(proposedAppointment != null){
            JOptionPane.showMessageDialog(this, "You have a proposed appointment! Click 'Request Appointment' to view!");
        }
    }
    
    public void checkObservables(){
        try{
            User[] all = FileReader.readUsers();
            for(int i = 0; i < all.length; i++){
                if(all[i].getUniqueID().compareTo(userSession.getUID()) == 0){
                    if(all[i].getHasObservable() == true){
                        JOptionPane.showMessageDialog(this, "You have appointment(s).");
                    }
                }
            }
        }catch(Exception e){}
    }
    
    //A controller to load all the data needed for the patient functions.
    public void loadData(){
        selectDoctor.removeAllItems();
        ratingSelect.removeAllItems();
        appointmentSelect.removeAllItems();
        try{
            allUsers = FileReader.readUsers();
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().substring(0,1).compareTo("D") == 0){
                    selectDoctor.addItem(allUsers[i].getUniqueID() + ":" + allUsers[i].getFirstName() 
                            + " " + allUsers[i].getLastName());
                }
            }
            appointments = FileReader.readAppointments();
            for(int i = 0; i < appointments.length; i++){
                if(appointments[i].getPatientID().compareTo(userSession.getUID()) == 0){
                    appointmentSelect.addItem((appointments[i].getAppointmentID()));
                }
            }
        }catch(Exception e){}
        for(int i = 1; i < 6; i++){
            ratingSelect.addItem(i + "*");
        }
    }

    public void loadProposed(){
        Appointment proposed[] = null;
        try{
            proposed = FileReader.readProposedAppointments();
            for(int i = 0; i < proposed.length; i++){
                if(proposed[i].getPatientID().compareTo(userSession.getUID()) == 0){
                    proposedAppointment = proposed[i];
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JLayeredPane();
        viewRatingButton = new javax.swing.JButton();
        requestAppointmentButton = new javax.swing.JButton();
        viewPrescriptionButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        terminateButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rateDoctorButton = new javax.swing.JButton();
        selectDoctor = new javax.swing.JComboBox<>();
        messageText = new javax.swing.JTextField();
        ratingSelect = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        appointmentSelect = new javax.swing.JComboBox<>();
        dateLabel = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Form");

        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        viewRatingButton.setText("View Ratings");
        viewRatingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRatingButtonActionPerformed(evt);
            }
        });

        requestAppointmentButton.setText("Request Appointment");
        requestAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestAppointmentButtonActionPerformed(evt);
            }
        });

        viewPrescriptionButton.setText("View Prescription");
        viewPrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrescriptionButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        terminateButton.setText("Request Termination");
        terminateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminateButtonActionPerformed(evt);
            }
        });

        buttonPanel.setLayer(viewRatingButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(requestAppointmentButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(viewPrescriptionButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(logoutButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(terminateButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(requestAppointmentButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(viewRatingButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewPrescriptionButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(terminateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewRatingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestAppointmentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPrescriptionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terminateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rateDoctorButton.setText("Rate Doctor");
        rateDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateDoctorButtonActionPerformed(evt);
            }
        });

        selectDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ratingSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageText)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selectDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ratingSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rateDoctorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ratingSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rateDoctorButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appointmentSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        appointmentSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentSelectActionPerformed(evt);
            }
        });

        dateLabel.setText("DATE: ");

        doctorLabel.setText("DOCTOR: ");

        noteLabel.setText("NOTES: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(appointmentSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateLabel))
                    .addComponent(doctorLabel)
                    .addComponent(noteLabel))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointmentSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noteLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(542, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login loginForm = new Login();
        loginForm.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void rateDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateDoctorButtonActionPerformed
        Rating all[] = null;
        boolean exists = false;
        String message = "";
        int rateValue = 0;
        String doctorID = "";
        boolean valid = true;
        try{
            all = FileReader.readRatings();
            message = messageText.getText();
            rateValue = ratingSelect.getSelectedIndex() + 1;
            doctorID = selectDoctor.getSelectedItem().toString().substring(0,5);
            for(int i = 0; i < all.length; i++){
                if(all[i].getDoctorID().compareTo(doctorID) == 0 && all[i].getPatientID().compareTo(userSession.getUID()) == 0){
                    exists = true;
                }
            }
            
            if(message.compareTo("") == 0){
                valid = false;
            }
            if(rateValue == 0){
                valid = false;
            }
            if(doctorID.compareTo("") == 0){
                valid = false;
            }
            
            if(exists == true){
                JOptionPane.showMessageDialog(this, "You have already given a rating for this doctor.");
            }else{
                if(valid == true){
                    Rating newRating = new Rating(doctorID, userSession.getUID(), rateValue, message);
                    Augment.addRating(newRating);
                    JOptionPane.showMessageDialog(this, "Rating added.");
                }
                
            }
        }catch(Exception e){}
        
        
    }//GEN-LAST:event_rateDoctorButtonActionPerformed

    private void terminateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminateButtonActionPerformed
        User[] allUsers = null;
        User thisUser = null;
        User[] pendingAccounts = null; //array of accounts in termination
        User[] output = null;
        
        //reads all users
        try{
            allUsers = FileReader.readUsers();
        }catch(Exception e){}
        
        //fetches the user object associated with the logged in account
        for(int i = 0; i < allUsers.length; i++){
            if(allUsers[i].getUniqueID().compareTo(userSession.getUID()) == 0){
                thisUser = allUsers[i]; 
            }
        }
        try{
            pendingAccounts = FileReader.readAccountTerminationRequests();
            output = new User[pendingAccounts.length + 1];
            for(int i = 0; i < pendingAccounts.length; i++){
                output[i] = pendingAccounts[i];
            }
            output[output.length - 1] = thisUser;
            FileWriter.writeAccountTermRequests(output);
        }catch(Exception e){}
        
        Login newForm = new Login();
        newForm.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_terminateButtonActionPerformed

    private void viewRatingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRatingButtonActionPerformed
        ViewRatings newForm = new ViewRatings();
        newForm.setVisible(true);
    }//GEN-LAST:event_viewRatingButtonActionPerformed

    private void appointmentSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentSelectActionPerformed
        try{
            int pos = 0;
            Appointment all[] = FileReader.readAppointments();
            User allUsers[] = FileReader.readUsers();
            for(int i = 0; i < all.length; i++){
                if(all[i].getAppointmentID().compareTo(appointmentSelect.getSelectedItem().toString()) == 0){
                    pos = i;
                    
                }
            }
            dateLabel.setText("DATE: " + all[pos].getDate().substring(0,2) + "/"
                    + all[pos].getDate().substring(2,4) + "/" + all[pos].getDate().substring(4,8));
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().compareTo(all[pos].getDoctorID()) == 0){
                    doctorLabel.setText("DOCTOR: " + allUsers[i].getFirstName() + " " + allUsers[i].getLastName());
                }
            }
                noteLabel.setText("NOTES: " + all[pos].getNotes());
        }catch(Exception e){}
    }//GEN-LAST:event_appointmentSelectActionPerformed

    private void viewPrescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPrescriptionButtonActionPerformed
        ViewPrescription newForm = new ViewPrescription(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_viewPrescriptionButtonActionPerformed

    private void requestAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestAppointmentButtonActionPerformed
        RequestAppointment newForm = new RequestAppointment(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_requestAppointmentButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> appointmentSelect;
    private javax.swing.JLayeredPane buttonPanel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField messageText;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JButton rateDoctorButton;
    private javax.swing.JComboBox<String> ratingSelect;
    private javax.swing.JButton requestAppointmentButton;
    private javax.swing.JComboBox<String> selectDoctor;
    private javax.swing.JButton terminateButton;
    private javax.swing.JButton viewPrescriptionButton;
    private javax.swing.JButton viewRatingButton;
    // End of variables declaration//GEN-END:variables
}
