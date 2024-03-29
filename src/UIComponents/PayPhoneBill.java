/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIComponents;

import Other.Company;
import bill.ElecBill;
import bill.PhoneBill;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Raghav
 */
public class PayPhoneBill extends javax.swing.JFrame {

    
    /**
     * Creates new form PayElecBill
     */
    public PayPhoneBill() {
        initComponents();
        hideLabel();
        
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        companyCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        billIDTF = new javax.swing.JTextField();
        fetchBT = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        ebillID = new javax.swing.JLabel();
        ecusID = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        ename = new javax.swing.JLabel();
        eunits = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        eamount = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        edate = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        estatus = new javax.swing.JLabel();
        payBT = new javax.swing.JButton();
        etype = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        backToMainMenuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Phone Bill Payment");

        companyCB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        companyCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Airtel", "Jio", "Reliance", "Idea", "Arcel", "Vodafone", "Telenor" }));
        companyCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyCBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("COMPANY :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("BILL ID");

        fetchBT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fetchBT.setText("FETCH BILL");
        fetchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchBTActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl1.setText("BILL ID ");

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl2.setText("PHONE NUMBER");

        ebillID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ebillID.setText("BILL ID :");

        ecusID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ecusID.setText("BILL ID :");

        lbl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl3.setText("NAME");

        ename.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ename.setText("BILL ID :");

        eunits.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eunits.setText("BILL ID :");

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl4.setText("UNITS");

        lbl5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl5.setText("AMOUNT");

        eamount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eamount.setText("BILL ID :");

        lbl6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl6.setText("DUE DATE");

        edate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edate.setText("AMOUNT");

        lbl7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl7.setText("PAYMENT STATUS");

        estatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        estatus.setText("AMOUNT");

        payBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payBT.setText("PAY");
        payBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBTActionPerformed(evt);
            }
        });

        etype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etype.setText("BILL ID :");

        lbl8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl8.setText("CUSTOMER TYPE");

        backToMainMenuBtn.setText("Back To Main Menu");
        backToMainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMainMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backToMainMenuBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(32, 32, 32)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(companyCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(billIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl3)
                                    .addComponent(lbl4)
                                    .addComponent(lbl5)
                                    .addComponent(lbl6)
                                    .addComponent(lbl7)
                                    .addComponent(lbl8)
                                    .addComponent(lbl1)
                                    .addComponent(lbl2))
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ecusID)
                                    .addComponent(ebillID)
                                    .addComponent(etype)
                                    .addComponent(ename)
                                    .addComponent(eunits)
                                    .addComponent(eamount)
                                    .addComponent(edate)
                                    .addComponent(estatus)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fetchBT)
                            .addComponent(payBT, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backToMainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(companyCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(fetchBT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(ebillID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(ecusID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl8)
                    .addComponent(etype))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(ename))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eunits)
                    .addComponent(lbl4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(eamount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl6)
                    .addComponent(edate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl7)
                    .addComponent(estatus))
                .addGap(49, 49, 49)
                .addComponent(payBT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void companyCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyCBActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_companyCBActionPerformed

    private void fetchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchBTActionPerformed
        // TODO add your handling code here:
       PhoneBill e = new PhoneBill();
       Company c=  new Company();
       PaymentPortal obj = new PaymentPortal();
        String id = billIDTF.getText();
        
        
        e=e.searchFromDB(id);

        
        
        c=c.searchFromDB(e.getCompanyID());
        
        String comp= companyCB.getSelectedItem().toString();
        if(comp == c.getName() && id == e.getBillId())
        {
            JOptionPane.showMessageDialog(this,"BILL FETCHED SUCCESSFULLY");
        eamount.setText(e.getAmount());
        ename.setText(e.getCustomerName());
        ebillID.setText(e.getBillId());
        ecusID.setText(e.getPhoneNumber());
        edate.setText(e.getDate());
        eunits.setText(e.getDuration());
        estatus.setText(e.getStatus());
        etype.setText(e.getType());
        obj.setValuesForPhone(e);
        }
        else
            JOptionPane.showMessageDialog(this,"WRONG ID..TRY AGAIN"); 
        
        
        
        
        showLabel();
    }//GEN-LAST:event_fetchBTActionPerformed

    private void backToMainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMainMenuBtnActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                new PayBills().setVisible(true);
            }
        });
    }//GEN-LAST:event_backToMainMenuBtnActionPerformed

    private void payBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBTActionPerformed
        // TODO add your handling code here:
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                new PaymentPortal().setVisible(true);
            }
        });
    }//GEN-LAST:event_payBTActionPerformed

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
            java.util.logging.Logger.getLogger(PayPhoneBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayPhoneBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayPhoneBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayPhoneBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayPhoneBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMainMenuBtn;
    private javax.swing.JTextField billIDTF;
    private javax.swing.JComboBox<String> companyCB;
    private javax.swing.JLabel eamount;
    private javax.swing.JLabel ebillID;
    private javax.swing.JLabel ecusID;
    private javax.swing.JLabel edate;
    private javax.swing.JLabel ename;
    private javax.swing.JLabel estatus;
    private javax.swing.JLabel etype;
    private javax.swing.JLabel eunits;
    private javax.swing.JButton fetchBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JButton payBT;
    // End of variables declaration//GEN-END:variables

    private void hideLabel() {
         //To change body of generated methods, choose Tools | Templates.
        ename.setVisible(false);
        eamount.setVisible(false);
        ebillID.setVisible(false);
        ecusID.setVisible(false);
        edate.setVisible(false);
        estatus.setVisible(false);
        eunits.setVisible(false);
        etype.setVisible(false);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        
        payBT.setVisible(false);
    }

    private void showLabel() {
        //To change body of generated methods, choose Tools | Templates.
        ename.setVisible(true);
        eamount.setVisible(true);
        ebillID.setVisible(true);
        ecusID.setVisible(true);
        edate.setVisible(true);
        estatus.setVisible(true);
        eunits.setVisible(true);
        etype.setVisible(true);
        lbl1.setVisible(true);
        lbl2.setVisible(true);
        lbl3.setVisible(true);
        lbl4.setVisible(true);
        lbl5.setVisible(true);
        lbl6.setVisible(true);
        lbl7.setVisible(true);
        lbl8.setVisible(true);
        
        payBT.setVisible(true);
    }
}
