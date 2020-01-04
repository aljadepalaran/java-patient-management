package coursework.Forms;

import coursework.Forms.*;
import coursework.Functions.*;
import coursework.Objects.*;
import coursework.Users.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class PrescribeForm extends javax.swing.JFrame {
    
    //GLOBAL VARIABLES
    Medicine meds[] = null;
    User allUsers[] = null;
    Session userSession;
    
    public PrescribeForm() {
        initComponents();
    }
    
    public PrescribeForm(Session _input) {
        initComponents();
        selectPatient.removeAllItems();
        selectMedicine.removeAllItems();
        userSession = _input;
        loadArrays();
    }
    
    public void loadArrays(){
        try{
            allUsers = FileReader.readUsers();
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().substring(0,1).compareTo("P") == 0){
                    selectPatient.addItem("[" + allUsers[i].getUniqueID() + "]" + allUsers[i].getFirstName()
                    + " " + allUsers[i].getLastName());
                }
            }
            
            meds = FileReader.readMedicines();
            for(int i = 0; i < meds.length; i++){
                selectMedicine.addItem("[S:" + meds[i].getStock() + "]" + meds[i].getMedicineName());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        selectPatient = new javax.swing.JComboBox<>();
        selectMedicine = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        nameText = new javax.swing.JLabel();
        addressText = new javax.swing.JLabel();
        birthText = new javax.swing.JLabel();
        genderText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        noteField = new javax.swing.JTextField();
        dosageField = new javax.swing.JTextField();
        prescribeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        selectPatient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPatientActionPerformed(evt);
            }
        });

        selectMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectMedicine, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nameText.setText("Name: ");

        addressText.setText("Address: ");

        birthText.setText("DOB: ");

        genderText.setText("Gender: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameText)
                    .addComponent(addressText)
                    .addComponent(birthText)
                    .addComponent(genderText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(birthText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Medicine Quantity:");

        jLabel2.setText("Notes: ");

        jLabel3.setText("Dosage: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantityField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noteField)
                            .addComponent(dosageField))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        prescribeButton.setText("Prescribe");
        prescribeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescribeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prescribeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prescribeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPatientActionPerformed
        try{
            String selectedID = selectPatient.getSelectedItem().toString().substring(1,6);
            Patient selected = null;
            String gender = "";
            for(int i = 0; i < allUsers.length; i++){
                if(allUsers[i].getUniqueID().compareTo(selectedID) == 0){
                    selected = (Patient)allUsers[i];
                }
            }
            if(selected.getSex() == 'M'){
                gender = "Male";
            }else{
                gender = "Female";
            }
            nameText.setText("NAME: " + selected.getFirstName() + " " + selected.getLastName());
            addressText.setText("ADDRESS: " + selected.getAddress());
            genderText.setText("GENDER: " + gender);
            birthText.setText("DOB: " + selected.getDOB().substring(0,2) + "/" 
                    + selected.getDOB().substring(2,4) + "/" + selected.getDOB().substring(4,8));
        }catch(Exception e){}
    }//GEN-LAST:event_selectPatientActionPerformed

    private void prescribeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescribeButtonActionPerformed
        int qty = 0;
        String notes = "";
        String dosage = "";
        String doctorID = "";
        String patientID = "";
        Medicine selectedMed = null;
        boolean valid = true;
        boolean quantityValid = true;
        try{
            qty = Integer.parseInt(quantityField.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Invalid quantity");
            quantityValid = false;
        }
        try{
            notes = noteField.getText();
            dosage = dosageField.getText();
            doctorID = userSession.getUID();
            patientID = selectPatient.getSelectedItem().toString().substring(1,6);
            selectedMed = meds[selectMedicine.getSelectedIndex()];
            
            if(qty < 1){
                if(quantityValid == false){
                }else{
                    JOptionPane.showMessageDialog(this, "Invalid quantity");
                }
                valid = false;
            }
            if(notes.compareTo("") == 0){
                valid = false;
                JOptionPane.showMessageDialog(this, "You must enter a note.");
            }
            if(dosage.compareTo("") == 0){
                valid = false;
                JOptionPane.showMessageDialog(this, "You must enter dosage.");
            }
            if(valid == true){
                //creates prescription
                PrescriptionCreator creator = new PrescriptionCreator(patientID, 
                        doctorID, notes, selectedMed, qty, dosage);
                Prescription newPrescription = creator.createPrescription();
                Augment.addPrescriptionRequest(newPrescription);
                JOptionPane.showMessageDialog(this, "Prescription added.");
                this.setVisible(false);
                this.dispose();
            }else{}
        }catch(Exception e){}
        
    }//GEN-LAST:event_prescribeButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrescribeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressText;
    private javax.swing.JLabel birthText;
    private javax.swing.JTextField dosageField;
    private javax.swing.JLabel genderText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameText;
    private javax.swing.JTextField noteField;
    private javax.swing.JButton prescribeButton;
    private javax.swing.JTextField quantityField;
    private javax.swing.JComboBox<String> selectMedicine;
    private javax.swing.JComboBox<String> selectPatient;
    // End of variables declaration//GEN-END:variables
}
