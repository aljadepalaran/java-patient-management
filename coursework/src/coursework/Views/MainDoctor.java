package coursework.Views;

import coursework.Controllers.Augment;
import coursework.Controllers.FileReader;
import coursework.Controllers.FileWriter;
import coursework.Controllers.Resize;
import coursework.Models.Objects.Appointment;
import coursework.Models.Objects.Medicine;
import coursework.Models.Objects.Session;
import coursework.Models.Users.User;
import javax.swing.JOptionPane;

public class MainDoctor extends javax.swing.JFrame {
    
    //GLOBAL VARIABLES
    Session userSession;
    Appointment readArray[] = null;
    Appointment doctorAppointments[] = new Appointment[1];
    User userArray[] = null;
    
    public MainDoctor() {
        initComponents();
    }
    
    public MainDoctor(Session _session) {
        initComponents();
        this.setResizable(false);
        userSession = _session;
        clearForm();
        loadData();
    }
    
    //Clears the data stored in the form.
    public void clearForm(){
        patientSelect.removeAllItems();
        historyPatient.removeAllItems();
        historyDate.removeAllItems();
    }
    
    //A controller to load all the data needed for the doctor functions.
    public void loadData(){
        try{
            //APPOINTMENTS
            readArray = FileReader.readAppointments();
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
            //HISTORY
            historyPatient.removeAllItems();
            userArray = FileReader.readUsers();
            for(int i = 0; i < userArray.length; i++){
                if(userArray[i].getUniqueID().substring(0,1).compareTo("P") == 0){
                    historyPatient.addItem((userArray[i].getUniqueID()));
                }
            }   
        }catch(Exception e){}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JLayeredPane();
        proposeAppointmentButton = new javax.swing.JButton();
        prescribeButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        orderMedButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        historyDate = new javax.swing.JComboBox<>();
        historyPatient = new javax.swing.JComboBox<>();
        historyNote = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        doctorText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        patientSelect = new javax.swing.JComboBox<>();
        noteField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        makeNoteButton = new javax.swing.JButton();
        dateText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        medNameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        medDetailText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        createMedButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Form");

        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        proposeAppointmentButton.setText("Propose Appointment");
        proposeAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proposeAppointmentButtonActionPerformed(evt);
            }
        });

        prescribeButton.setText("Prescribe");
        prescribeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribeButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        orderMedButton.setText("Order Medicines");
        orderMedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderMedButtonActionPerformed(evt);
            }
        });

        buttonPanel.setLayer(proposeAppointmentButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(prescribeButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(logoutButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(orderMedButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prescribeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(proposeAppointmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(orderMedButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proposeAppointmentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prescribeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderMedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(historyNote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(historyPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(historyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        patientSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patientSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSelectActionPerformed(evt);
            }
        });

        jLabel1.setText("Date:");

        jLabel2.setText("Notes:");

        makeNoteButton.setText("Update");
        makeNoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeNoteButtonActionPerformed(evt);
            }
        });

        dateText.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(noteField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(makeNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(patientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeNoteButton))
                .addGap(4, 4, 4))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Name:");

        jLabel6.setText("Detail:");

        createMedButton.setText("Create");
        createMedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMedButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("CREATE MEDICINE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(medDetailText, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(medNameText)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createMedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createMedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(medNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medDetailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(528, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login loginForm = new Login();
        loginForm.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void proposeAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proposeAppointmentButtonActionPerformed
        Creator newForm = new Creator(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_proposeAppointmentButtonActionPerformed

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
        
    private void historyPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyPatientActionPerformed
        //Clears the data
        historyDate.removeAllItems();
        historyNote.setText("");
        doctorText.setText("");
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

    private void createMedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMedButtonActionPerformed
        String medicineName = medNameText.getText();
        String medDetail = medDetailText.getText();
        Medicine arr[] = null;
        int exists = 0; //0=does not exist, 1=exists
        try{
            arr = FileReader.readMedicines();
        }catch(Exception e){}
        
        for(int i = 0; i < arr.length; i++){//checks if it already exists
            if(arr[i].getMedicineName().toLowerCase().compareTo(medicineName.toLowerCase()) == 0){
                exists = 1;
            }
        }
        if(exists == 0){
            Medicine newMed = new Medicine(medicineName, medDetail, 0);
            Augment.addMedicine(newMed);
        }else{
            JOptionPane.showMessageDialog(this, "Medicine already exists!");
        }
        
    }//GEN-LAST:event_createMedButtonActionPerformed

    private void orderMedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderMedButtonActionPerformed
        OrderForm newForm = new OrderForm();
        newForm.setVisible(true);
    }//GEN-LAST:event_orderMedButtonActionPerformed

    private void prescribeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribeButtonActionPerformed
        PrescribeForm newForm = new PrescribeForm(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_prescribeButtonActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane buttonPanel;
    private javax.swing.JButton createMedButton;
    private javax.swing.JTextField dateText;
    private javax.swing.JTextField doctorText;
    private javax.swing.JComboBox<String> historyDate;
    private javax.swing.JTextField historyNote;
    private javax.swing.JComboBox<String> historyPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton makeNoteButton;
    private javax.swing.JTextField medDetailText;
    private javax.swing.JTextField medNameText;
    private javax.swing.JTextField noteField;
    private javax.swing.JButton orderMedButton;
    private javax.swing.JComboBox<String> patientSelect;
    private javax.swing.JButton prescribeButton;
    private javax.swing.JButton proposeAppointmentButton;
    // End of variables declaration//GEN-END:variables
}
