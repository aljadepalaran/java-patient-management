package coursework.Forms;

import Default.FileIO;
import Default.Functions;
import coursework.Objects.Session;
import coursework.Users.Doctor;
import coursework.Users.User;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class MainAdministrator extends javax.swing.JFrame {
    Session userSession;
    DefaultListModel listValues = new DefaultListModel();
    User doctorArray[] = new User[1];
    User secretaryArray[] = new User[1];
    User readArray[];
    int removeType = 0; //0=default, 1=doctor, 2=secretary
    public MainAdministrator() {
        initComponents();
        this.setResizable(false);
    }
    
    public MainAdministrator(Session _session) {
        initComponents();
        this.setResizable(false);   
        userSession = _session;
        JOptionPane.showMessageDialog(this, "You have logged in as: " + userSession.getUID());
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
        feedbackButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listField = new javax.swing.JList<>();
        confirmButton = new javax.swing.JButton();

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

        feedbackButton.setText("Provide Feedback");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        buttonPanel.setLayer(createAdminButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(addSecretaryButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(removeSecretaryButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(addDoctorButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(removeDoctorButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(feedbackButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(logoutButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDoctorButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(removeSecretaryButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSecretaryButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createAdminButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeDoctorButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feedbackButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(feedbackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        listField.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listField);

        confirmButton.setText("Confirm");
        confirmButton.setEnabled(false);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(confirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
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
           JOptionPane.showMessageDialog(this, "SELECTED: " + uniqueID);
           
           
           displayDoctors();
       }else if(removeType == 2){
           String uniqueID = secretaryArray[listField.getSelectedIndex()].getUniqueID();
           JOptionPane.showMessageDialog(this, "SELECTED: " + uniqueID);
           
            displaySecretaries(); 
       }
    }//GEN-LAST:event_confirmButtonActionPerformed

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
            readArray = FileIO.readFile();
        }catch(Exception e){
            System.out.println("Error reading from file! " + e);
        }
        for(int i = 0; i < readArray.length; i++){
            if(readArray[i].getUniqueID().substring(0,1).compareTo("D") == 0){
                if(doctorArray[doctorArray.length - 1] == null){
                    doctorArray[doctorArray.length - 1] = readArray[i];
                }else{
                    doctorArray = Functions.resizeArray(doctorArray, doctorArray.length + 1);
                    doctorArray[doctorArray.length - 1] = readArray[i];
                }
            }
        }
        for(int i = 0; i < readArray.length; i++){
            if(readArray[i].getUniqueID().substring(0,1).compareTo("S") == 0){
                if(secretaryArray[secretaryArray.length - 1] == null){
                    secretaryArray[secretaryArray.length - 1] = readArray[i];
                }else{
                    secretaryArray = Functions.resizeArray(secretaryArray, secretaryArray.length + 1);
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
    private javax.swing.JLayeredPane buttonPanel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton createAdminButton;
    private javax.swing.JButton feedbackButton;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton removeDoctorButton;
    private javax.swing.JButton removeSecretaryButton;
    // End of variables declaration//GEN-END:variables
}
