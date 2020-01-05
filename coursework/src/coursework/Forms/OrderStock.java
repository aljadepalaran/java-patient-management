package coursework.Forms;

import coursework.Objects.*;
import javax.swing.JOptionPane;
import coursework.Users.*;
import coursework.Functions.*;

public class OrderStock extends javax.swing.JFrame {
    
    Medicine allMeds[] = null;  //stores all meds in the system
    Medicine stockRequests[] = null; //stores the stock requests
    Session userSession;
    
    public OrderStock() {
        initComponents();
    }
    
    public OrderStock(Session _input) {
        initComponents();
        this.setResizable(false);
        medSelect.removeAllItems();
        loadData();
        userSession = _input;
    }
    
    //A controller that loads stock requests and medicine data into the form.
    public void loadData(){
        try{
            stockRequests = FileReader.readOrderRequests();
            allMeds = FileReader.readMedicines();
            for(int i = 0; i < stockRequests.length; i++){
                medSelect.addItem(stockRequests[i].getMedicineName());
            }
        }catch(Exception e){}
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        medSelect = new javax.swing.JComboBox<>();
        orderButton = new javax.swing.JButton();
        nameText = new javax.swing.JLabel();
        currentText = new javax.swing.JLabel();
        requestedText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        medSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        medSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medSelectActionPerformed(evt);
            }
        });

        orderButton.setText("Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        nameText.setText("NAME:");

        currentText.setText("CURRENT STOCK: ");

        requestedText.setText("REQUESTED QUANTITY:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText)
                            .addComponent(currentText)
                            .addComponent(requestedText))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestedText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderButton)
                .addContainerGap())
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

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        
        try{
            Medicine selected = stockRequests[medSelect.getSelectedIndex()];
            for(int i = 0; i < allMeds.length; i++){
                if(allMeds[i].getMedicineName().compareTo(selected.getMedicineName()) == 0){
                    allMeds[i].setStock(allMeds[i].getStock() + selected.getStock());
                }
            }
            FileWriter.writeMedicines(allMeds);
            Augment.removeMedicineOrder(selected.getMedicineName());
            this.setVisible(false);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Stock ordered.");
        }catch(Exception e){}
    }//GEN-LAST:event_orderButtonActionPerformed

    private void medSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medSelectActionPerformed
        try{
            Medicine selected = stockRequests[medSelect.getSelectedIndex()];
            nameText.setText("NAME: " + selected.getMedicineName());
            requestedText.setText("REQUESTED QUANTITY: " + Integer.toString(selected.getStock()));
            String currentStock = "";
            for(int i = 0; i < allMeds.length; i++){
                if(allMeds[i].getMedicineName().compareTo(selected.getMedicineName()) == 0){
                    currentStock = Integer.toString(allMeds[i].getStock());
                }
            }
            currentText.setText("CURRENT STOCK: " + currentStock);
        }catch(Exception e){}
    }//GEN-LAST:event_medSelectActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MainSecretary newForm = new MainSecretary(userSession);
        newForm.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(OrderStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> medSelect;
    private javax.swing.JLabel nameText;
    private javax.swing.JButton orderButton;
    private javax.swing.JLabel requestedText;
    // End of variables declaration//GEN-END:variables
}
