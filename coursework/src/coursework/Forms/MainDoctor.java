package coursework.Forms;

import coursework.Functions.FileReader;
import coursework.Functions.FileWriter;
import coursework.Functions.Resize;
import coursework.Objects.Appointment;
import coursework.Objects.Session;
import coursework.Users.User;
import javax.swing.JOptionPane;

public class MainDoctor extends javax.swing.JFrame {
    
    //GLOBAL VARIABLES
    Session userSession;
    Appointment readArray[] = null;
    Appointment doctorAppointments[] = new Appointment[1];
    User userArray[] = null;
    
    public MainDoctor() {
        initComponents();
        this.setResizable(false);
    }
    
    public MainDoctor(Session _session) {
        initComponents();
        this.setResizable(false);
        userSession = _session;
        patientSelect.removeAllItems();
        historyPatient.removeAllItems();
        historyDate.removeAllItems();
        try{
            readArray = FileReader.readAppointments();
        }catch(Exception e){}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JLayeredPane();
        viewAppointmentButton = new javax.swing.JButton();
        viewHistoryButton = new javax.swing.JButton();
        createAppointmentButton = new javax.swing.JButton();
        prescribeButton = new javax.swing.JButton();
        createMedicineButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        patientSelect = new javax.swing.JComboBox<>();
        makeNoteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        noteField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        historyDate = new javax.swing.JComboBox<>();
        historyPatient = new javax.swing.JComboBox<>();
        historyNote = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        doctorText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Form");

        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        viewAppointmentButton.setText("View Appointments");
        viewAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAppointmentButtonActionPerformed(evt);
            }
        });

        viewHistoryButton.setText("Patient History");
        viewHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHistoryButtonActionPerformed(evt);
            }
        });

        createAppointmentButton.setText("Create Appointment");
        createAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAppointmentButtonActionPerformed(evt);
            }
        });

        prescribeButton.setText("Prescribe");

        createMedicineButton.setText("Create Medicine");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        buttonPanel.setLayer(viewAppointmentButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(viewHistoryButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(createAppointmentButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(prescribeButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(createMedicineButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(logoutButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createAppointmentButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(viewHistoryButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAppointmentButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prescribeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createMedicineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewAppointmentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewHistoryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAppointmentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prescribeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createMedicineButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        patientSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patientSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSelectActionPerformed(evt);
            }
        });

        makeNoteButton.setText("Update Notes");
        makeNoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeNoteButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Date:");

        jLabel2.setText("Notes:");

        dateText.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        historyDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        historyDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyDateActionPerformed(evt);
            }
        });

        historyPatient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        historyPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyPatientActionPerformed(evt);
            }
        });

        historyNote.setEditable(false);

        jLabel4.setText("Notes:");

        jLabel3.setText("Doctor:");

        doctorText.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(86, 86, 86))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(historyPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(historyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(historyNote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historyDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historyPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historyNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(makeNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noteField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(makeNoteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAppointmentButtonActionPerformed
        
        try{
            readArray = FileReader.readAppointments();
        }catch(Exception e){}
        
        for(int i = 0; i < readArray.length; i++){
            System.out.println(readArray[i].getAppointmentID());
            if(readArray[i].getDoctorID().compareTo(userSession.getUID()) == 0){
                if(doctorAppointments[doctorAppointments.length - 1] == null){
                    doctorAppointments[doctorAppointments.length - 1] = readArray[i];
                }else{
                    doctorAppointments = Resize.appointmentArray(doctorAppointments, doctorAppointments.length + 1);
                    doctorAppointments[doctorAppointments.length - 1] = readArray[i];
                }
            }
        }
        for(int i = 0; i < doctorAppointments.length; i++){
            patientSelect.addItem(doctorAppointments[i].getPatientID() + ":" + doctorAppointments[i].getDate());
        }
    }//GEN-LAST:event_viewAppointmentButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login loginForm = new Login();
        loginForm.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void createAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAppointmentButtonActionPerformed
        Creator newForm = new Creator(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_createAppointmentButtonActionPerformed

    private void makeNoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeNoteButtonActionPerformed
        String output = noteField.getText();
        Appointment selected = doctorAppointments[patientSelect.getSelectedIndex()];
        doctorAppointments[patientSelect.getSelectedIndex()].setNotes(output);
        for(int i = 0; i < readArray.length; i++){
            if(readArray[i].getAppointmentID().compareTo(selected.getAppointmentID()) == 0){
                readArray[i].setNotes(output);
            }
        }
        try{
            FileWriter.writeAppointments(readArray);
            JOptionPane.showMessageDialog(this, "Notes updated.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Update Unsuccessful.");
        }
    }//GEN-LAST:event_makeNoteButtonActionPerformed

    private void patientSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSelectActionPerformed
        try{
            String date = doctorAppointments[patientSelect.getSelectedIndex()].getDate();
            dateText.setText(date.substring(0,2) + "/" + date.substring(2,4) + "/" + date.substring(4,8));
            noteField.setText(doctorAppointments[patientSelect.getSelectedIndex()].getNotes());
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_patientSelectActionPerformed
    
    private void viewHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHistoryButtonActionPerformed
        historyPatient.removeAllItems();
        try{
            userArray = FileReader.readUsers();
        }catch(Exception e){}
        for(int i = 0; i < userArray.length; i++){
            if(userArray[i].getUniqueID().substring(0,1).compareTo("P") == 0){
                historyPatient.addItem((userArray[i].getUniqueID()));
            }
        }
    }//GEN-LAST:event_viewHistoryButtonActionPerformed
    
    private void historyPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyPatientActionPerformed
        historyDate.removeAllItems();
        try{
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getPatientID().compareTo(historyPatient.getSelectedItem().toString()) == 0){
                    historyDate.addItem(readArray[i].getDate());
                }
            }
        }catch(Exception e){}
    }//GEN-LAST:event_historyPatientActionPerformed

    private void historyDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyDateActionPerformed
        try{
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getPatientID().compareTo(historyPatient.getSelectedItem().toString()) == 0){
                    if(readArray[i].getDate().compareTo(historyDate.getSelectedItem().toString()) == 0){
                        historyNote.setText(readArray[i].getNotes());
                        doctorText.setText(readArray[i].getDoctorID());
                    }else{}
                }else{}
            }
        }catch(Exception e){}
    }//GEN-LAST:event_historyDateActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane buttonPanel;
    private javax.swing.JButton createAppointmentButton;
    private javax.swing.JButton createMedicineButton;
    private javax.swing.JTextField dateText;
    private javax.swing.JTextField doctorText;
    private javax.swing.JComboBox<String> historyDate;
    private javax.swing.JTextField historyNote;
    private javax.swing.JComboBox<String> historyPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton makeNoteButton;
    private javax.swing.JTextField noteField;
    private javax.swing.JComboBox<String> patientSelect;
    private javax.swing.JButton prescribeButton;
    private javax.swing.JButton viewAppointmentButton;
    private javax.swing.JButton viewHistoryButton;
    // End of variables declaration//GEN-END:variables
}
