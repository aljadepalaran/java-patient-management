package coursework.Forms;

import coursework.Objects.*;
import coursework.Functions.*;
import coursework.Users.*;
import javax.swing.JOptionPane;

public class GiveMedicine extends javax.swing.JFrame {

    Session userSession;
    Prescription allPrescriptions[] = null;
    Prescription selectedPrescription;
    Medicine allMeds[] = null;
    Medicine selectedMedicine;
    User allUsers[];
    
    public GiveMedicine() {
        initComponents();
    }

    public GiveMedicine(Session _input) {
        initComponents();
        userSession = _input;
        selectPrescription.removeAllItems();
        loadData();
    }
    
    public void loadData(){
        try{
            allPrescriptions = FileReader.readRequestedPrescriptions();
            for(int i = 0; i < allPrescriptions.length; i++){
                selectPrescription.addItem((allPrescriptions[i].getPrescriptionID()));
            }
            allMeds = FileReader.readMedicines();
            allUsers = FileReader.readUsers();
        }catch(Exception e){}
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        selectPrescription = new javax.swing.JComboBox<>();
        giveButton = new javax.swing.JButton();
        patientLabel = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        notesLabel = new javax.swing.JLabel();
        medicineLabel = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JLabel();
        dosageLabel = new javax.swing.JLabel();
        stockLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        selectPrescription.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPrescriptionActionPerformed(evt);
            }
        });

        giveButton.setText("Give");
        giveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveButtonActionPerformed(evt);
            }
        });

        patientLabel.setText("PATIENT:");

        doctorLabel.setText("DOCTOR:");

        notesLabel.setText("NOTES:");

        medicineLabel.setText("MEDICINE:");

        qtyLabel.setText("REQUESTED QTY:");

        dosageLabel.setText("DOSAGE:");

        stockLabel.setText("CURRENT STOCK:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectPrescription, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(giveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientLabel)
                            .addComponent(doctorLabel)
                            .addComponent(notesLabel)
                            .addComponent(medicineLabel)
                            .addComponent(qtyLabel)
                            .addComponent(stockLabel)
                            .addComponent(dosageLabel))
                        .addGap(0, 152, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(patientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicineLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stockLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dosageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(giveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

        setSize(new java.awt.Dimension(288, 304));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPrescriptionActionPerformed
        try{
            String selectedID = selectPrescription.getSelectedItem().toString();
            for(int i = 0; i < allPrescriptions.length; i++){   //retrieves the selected prescription
                if(allPrescriptions[i].getPrescriptionID().compareTo(selectedID) == 0){
                    selectedPrescription = allPrescriptions[i];
                }
            }
            for(int i = 0; i < allMeds.length; i++){    //retrieves the selected medicine for the prescription
                if(allMeds[i].getMedicineName().compareTo(selectedPrescription.getMedicineType().getMedicineName()) == 0){
                    selectedMedicine = allMeds[i];
                }
            }
            for(int i = 0; i < allUsers.length; i++){   
                if(allUsers[i].getUniqueID().compareTo(selectedPrescription.getPatientID()) == 0){  //retrieves the patient and displays their name
                    patientLabel.setText("PATIENT: " + allUsers[i].getFirstName() + " " + allUsers[i].getLastName());
                }
                if(allUsers[i].getUniqueID().compareTo(selectedPrescription.getDoctorID()) == 0){   //retrieves the doctor and displays their name
                    doctorLabel.setText("DOCTOR: " + allUsers[i].getFirstName() + " " + allUsers[i].getLastName());
                }
            }
            //sets the information for the prescription onto the labels.
            notesLabel.setText("NOTES: " + selectedPrescription.getNotes());
            medicineLabel.setText("MEDICINE: " + selectedPrescription.getMedicineType().getMedicineName());
            qtyLabel.setText("REQUESTED QTY: " + selectedPrescription.getQuantity());
            stockLabel.setText("CURRENT STOCK: " + selectedMedicine.getStock());
            dosageLabel.setText("DOSAGE: " + selectedPrescription.getDosage());
        }catch(Exception e){}
    }//GEN-LAST:event_selectPrescriptionActionPerformed

    private void giveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveButtonActionPerformed
        try{
            if(selectedPrescription.getQuantity() > selectedMedicine.getStock()){   //checks if there is enough stock for the prescription
                JOptionPane.showMessageDialog(this, "Not enough stock.");
            }else if(selectedPrescription.getQuantity() < selectedMedicine.getStock()){
                Augment.removePrescriptionRequest(selectedPrescription.getPrescriptionID());
                Augment.addPrescription(selectedPrescription);
                for(int i = 0; i < allMeds.length; i++){
                    if(allMeds[i].getMedicineName().compareTo(selectedMedicine.getMedicineName()) == 0){//removes the quantity given from the stock
                        allMeds[i].setStock(allMeds[i].getStock() - selectedPrescription.getQuantity());
                    }
                }
                FileWriter.writeMedicines(allMeds);//writes the new stock into the file
                JOptionPane.showMessageDialog(this, "Prescription fulfilled.");
                this.setVisible(false);
                this.dispose();
            }
        }catch(Exception e){}
    }//GEN-LAST:event_giveButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MainSecretary newForm = new MainSecretary(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiveMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JLabel dosageLabel;
    private javax.swing.JButton giveButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel medicineLabel;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JComboBox<String> selectPrescription;
    private javax.swing.JLabel stockLabel;
    // End of variables declaration//GEN-END:variables
}
