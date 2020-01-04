package coursework.Forms;

import coursework.Objects.*;
import coursework.Functions.*;
import coursework.Users.*;

public class ViewPrescription extends javax.swing.JFrame {

    Session userSession;
    
    public ViewPrescription() {
        initComponents();
    }
    
    public ViewPrescription(Session _input) {
        initComponents();
        this.setResizable(false);
        userSession = _input;
        showData();
    }
    
    public void showData(){
        try{
            User allUsers[] = FileReader.readUsers();
            Prescription all[] = FileReader.readPrescriptions();
            String doctorID = "";
            for(int i = 0; i < all.length; i++){
                if(all[i].getPatientID().compareTo(userSession.getUID()) == 0){
                    noteLabel.setText("NOTES: " + all[i].getNotes());
                    medLabel.setText("MEDICINE: "  + all[i].getMedicineType().getMedicineName());
                    dosageLabel.setText("DOSAGE: " + all[i].getDosage());
                    qtyLabel.setText("QUANTITY: " + all[i].getQuantity());
                    doctorID = all[i].getDoctorID();
                }
            }
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().compareTo(userSession.getUID()) == 0){
                    patientLabel.setText("PATIENT: " + allUsers[i].getFirstName() + " " + allUsers[i].getLastName());
                }
                if(allUsers[i].getUniqueID().compareTo(doctorID) == 0){
                    doctorLabel.setText("DOCTOR: " + allUsers[i].getFirstName() + " " + allUsers[i].getLastName());
                }
            }
        }catch(Exception e){}
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        patientLabel = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        medLabel = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JLabel();
        dosageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        patientLabel.setFont(new java.awt.Font("Dosis", 1, 14)); // NOI18N
        patientLabel.setText("PATIENT: ");

        doctorLabel.setFont(new java.awt.Font("Dosis", 1, 14)); // NOI18N
        doctorLabel.setText("DOCTOR: ");

        noteLabel.setFont(new java.awt.Font("Dosis", 1, 14)); // NOI18N
        noteLabel.setText("NOTES:");

        medLabel.setFont(new java.awt.Font("Dosis", 1, 14)); // NOI18N
        medLabel.setText("MEDICINE: ");

        qtyLabel.setFont(new java.awt.Font("Dosis", 1, 14)); // NOI18N
        qtyLabel.setText("QUANTITY: ");

        dosageLabel.setFont(new java.awt.Font("Dosis", 1, 14)); // NOI18N
        dosageLabel.setText("DOSAGE: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qtyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(dosageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doctorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dosageLabel)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JLabel dosageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel medLabel;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JLabel qtyLabel;
    // End of variables declaration//GEN-END:variables
}
