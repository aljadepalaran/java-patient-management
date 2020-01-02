package coursework.Forms;

import coursework.Objects.*;
import javax.swing.JOptionPane;
import coursework.Users.*;
import coursework.Functions.*;

public class MainSecretary extends javax.swing.JFrame {

    Session userSession;
    Patient approvals[];
    Appointment requests[];
    User termReq[];
    public MainSecretary() {
        initComponents();
        this.setResizable(false);
    }

    public MainSecretary(Session _session) {
        initComponents();
        this.setResizable(false);
        userSession = _session;
        patientSelect.removeAllItems();
        appSelect.removeAllItems();
        termSelect.removeAllItems();
        remPatient.removeAllItems();
        readAll();
        if (approvals.length > 0 || requests.length > 0) {
            JOptionPane.showMessageDialog(this, "You have " + approvals.length
                    + " patient approvals & " + requests.length + " appointment approvals");
        }
        displayAll();
    }

    public void readAll() {
        User[] allRequests = null;
        User allUsers[] = null;
        try {
            allRequests = FileReader.readRequests();
            termReq = FileReader.readAccountTerminationRequests();
            requests = FileReader.readAppointmentRequests();
            allUsers = FileReader.readUsers();
        } catch (Exception e) {}
        approvals = new Patient[allRequests.length];
        for (int i = 0; i < allRequests.length; i++) {
            approvals[i] = (Patient) allRequests[i];
        }
        for(int i = 0; i < allUsers.length; i++){
            if(allUsers[i].getUniqueID().substring(0,1).compareTo("P") == 0){
                remPatient.addItem(allUsers[i].getUniqueID());
            }
        }

    }

    public void displayAll() {
        try{
            if(approvals.length > 0) {
                for (int i = 0; i < approvals.length; i++) {
                    patientSelect.addItem(approvals[i].getUniqueID());
                }
            } else {
            }
            if (requests.length > 0) {
                for (int i = 0; i < requests.length; i++) {
                    appSelect.addItem("ID: " + requests[i].getAppointmentID());
                }
            }
            for(int i = 0; i < termReq.length; i++){
                termSelect.addItem("ID: " + termReq[i].getUniqueID());
            }
        }catch(Exception e){}
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JLayeredPane();
        giveMedicineButton = new javax.swing.JButton();
        orderStockButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        approveAccountButton = new javax.swing.JButton();
        patientSelect = new javax.swing.JComboBox<>();
        nameText = new javax.swing.JLabel();
        addressText = new javax.swing.JLabel();
        dobText = new javax.swing.JLabel();
        genderText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        appSelect = new javax.swing.JComboBox<>();
        approveAppointmentButton = new javax.swing.JButton();
        doctorText = new javax.swing.JLabel();
        patientText = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        termSelect = new javax.swing.JComboBox<>();
        approveTerminationButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        removeButton = new javax.swing.JButton();
        remPatient = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secretary Form");

        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        giveMedicineButton.setText("Give Medicine");

        orderStockButton.setText("Order Stock");
        orderStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderStockButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        buttonPanel.setLayer(giveMedicineButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(orderStockButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(logoutButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderStockButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(giveMedicineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderStockButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giveMedicineButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        approveAccountButton.setText("Approve Account");
        approveAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveAccountButtonActionPerformed(evt);
            }
        });

        patientSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patientSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSelectActionPerformed(evt);
            }
        });

        nameText.setText("NAME:");

        addressText.setText("ADDRESS:");

        dobText.setText("DOB:");

        genderText.setText("GENDER:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(patientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(approveAccountButton))
                            .addComponent(nameText)
                            .addComponent(addressText))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dobText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genderText)
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveAccountButton)
                    .addComponent(patientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobText)
                    .addComponent(genderText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        appSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appSelectActionPerformed(evt);
            }
        });

        approveAppointmentButton.setText("Approve Appointment");
        approveAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveAppointmentButtonActionPerformed(evt);
            }
        });

        doctorText.setText("DOCTOR:");

        patientText.setText("PATIENT:");

        dateText.setText("DATE:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(appSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(approveAppointmentButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorText)
                            .addComponent(patientText)
                            .addComponent(dateText))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveAppointmentButton)
                    .addComponent(appSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctorText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        termSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        approveTerminationButton.setText("Approve Termination");
        approveTerminationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveTerminationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(termSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(approveTerminationButton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(approveTerminationButton)
                    .addComponent(termSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        remPatient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(remPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(remPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void approveAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveAccountButtonActionPerformed
        Patient selectedPatient = approvals[patientSelect.getSelectedIndex()];
        Augment.addUser(selectedPatient);
        Augment.removeApproval(selectedPatient.getUniqueID());
        patientSelect.removeAllItems();
        readAll();
        displayAll();

    }//GEN-LAST:event_approveAccountButtonActionPerformed

    private void patientSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSelectActionPerformed

        try {
            Patient selectedPatient = approvals[patientSelect.getSelectedIndex()];
            String gender = "";
            nameText.setText("NAME: " + selectedPatient.getFirstName() + " "
                    + selectedPatient.getLastName());
            addressText.setText("ADDRESS: " + selectedPatient.getAddress());
            dobText.setText("DOB: " + selectedPatient.getDOB().substring(0, 2) + "/"
                    + selectedPatient.getDOB().substring(2, 4) + "/"
                    + selectedPatient.getDOB().substring(4, 8));
            if (selectedPatient.getSex() == 'M') {
                gender = "Male";
            } else {
                gender = "Female";
            }
            genderText.setText("GENDER: " + gender);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_patientSelectActionPerformed

    private void appSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appSelectActionPerformed
        try {
            Appointment selected = requests[appSelect.getSelectedIndex()];
            doctorText.setText("DOCTOR: " + selected.getDoctorID());
            patientText.setText("PATIENT: " + selected.getPatientID());
            dateText.setText("DATE: " + selected.getDate().substring(0, 2) + "/"
                    + selected.getDate().substring(2, 4) + "/"
                    + selected.getDate().substring(4, 8));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_appSelectActionPerformed

    private void approveAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveAppointmentButtonActionPerformed
        Appointment selectedAppointment = requests[appSelect.getSelectedIndex()];
        Augment.addAppointment(selectedAppointment);
        Augment.removeAppointmentRequest(selectedAppointment.getAppointmentID());
        appSelect.removeAllItems();
        readAll();
        displayAll();
    }//GEN-LAST:event_approveAppointmentButtonActionPerformed

    private void orderStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderStockButtonActionPerformed
        OrderStock newForm = new OrderStock();
        newForm.setVisible(true);
    }//GEN-LAST:event_orderStockButtonActionPerformed

    private void approveTerminationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveTerminationButtonActionPerformed
        try{
            String remID = termSelect.getSelectedItem().toString().substring(4,9);
            Augment.removeTerminationRequest(remID);
            Augment.removeUser(remID);
        }catch(Exception e){
        }
        
    }//GEN-LAST:event_approveTerminationButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        try{
            String remID = remPatient.getSelectedItem().toString().substring(0,5);
            Augment.removeUser(remID);
            remPatient.removeAllItems();
            readAll();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Patient removal failed.");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSecretary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressText;
    private javax.swing.JComboBox<String> appSelect;
    private javax.swing.JButton approveAccountButton;
    private javax.swing.JButton approveAppointmentButton;
    private javax.swing.JButton approveTerminationButton;
    private javax.swing.JLayeredPane buttonPanel;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel dobText;
    private javax.swing.JLabel doctorText;
    private javax.swing.JLabel genderText;
    private javax.swing.JButton giveMedicineButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel nameText;
    private javax.swing.JButton orderStockButton;
    private javax.swing.JComboBox<String> patientSelect;
    private javax.swing.JLabel patientText;
    private javax.swing.JComboBox<String> remPatient;
    private javax.swing.JButton removeButton;
    private javax.swing.JComboBox<String> termSelect;
    // End of variables declaration//GEN-END:variables
}
