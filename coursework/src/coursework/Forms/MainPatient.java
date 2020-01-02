package coursework.Forms;

import coursework.Functions.FileReader;
import coursework.Functions.FileWriter;
import coursework.Objects.Session;
import coursework.Users.Doctor;
import coursework.Users.User;

public class MainPatient extends javax.swing.JFrame {
    Session userSession;
    User allUsers[] = null;
    Doctor allDoctors[] = null;
    public MainPatient(){
        initComponents();
        this.setResizable(false);
    }
    
    public MainPatient(Session _session){
        initComponents();
        this.setResizable(false); 
        userSession = _session;
        loadData();
    }
    
    public void loadData(){
        selectDoctor.removeAllItems();
        ratingSelect.removeAllItems();
        try{
            allUsers = FileReader.readUsers();
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().substring(0,1).compareTo("D") == 0){
                    selectDoctor.addItem(allUsers[i].getUniqueID() + ":" + allUsers[i].getFirstName() 
                            + ":" + allUsers[i].getLastName());
                }
            }
        }catch(Exception e){}
        for(int i = 1; i < 6; i++){
            ratingSelect.addItem(i + "*");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JLayeredPane();
        viewRatingButton = new javax.swing.JButton();
        requestAppointmentButton = new javax.swing.JButton();
        viewHistoryButton = new javax.swing.JButton();
        viewAppointmentButton = new javax.swing.JButton();
        viewPrescriptionButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        terminateButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rateDoctorButton = new javax.swing.JButton();
        selectDoctor = new javax.swing.JComboBox<>();
        messageText = new javax.swing.JTextField();
        ratingSelect = new javax.swing.JComboBox<>();

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

        viewHistoryButton.setText("View History");

        viewAppointmentButton.setText("View Appointment");

        viewPrescriptionButton.setText("View Prescription");

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
        buttonPanel.setLayer(viewHistoryButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(viewAppointmentButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                            .addComponent(viewHistoryButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(requestAppointmentButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewRatingButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewAppointmentButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewPrescriptionButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(terminateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(viewRatingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestAppointmentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewHistoryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewAppointmentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPrescriptionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terminateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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
                        .addComponent(rateDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 113, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selectDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ratingSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login loginForm = new Login();
        loginForm.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void rateDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateDoctorButtonActionPerformed
        try{
            String message = messageText.getText();
            int rateValue = ratingSelect.getSelectedIndex() + 1;
        }catch(Exception e){
            
        }
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane buttonPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField messageText;
    private javax.swing.JButton rateDoctorButton;
    private javax.swing.JComboBox<String> ratingSelect;
    private javax.swing.JButton requestAppointmentButton;
    private javax.swing.JComboBox<String> selectDoctor;
    private javax.swing.JButton terminateButton;
    private javax.swing.JButton viewAppointmentButton;
    private javax.swing.JButton viewHistoryButton;
    private javax.swing.JButton viewPrescriptionButton;
    private javax.swing.JButton viewRatingButton;
    // End of variables declaration//GEN-END:variables
}
