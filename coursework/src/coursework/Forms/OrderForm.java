package coursework.Forms;

import coursework.Forms.*;
import coursework.Functions.*;
import coursework.Objects.*;
import coursework.Users.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class OrderForm extends javax.swing.JFrame {

    Medicine medArray[] = null;
    
    public OrderForm() {
        initComponents();
        this.setResizable(false);
        selectMedicine.removeAllItems();
        try{
            medArray = FileReader.readMedicines();
        }catch(Exception e){}
        for(int i = 0; i < medArray.length; i++){
            selectMedicine.addItem("[STOCK: " + medArray[i].getStock() + "]" + medArray[i].getMedicineName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectMedicine = new javax.swing.JComboBox<>();
        orderQty = new javax.swing.JTextField();
        orderButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        selectMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMedicineActionPerformed(evt);
            }
        });

        orderQty.setFont(new java.awt.Font("Dosis", 0, 18)); // NOI18N

        orderButton.setText("Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectMedicine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderQty, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(orderQty, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        int orderStock = 0;
        Medicine selectedMedicine = null;
        Medicine orders[] = null;
        int state = 0; //1=order exists, 0=order doesnt exist
        int continueState = 0; //0=continue, 1=dont
        if(selectMedicine.getSelectedIndex() > -1){
            try{
                orderStock = Integer.parseInt(orderQty.getText());
                if(orderStock < 1){
                    JOptionPane.showMessageDialog(this, "Invalid stock input");
                    continueState = 1;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Invalid stock input");
                continueState = 1;
            }
            
            try{
                selectedMedicine = medArray[selectMedicine.getSelectedIndex()];
            }catch(Exception e){
                continueState = 1;
            }
            
            try{
                orders = FileReader.readOrderRequests();
            }catch(Exception e){
                continueState = 1;
            }
            if(continueState == 0){
                for(int i = 0; i < orders.length; i++){
                    if(orders[i].getMedicineName().compareTo(selectedMedicine.getMedicineName()) == 0){
                        state = 1;
                    }else{}
                }
                if(state == 1){
                    for(int i = 0; i < orders.length; i++){
                    if(orders[i].getMedicineName().compareTo(selectedMedicine.getMedicineName()) == 0){
                        orders[i].setStock(orders[i].getStock() + orderStock); //adds to current order
                        try{
                            FileWriter.writeMedicineOrders(orders);
                        }catch(Exception e){}
                    }else{}
                }
                }else{
                    selectedMedicine.setStock(selectedMedicine.getStock() + orderStock);
                    Augment.addOrder(selectedMedicine);
                }
            }
            else{
            }
        }else{
            
        }
        
    }//GEN-LAST:event_orderButtonActionPerformed

    private void selectMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMedicineActionPerformed
        
    }//GEN-LAST:event_selectMedicineActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton orderButton;
    private javax.swing.JTextField orderQty;
    private javax.swing.JComboBox<String> selectMedicine;
    // End of variables declaration//GEN-END:variables
}
