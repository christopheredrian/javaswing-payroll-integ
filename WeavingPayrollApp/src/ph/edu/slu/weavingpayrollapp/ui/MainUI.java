/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.slu.weavingpayrollapp.ui;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author chris
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        adminPane.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clockOutBtn = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clockInBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        adminPane = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deActivateBtn = new javax.swing.JButton();
        reActivateBtn = new javax.swing.JButton();
        employeeSummaryBtn = new javax.swing.JButton();
        payrollBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        checkHoursBtn = new javax.swing.JButton();
        activateAdminBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Name"
            }
        ));
        tableScrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(1).setResizable(false);
        }

        clockInBtn.setText("Clock In");
        clockInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockInBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Clock Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        addBtn.setText("Add Employee");

        editBtn.setText("Edit Employee");

        deActivateBtn.setText("De-Activate Employee");

        reActivateBtn.setText("Re-Activate Employee");

        employeeSummaryBtn.setText("Employee Summary");

        payrollBtn.setText("Payroll");

        javax.swing.GroupLayout adminPaneLayout = new javax.swing.GroupLayout(adminPane);
        adminPane.setLayout(adminPaneLayout);
        adminPaneLayout.setHorizontalGroup(
            adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPaneLayout.createSequentialGroup()
                .addGroup(adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(adminPaneLayout.createSequentialGroup()
                        .addComponent(deActivateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(employeeSummaryBtn))
                    .addGroup(adminPaneLayout.createSequentialGroup()
                        .addComponent(reActivateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(payrollBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminPaneLayout.setVerticalGroup(
            adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deActivateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeSummaryBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reActivateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payrollBtn))
                .addContainerGap())
        );

        checkHoursBtn.setText("Check My Hours");

        activateAdminBtn.setText("Activate Admin");
        activateAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateAdminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkHoursBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activateAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(activateAdminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(checkHoursBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout clockOutBtnLayout = new javax.swing.GroupLayout(clockOutBtn);
        clockOutBtn.setLayout(clockOutBtnLayout);
        clockOutBtnLayout.setHorizontalGroup(
            clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clockOutBtnLayout.createSequentialGroup()
                .addGroup(clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(clockOutBtnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clockOutBtnLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(clockInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clockOutBtnLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(adminPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        clockOutBtnLayout.setVerticalGroup(
            clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clockOutBtnLayout.createSequentialGroup()
                .addGroup(clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(clockOutBtnLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(clockOutBtnLayout.createSequentialGroup()
                        .addGap(14, 318, Short.MAX_VALUE)
                        .addGroup(clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clockInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clockOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clockOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clockInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockInBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clockInBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void activateAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateAdminBtnActionPerformed
        // TODO: Condition here
//        String input = JOptionPane.showInputDialog(this, "Enter Password", "Authenticate", JOptionPane.INFORMATION_MESSAGE);
//        String[] options = new String[]{"OK", "Cancel"};
//        int option = JOptionPane.showOptionDialog(null, "Password", "The title",
//                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
//                null, options, options[1]);
//
//        if (option == 0) {
//            if (input.equals("password")) {
//                adminPane.setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(this, "Wrong Password!");
//            }
//        }
// panel
//        JPanel panel = new JPanel();
//        JLabel label = new JLabel("Enter a password:");
//        JPasswordField pass = new JPasswordField(10);
//        panel.add(label);
//        panel.add(pass);
//        String[] options = new String[]{"OK", "Cancel"};
//        int option = JOptionPane.showOptionDialog(null, panel, "The title",
//                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
//                null, options, options[1]);
//        if (option == 0) // pressing OK button
//        {
//            char[] password = pass.getPassword();
//            String passwordStr = new String(password);
//            if (passwordStr.equals("password")) {
//                adminPane.setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(this, "Wrong Password!");
//            }
//            System.out.println("Your password is: " + new String(password));
//        }
        JPasswordField pf = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (okCxl == JOptionPane.OK_OPTION) {
            String passwordStr = new String(pf.getPassword());
            if (passwordStr.equals("password")) {
                adminPane.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Password!");
            }
            String password = new String(pf.getPassword());
            System.err.println("You entered: " + password);
        }
    }//GEN-LAST:event_activateAdminBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activateAdminBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel adminPane;
    private javax.swing.JButton checkHoursBtn;
    private javax.swing.JButton clockInBtn;
    private javax.swing.JPanel clockOutBtn;
    private javax.swing.JButton deActivateBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton employeeSummaryBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton payrollBtn;
    private javax.swing.JButton reActivateBtn;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
