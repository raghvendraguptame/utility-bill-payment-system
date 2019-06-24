/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIComponents;

import Other.Company;
import Other.Customer;
import Other.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author Reshma
 */
public class UpdateCompany extends javax.swing.JFrame {

    /**
     * Creates new form UpdateCustomer
     */
    public UpdateCompany() {
        initComponents();
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
        updatebtn = new javax.swing.JButton();
        updateIDLabel = new javax.swing.JLabel();
        clearbtn = new javax.swing.JButton();
        updateIdtf = new javax.swing.JTextField();
        backToMain = new javax.swing.JButton();
        updateNameLabel = new javax.swing.JLabel();
        updateNametf = new javax.swing.JTextField();
        updateEmailLabel = new javax.swing.JLabel();
        updateEmailtf = new javax.swing.JTextField();
        updateGstLabel = new javax.swing.JLabel();
        updateGsttf = new javax.swing.JTextField();
        updatePwdLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateAddTF = new javax.swing.JTextArea();
        submitID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Update Company");

        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        updateIDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateIDLabel.setText("COMPANY ID");

        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clearbtn.setText("CLEAR");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        updateIdtf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateIdtf.setText("Enter ID to update details");

        backToMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backToMain.setText("BACK TO ADMIN MENU");
        backToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMainActionPerformed(evt);
            }
        });

        updateNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateNameLabel.setText("NAME");

        updateNametf.setEditable(false);
        updateNametf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        updateEmailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateEmailLabel.setText("EMAIL");

        updateEmailtf.setEditable(false);
        updateEmailtf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateEmailtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmailtfActionPerformed(evt);
            }
        });

        updateGstLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateGstLabel.setText("GST NO.");

        updateGsttf.setEditable(false);

        updatePwdLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatePwdLabel2.setText("REG ADDRESS");

        updateAddTF.setEditable(false);
        updateAddTF.setColumns(20);
        updateAddTF.setRows(5);
        jScrollPane1.setViewportView(updateAddTF);

        submitID.setText("Submit");
        submitID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 229, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(updateNameLabel)
                                        .addComponent(updateEmailLabel))
                                    .addGap(54, 54, 54))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(updateGstLabel)
                                    .addGap(45, 45, 45)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updatePwdLabel2)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(updateGsttf)
                                    .addComponent(updateEmailtf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateIdtf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(updateNametf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addComponent(submitID))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updatebtn)
                                .addGap(125, 125, 125))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(backToMain)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(259, 259, 259)
                    .addComponent(updateIDLabel)
                    .addContainerGap(543, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateIdtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateNameLabel)
                    .addComponent(updateNametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateGsttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateGstLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(updatePwdLabel2)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtn)
                    .addComponent(clearbtn))
                .addGap(130, 130, 130)
                .addComponent(backToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(updateIDLabel)
                    .addContainerGap(687, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        Company cusObj = new Company();
        
        cusObj.setId(updateIdtf.getText());
        cusObj.setName(updateNametf.getText());
        cusObj.setEmail(updateEmailtf.getText());
        cusObj.setRegOff(updateAddTF.getText());
        cusObj.setGstNo(updateGsttf.getText());
        int r = cusObj.updateDB(cusObj);
        if(r==0){
            JOptionPane.showMessageDialog(this,"SOMETHING WENT WRONG");

        }
        else{
            JOptionPane.showMessageDialog(this,"SUCCESSFULLY UPDATED ");
        }
        updateIdtf.setText("");
        updateNametf.setText("");
        updateEmailtf.setText("");
        updateGsttf.setText("");
    }//GEN-LAST:event_updatebtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        updateIdtf.setText("");
        updateNametf.setText("");
        updateEmailtf.setText("");
        updateGsttf.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void backToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMainActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                new AdminFrontPortal().setVisible(true);
            }
        });
    }//GEN-LAST:event_backToMainActionPerformed

    private void submitIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitIDActionPerformed
        // TODO add your handling code here:
        //updateIdtf.setEditable(false);
        updateEmailtf.setEditable(true);
        updateGsttf.setEditable(true);
        updateNametf.setEditable(true);
        updateIdtf.setEditable(false);
        
        Company cusObj = new Company();
        
        cusObj=cusObj.searchFromDB(updateIdtf.getText());
     
                
        if(cusObj.getName()==null)
        {
        JOptionPane.showMessageDialog(this,"INVALID ID ");
        }
        else
        {
        updateNametf.setText(cusObj.getName());
        updateEmailtf.setText(cusObj.getEmail());
        updateAddTF.setText(cusObj.getRegOff());
        updateGsttf.setText(cusObj.getGstNo());
        }
//        String id = updateIdtf.getText();
//        c= Customer.searchByID(id);
//        
//        System.out.println(c.getName());
//        
//        updateNametf.setText(c.getName());
//        updatePhntf.setText(c.getPhn());
//        updateEmailtf.setText(c.getEmail());
    }//GEN-LAST:event_submitIDActionPerformed

    private void updateEmailtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmailtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateEmailtfActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMain;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitID;
    private javax.swing.JTextArea updateAddTF;
    private javax.swing.JLabel updateEmailLabel;
    private javax.swing.JTextField updateEmailtf;
    private javax.swing.JLabel updateGstLabel;
    private javax.swing.JTextField updateGsttf;
    private javax.swing.JLabel updateIDLabel;
    private javax.swing.JTextField updateIdtf;
    private javax.swing.JLabel updateNameLabel;
    private javax.swing.JTextField updateNametf;
    private javax.swing.JLabel updatePwdLabel2;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}