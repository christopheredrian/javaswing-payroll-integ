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

        clockOutBtn.setBackground(new java.awt.Color(34, 204, 99));

        table.setBackground(new java.awt.Color(77, 77, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NAME"
            }
        ));
        tableScrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(1).setResizable(false);
        }

        clockInBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clockInBtn.setText("Clock In");
        clockInBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clockInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockInBtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Clock Out");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        adminPane.setBackground(new java.awt.Color(77, 77, 51));

        addBtn.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        addBtn.setText("Add Employee");
        addBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        editBtn.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        editBtn.setText("Edit Employee");
        editBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deActivateBtn.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        deActivateBtn.setText("De-Activate Employee");
        deActivateBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reActivateBtn.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        reActivateBtn.setText("Re-Activate Employee");
        reActivateBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        employeeSummaryBtn.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        employeeSummaryBtn.setText("Employee Summary");
        employeeSummaryBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        employeeSummaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeSummaryBtnActionPerformed(evt);
            }
        });

        payrollBtn.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        payrollBtn.setText("Payroll");
        payrollBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout adminPaneLayout = new javax.swing.GroupLayout(adminPane);
        adminPane.setLayout(adminPaneLayout);
        adminPaneLayout.setHorizontalGroup(
            adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reActivateBtn)
                    .addComponent(deActivateBtn))
                .addGap(37, 37, 37)
                .addGroup(adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(payrollBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeSummaryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        adminPaneLayout.setVerticalGroup(
            adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(deActivateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeSummaryBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payrollBtn)
                    .addComponent(reActivateBtn)
                    .addComponent(editBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(77, 77, 51));

        checkHoursBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        checkHoursBtn.setText("Check My Hours");
        checkHoursBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        activateAdminBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        activateAdminBtn.setText("Activate Admin");
        activateAdminBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkHoursBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(activateAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkHoursBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activateAdminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout clockOutBtnLayout = new javax.swing.GroupLayout(clockOutBtn);
        clockOutBtn.setLayout(clockOutBtnLayout);
        clockOutBtnLayout.setHorizontalGroup(
            clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clockOutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clockOutBtnLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(adminPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(clockOutBtnLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(clockInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        clockOutBtnLayout.setVerticalGroup(
            clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clockOutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(clockOutBtnLayout.createSequentialGroup()
                        .addComponent(adminPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addGroup(clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clockOutBtnLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addGroup(clockOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clockInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(clockOutBtnLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private void employeeSummaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeSummaryBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeSummaryBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnActionPerformed

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
