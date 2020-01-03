package coursework.Forms;

import coursework.Functions.Augment;
import coursework.Functions.FileReader;
import coursework.Functions.GenerateID;
import coursework.Functions.MainFunctions;
import coursework.Functions.Resize;
import coursework.Objects.*;
import coursework.Users.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class MainAdministrator extends javax.swing.JFrame {
    
    Session userSession;
    DefaultListModel listValues = new DefaultListModel();
    User doctorArray[] = new User[1];
    User secretaryArray[] = new User[1];
    User readArray[];
    Rating doctorRatings[];
    int removeType = 0; //0=default, 1=doctor, 2=secretary
    
    public MainAdministrator() {
        initComponents();
        this.setResizable(false);
    }
    
    public MainAdministrator(Session _session) {
        initComponents();
        this.setResizable(false);   
        doctorDropdown.removeAllItems();
        patientDropdown.removeAllItems();
        listValues = new DefaultListModel();    
        listField.setModel(listValues);
        userSession = _session;
        loadArrays();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonPanel = new javax.swing.JLayeredPane();
        createAdminButton = new javax.swing.JButton();
        addSecretaryButton = new javax.swing.JButton();
        removeSecretaryButton = new javax.swing.JButton();
        addDoctorButton = new javax.swing.JButton();
        removeDoctorButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        viewRatingsButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listField = new javax.swing.JList<>();
        confirmButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        patientDropdown = new javax.swing.JComboBox<>();
        doctorDropdown = new javax.swing.JComboBox<>();
        ratingLabel = new javax.swing.JLabel();
        messageBox = new javax.swing.JTextField();
        adminFeedback = new javax.swing.JTextField();
        feedbackButton = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator Form");

        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        createAdminButton.setText("Create Administrator");
        createAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdminButtonActionPerformed(evt);
            }
        });

        addSecretaryButton.setText("Add Secretary");
        addSecretaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSecretaryButtonActionPerformed(evt);
            }
        });

        removeSecretaryButton.setText("Remove Secretary");
        removeSecretaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSecretaryButtonActionPerformed(evt);
            }
        });

        addDoctorButton.setText("Add Doctor");
        addDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorButtonActionPerformed(evt);
            }
        });

        removeDoctorButton.setText("Remove Doctor");
        removeDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDoctorButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Reload");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        viewRatingsButton.setText("View Ratings");
        viewRatingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRatingsButtonActionPerformed(evt);
            }
        });

        buttonPanel.setLayer(createAdminButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(addSecretaryButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(removeSecretaryButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(addDoctorButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(removeDoctorButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(logoutButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(refreshButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(viewRatingsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addDoctorButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeSecretaryButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addSecretaryButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createAdminButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(removeDoctorButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(viewRatingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAdminButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSecretaryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeSecretaryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addDoctorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeDoctorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewRatingsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(refreshButton))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listField.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listField);

        confirmButton.setText("Remove");
        confirmButton.setEnabled(false);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        patientDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patientDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDropdownActionPerformed(evt);
            }
        });

        doctorDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        doctorDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorDropdownActionPerformed(evt);
            }
        });

        ratingLabel.setFont(new java.awt.Font("Dosis", 1, 36)); // NOI18N
        ratingLabel.setText("##");

        messageBox.setEditable(false);
        messageBox.setFont(new java.awt.Font("Dosis", 0, 14)); // NOI18N
        messageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageBoxActionPerformed(evt);
            }
        });

        adminFeedback.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N

        feedbackButton.setText("Provide Feedback");
        feedbackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorDropdown, 0, 206, Short.MAX_VALUE)
                            .addComponent(patientDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(ratingLabel)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(messageBox)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(feedbackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(adminFeedback)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ratingLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(doctorDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(messageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(feedbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(540, 359));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdminButtonActionPerformed
        Register registrationForm = new Register('A');
        registrationForm.setVisible(true);
    }//GEN-LAST:event_createAdminButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login loginForm = new Login();
        loginForm.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void addSecretaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSecretaryButtonActionPerformed
        Register registrationForm = new Register('S');
        registrationForm.setVisible(true);
    }//GEN-LAST:event_addSecretaryButtonActionPerformed

    private void addDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorButtonActionPerformed
        Register registrationForm = new Register('D');
        registrationForm.setVisible(true);
    }//GEN-LAST:event_addDoctorButtonActionPerformed

    private void removeSecretaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSecretaryButtonActionPerformed
        displaySecretaries();
        confirmButton.setEnabled(true);
        removeType = 2;
    }//GEN-LAST:event_removeSecretaryButtonActionPerformed

    private void removeDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDoctorButtonActionPerformed
        displayDoctors();
        confirmButton.setEnabled(true);
        removeType = 1;
    }//GEN-LAST:event_removeDoctorButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
       if(removeType == 0){
           //invalid type
       }else if(removeType == 1){
           String uniqueID = doctorArray[listField.getSelectedIndex()].getUniqueID();
           Augment.removeUser(uniqueID);
           refreshForm();
       }else if(removeType == 2){
           String uniqueID = secretaryArray[listField.getSelectedIndex()].getUniqueID();
           Augment.removeUser(uniqueID);
           refreshForm();
       }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshForm();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void viewRatingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRatingsButtonActionPerformed
        doctorDropdown.removeAllItems();
        for(int i = 0; i < doctorArray.length; i++){
            Doctor displayDoctor = (Doctor)doctorArray[i];
            doctorDropdown.addItem(displayDoctor.getUniqueID() + ":" + 
            displayDoctor.getFirstName() + ":" + displayDoctor.getLastName());
        }
    }//GEN-LAST:event_viewRatingsButtonActionPerformed

    private void doctorDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorDropdownActionPerformed
        patientDropdown.removeAllItems();
        try{
            String doctorID = doctorArray[doctorDropdown.getSelectedIndex()].getUniqueID();
            doctorRatings = MainFunctions.getRating(doctorID); //ratings for the doctor
            for(int i = 0; i < doctorRatings.length; i++){
                patientDropdown.addItem("PATIENT:" + doctorRatings[i].getPatientID());
            }
        }catch(Exception e){
            ratingLabel.setText("##");
            messageBox.setText("");
        }
    }//GEN-LAST:event_doctorDropdownActionPerformed

    private void patientDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDropdownActionPerformed
        try{
            Rating selectedRating = doctorRatings[patientDropdown.getSelectedIndex()];
            ratingLabel.setText(selectedRating.getRatingValue() + "*");
            messageBox.setText(selectedRating.getMessage());
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_patientDropdownActionPerformed

    private void feedbackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackButtonActionPerformed
        try{
            String feedback = adminFeedback.getText();
            if(feedback.compareTo("") == 0){
                JOptionPane.showMessageDialog(this, "Feedback message empty.");
            }else{
                Rating selectedRating = doctorRatings[patientDropdown.getSelectedIndex()];
                String doctorID = selectedRating.getDoctorID();
                String patientID = selectedRating.getPatientID();
                String adminID = userSession.getUID();
                String feedbackID = GenerateID.feedbackID();
                Feedback newFeedback = new Feedback(feedbackID, doctorID, patientID, adminID, feedback);
                Augment.addFeedback(newFeedback);
                JOptionPane.showMessageDialog(this, "Your feedback has been added.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Feedback not added."); 
        }
    }//GEN-LAST:event_feedbackButtonActionPerformed

    private void messageBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageBoxActionPerformed
 
    public void refreshForm(){
        MainAdministrator reloadForm = new MainAdministrator(userSession);
        reloadForm.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }
    
    public void displaySecretaries(){       
        listValues = new DefaultListModel();    
        listField.setModel(listValues);
        for(int i = 0; i < secretaryArray.length; i++){
            listValues.addElement(secretaryArray[i].getUniqueID() + ":" + secretaryArray[i].getFirstName() + ":" + secretaryArray[i].getLastName()); 
        }
    }
    public void displayDoctors(){
        listValues = new DefaultListModel();          
        listField.setModel(listValues);
        for(int i = 0; i < doctorArray.length; i++){
            Doctor displayDoctor = (Doctor)doctorArray[i];
            listValues.addElement(displayDoctor.getUniqueID() + ":" + displayDoctor.getFirstName() + ":" + displayDoctor.getLastName()
            + ":" + displayDoctor.getAddress()); 
        }
    }
    public void loadArrays(){
        try{
            readArray = FileReader.readUsers();
        }catch(Exception e){
            System.out.println("Error reading from file! " + e);
        }
        for(int i = 0; i < readArray.length; i++){
            if(readArray[i].getUniqueID().substring(0,1).compareTo("D") == 0){
                if(doctorArray[doctorArray.length - 1] == null){
                    doctorArray[doctorArray.length - 1] = readArray[i];
                }else{
                    doctorArray = Resize.userArray(doctorArray, doctorArray.length + 1);
                    doctorArray[doctorArray.length - 1] = readArray[i];
                }
            }
        }
        for(int i = 0; i < readArray.length; i++){
            if(readArray[i].getUniqueID().substring(0,1).compareTo("S") == 0){
                if(secretaryArray[secretaryArray.length - 1] == null){
                    secretaryArray[secretaryArray.length - 1] = readArray[i];
                }else{
                    secretaryArray = Resize.userArray(secretaryArray, secretaryArray.length + 1);
                    secretaryArray[secretaryArray.length - 1] = readArray[i];
                }
            }
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctorButton;
    private javax.swing.JButton addSecretaryButton;
    private javax.swing.JTextField adminFeedback;
    private javax.swing.JLayeredPane buttonPanel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton createAdminButton;
    private javax.swing.JComboBox<String> doctorDropdown;
    private javax.swing.JButton feedbackButton;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField messageBox;
    private javax.swing.JComboBox<String> patientDropdown;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton removeDoctorButton;
    private javax.swing.JButton removeSecretaryButton;
    private javax.swing.JButton viewRatingsButton;
    // End of variables declaration//GEN-END:variables
}
