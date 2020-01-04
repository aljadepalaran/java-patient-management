package coursework.Forms;

import coursework.Functions.FileReader;
import coursework.Objects.Rating;
import coursework.Users.User;

public class ViewRatings extends javax.swing.JFrame {

    User allUsers[] = null;
    
    public ViewRatings() {
        initComponents();
        this.setResizable(false);
        loadDoctors();
        
    }
    
    public void loadDoctors(){
        doctorSelect.removeAllItems();
        try{
            allUsers = FileReader.readUsers();
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().substring(0,1).compareTo("D") == 0){
                    doctorSelect.addItem(allUsers[i].getUniqueID() + ":" + allUsers[i].getFirstName() 
                            + ":" + allUsers[i].getLastName());
                }
            }
        }catch(Exception e){}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        doctorSelect = new javax.swing.JComboBox<>();
        patientSelect = new javax.swing.JComboBox<>();
        ratingLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        messageField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        doctorSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        doctorSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorSelectActionPerformed(evt);
            }
        });

        patientSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patientSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSelectActionPerformed(evt);
            }
        });

        ratingLabel.setText("Rating:");

        messageLabel.setText("Message:");

        messageField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(doctorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ratingLabel)
                            .addComponent(messageLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingLabel)
                .addGap(12, 12, 12)
                .addComponent(messageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doctorSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorSelectActionPerformed
        Rating ratingArray[] = null;
        patientSelect.removeAllItems();
        ratingLabel.setText("Rating: ");
        messageField.setText("");
        try{
            ratingArray = FileReader.readRatings();
            for(int i = 0; i < ratingArray.length; i++){
            if(ratingArray[i].getDoctorID().compareTo(doctorSelect.getSelectedItem().toString().substring(0,5)) == 0){
                patientSelect.addItem(ratingArray[i].getPatientID());
            }
        }
        }catch(Exception e){}
    }//GEN-LAST:event_doctorSelectActionPerformed

    private void patientSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSelectActionPerformed
        Rating ratingArray[] = null;
        ratingLabel.setText("Rating: ");
        messageField.setText("");
        try{
            ratingArray = FileReader.readRatings();
            for(int i = 0; i < ratingArray.length; i++){
                if(ratingArray[i].getDoctorID().compareTo(doctorSelect.getSelectedItem().toString().substring(0,5)) == 0){
                    if(ratingArray[i].getPatientID().compareTo(patientSelect.getSelectedItem().toString().substring(0,5)) == 0){
                        ratingLabel.setText("Rating: " + ratingArray[i].getRatingValue() + "*");
                        messageField.setText(ratingArray[i].getMessage());
                    }
                }
            }
        }catch(Exception e){}
    }//GEN-LAST:event_patientSelectActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRatings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> doctorSelect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField messageField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JComboBox<String> patientSelect;
    private javax.swing.JLabel ratingLabel;
    // End of variables declaration//GEN-END:variables
}
