package coursework.Forms;

import coursework.Users.User;

public class MainAdmin extends javax.swing.JFrame {

    public MainAdmin(User _loggedUser) {
        initComponents();
    }
    public MainAdmin(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logoutButton = new javax.swing.JMenuItem();
        editDetailsButton = new javax.swing.JMenuItem();
        createAdminButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addDoctorButton = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        viewRatingButton = new javax.swing.JMenuItem();
        provideFeedbackButton = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        addSecretaryButton = new javax.swing.JMenuItem();
        removeSecretaryButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Account");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jMenu1.add(logoutButton);

        editDetailsButton.setText("Edit Details");
        jMenu1.add(editDetailsButton);

        createAdminButton.setText("Create Admin");
        createAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdminButtonActionPerformed(evt);
            }
        });
        jMenu1.add(createAdminButton);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Doctors");

        addDoctorButton.setText("Add Doctor");
        jMenu2.add(addDoctorButton);

        jMenuItem1.setText("Remove Doctor");
        jMenu2.add(jMenuItem1);

        viewRatingButton.setText("View Ratings");
        jMenu2.add(viewRatingButton);

        provideFeedbackButton.setText("Provide Feedback");
        jMenu2.add(provideFeedbackButton);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Patients");
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Secretaries");

        addSecretaryButton.setText("Add Secretary");
        jMenu5.add(addSecretaryButton);

        removeSecretaryButton.setText("Remove Secretary");
        jMenu5.add(removeSecretaryButton);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdminButtonActionPerformed
        UserCreator creatorForm = new UserCreator('A');
        creatorForm.setVisible(true);
    }//GEN-LAST:event_createAdminButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.setVisible(false);
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addDoctorButton;
    private javax.swing.JMenuItem addSecretaryButton;
    private javax.swing.JMenuItem createAdminButton;
    private javax.swing.JMenuItem editDetailsButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem logoutButton;
    private javax.swing.JMenuItem provideFeedbackButton;
    private javax.swing.JMenuItem removeSecretaryButton;
    private javax.swing.JMenuItem viewRatingButton;
    // End of variables declaration//GEN-END:variables
}
