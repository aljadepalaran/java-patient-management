package coursework.Forms;

import coursework.Objects.Session;
import javax.swing.JOptionPane;

public class MainSecretary extends javax.swing.JFrame {
    Session userSession;
    public MainSecretary() {
        initComponents();
        this.setResizable(false);
    }
    
    public MainSecretary(Session _session) {
        initComponents();
        this.setResizable(false);
        userSession = _session;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JLayeredPane();
        approveAccountButton = new javax.swing.JButton();
        approveAppointmentButton = new javax.swing.JButton();
        giveMedicineButton = new javax.swing.JButton();
        orderStockButton = new javax.swing.JButton();
        removePatientButton = new javax.swing.JButton();
        approveTerminationButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secretary Form");

        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        approveAccountButton.setText("Approve Accounts");

        approveAppointmentButton.setText("Approve Appointment");

        giveMedicineButton.setText("Give Medicine");

        orderStockButton.setText("Order Stock");

        removePatientButton.setText("Remove Patients");

        approveTerminationButton.setText("Approve Termination");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        buttonPanel.setLayer(approveAccountButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(approveAppointmentButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(giveMedicineButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(orderStockButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(removePatientButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttonPanel.setLayer(approveTerminationButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                    .addComponent(giveMedicineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(approveAppointmentButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(approveAccountButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removePatientButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(approveTerminationButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(approveAccountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(approveAppointmentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giveMedicineButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderStockButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removePatientButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(approveTerminationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel)
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSecretary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveAccountButton;
    private javax.swing.JButton approveAppointmentButton;
    private javax.swing.JButton approveTerminationButton;
    private javax.swing.JLayeredPane buttonPanel;
    private javax.swing.JButton giveMedicineButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton orderStockButton;
    private javax.swing.JButton removePatientButton;
    // End of variables declaration//GEN-END:variables
}
