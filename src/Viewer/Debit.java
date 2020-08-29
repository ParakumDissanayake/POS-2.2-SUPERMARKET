/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Viewer;

import Model.DB;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ashan Lakshitha
 */
public class Debit extends javax.swing.JDialog {

    /**
     * Creates new form Credit
     */
    String loginuser ="admin";
    NumberFormat formatter = new DecimalFormat("#0.00");    
    String supid;
    
    public Debit(java.awt.Frame parent, boolean modal , String user) {
        super(parent, modal);
        initComponents();
        dtm = (DefaultTableModel) customertble.getModel();
        dtm1 = (DefaultTableModel) invtable.getModel();
        dtm2 = (DefaultTableModel) paymenttable.getModel();
        loginuser = user;
        supid = "0";
        loadcreditors();
        loadoutstanding();
        
    }
    
    DB d = new DB();
    DefaultTableModel dtm; DefaultTableModel dtm1; DefaultTableModel dtm2;
    int selectedcus = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customertble = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        outslbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        customerlbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        balancelbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invtable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        paymenttable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        credittotaltxt = new javax.swing.JLabel();
        debittotaltxt = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        customertble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Supplier Name", "Telephone", "Company", "Credit Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customertble.setRowHeight(30);
        customertble.setSelectionBackground(new java.awt.Color(0, 0, 0));
        customertble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customertbleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customertble);
        if (customertble.getColumnModel().getColumnCount() > 0) {
            customertble.getColumnModel().getColumn(0).setMinWidth(50);
            customertble.getColumnModel().getColumn(0).setPreferredWidth(50);
            customertble.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Supplier");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Pay to");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/government-water-supply-006-128.png"))); // NOI18N

        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchtxtKeyTyped(evt);
            }
        });

        jButton1.setText("Refresh");

        jLabel3.setText("OUTSTANDING");

        outslbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchtxt)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(outslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(outslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Selected Supplier :");

        customerlbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        customerlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerlbl.setText("Supplier Name");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Credit Details :");

        balancelbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        balancelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balancelbl.setText("0.00");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        invtable.setFont(new java.awt.Font("Iskoola Pota", 0, 11)); // NOI18N
        invtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Name", "Amount", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        invtable.setRowHeight(30);
        invtable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(invtable);

        paymenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Date", "Amount", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        paymenttable.setRowHeight(30);
        paymenttable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(paymenttable);
        if (paymenttable.getColumnModel().getColumnCount() > 0) {
            paymenttable.getColumnModel().getColumn(0).setMinWidth(50);
            paymenttable.getColumnModel().getColumn(0).setPreferredWidth(50);
            paymenttable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("Stocks");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Payments");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("Total  :");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("Total :");

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setText("Pay Now");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        credittotaltxt.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        credittotaltxt.setText("0.00");

        debittotaltxt.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        debittotaltxt.setText("0.00");

        jButton3.setText("Delete Payment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(customerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balancelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(credittotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(debittotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(customerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(balancelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(credittotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debittotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new supplier_payment(null, false , selectedcus+"" , loginuser , this ).setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void customertbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertbleMouseClicked
        if(customertble.getSelectedRow() == -1){
            clear();
        }else{
            clear();
            int i = customertble.getSelectedRow();
            selectedcus = Integer.parseInt(customertble.getValueAt(i,0 ).toString());
            loadcustomerdet(i);
        }
    }//GEN-LAST:event_customertbleMouseClicked

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
        loadcreditors();
    }//GEN-LAST:event_searchtxtKeyReleased

    private void searchtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyTyped
        char c = evt.getKeyChar();
        
        String key = String.valueOf(c);
        
        if  (!(Character.isDigit(c) || key.equals("/") || key.equals(" ") || key.equals("(") || key.equals(")") || key.equals("-") || key.equals("+") || key.equals("/")|| key.equals(",")|| key.equals(".") || key.equals(".") || Character.isAlphabetic(c))) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
        if(searchtxt.getText().length() == 0 && key.equals(" ") ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_searchtxtKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int res = JOptionPane.showConfirmDialog(this, "Are You sure to delete payment", "", 0);
        if (res == 0) {
                
            if(paymenttable.getSelectedRow() == -1){
               JOptionPane.showMessageDialog(this, "Please select a payment first");
           }else{           
               int row = paymenttable.getSelectedRow();
               String payid = paymenttable.getValueAt(row, 0).toString();
               String payment = paymenttable.getValueAt(row, 2).toString();
               String suppid = supid;
               
               try {  
               
                    int i = d.aud("delete from supplier_payment where id = '"+payid+"'");

                    if(i == 1){
                         JOptionPane.showMessageDialog(this, "Deleted Sucessfully");
                         int i1 = d.aud("update supplier set balance = balance + '"+payment+"' where id = '"+suppid+"' ");
                         loadcustomerdet(customertble.getSelectedRow());
                    }else{
                         JOptionPane.showMessageDialog(this, "Sorry. cannot Delete.");
                    }
               
               } catch (Exception e) {
                   e.printStackTrace();
               }
            
           }
            
        }else{
        
        
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Debit dialog = new Debit(new javax.swing.JFrame(), true , "admin");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balancelbl;
    private javax.swing.JLabel credittotaltxt;
    private javax.swing.JLabel customerlbl;
    private javax.swing.JTable customertble;
    private javax.swing.JLabel debittotaltxt;
    private javax.swing.JTable invtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel outslbl;
    private javax.swing.JTable paymenttable;
    private javax.swing.JTextField searchtxt;
    // End of variables declaration//GEN-END:variables

    private void loadcreditors() {
    
     dtm.setRowCount(0);
        
        try {
            ResultSet rs = d.srh("select * from supplier where name LIKE '%"+searchtxt.getText()+"%' ");
            while (rs.next()) { 
               java.util.Vector v = new java.util.Vector();
               v.add(rs.getString("id"));
               v.add(rs.getString("name"));
               v.add(rs.getString("number"));
               v.add(rs.getString("company"));
               v.add(formatter.format(rs.getDouble("balance")));
               dtm.addRow(v);
               
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    private void loadoutstanding() {
    
        
        try {
            ResultSet rs = d.srh("select sum(balance) from supplier ");
            while (rs.next()) { 
               outslbl.setText(formatter.format(rs.getDouble("sum(balance)")));               
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    
    private void loadcustomerdet(int i){
        
        supid = selectedcus+"";
        
        customerlbl.setText("<html>" + customertble.getValueAt(i, 1).toString() + "<br>" + 
                customertble.getValueAt(i, 2) + "<br>" +
                customertble.getValueAt(i, 3) + "<br>");
        
        balancelbl.setText(customertble.getValueAt(i, 4).toString());
        
        Double ctotal = 0.0; 
        try {
            dtm1.setRowCount(0); 
            ResultSet rs = d.srh("select date(date) as stockdate , name , buycost , buyqty from stock "
                    + "inner join product on product.id = stock.product_id where supplier_id = '"+selectedcus+"' order by stock.id DESC ");
            while (rs.next()) { 
               Vector v = new java.util.Vector();
               v.add(rs.getString("stockdate"));
               v.add(rs.getString("name"));
               v.add(formatter.format(rs.getDouble("buycost")));
               v.add(rs.getString("buyqty"));
               ctotal = ctotal + rs.getDouble("buycost");
               dtm1.addRow(v);
            }
            credittotaltxt.setText(formatter.format(ctotal)+"");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Double dtotal = 0.0;
        try {
            dtm2.setRowCount(0); 
            ResultSet rs = d.srh("select date(date) as paymentdate , id , payment , payment_type from supplier_payment where supplier_id = '"+selectedcus+"' order by id DESC ");
            while (rs.next()) { 
               Vector v = new java.util.Vector();
               v.add(rs.getString("id"));
               v.add(rs.getString("paymentdate"));
               v.add(formatter.format(rs.getDouble("payment")));
               dtotal = dtotal + rs.getDouble("payment");
               v.add(rs.getString("payment_type"));
               dtm2.addRow(v);
               
            }
            debittotaltxt.setText(formatter.format(dtotal)+"");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        double balance = ctotal - dtotal ;
        balancelbl.setText(formatter.format(balance)+"");
        
    }
    
    private void clear(){
        customerlbl.setText("");
        balancelbl.setText("0.00");
        dtm1.setRowCount(0);
        dtm2.setRowCount(0);
        credittotaltxt.setText("0.00");
        debittotaltxt.setText("0.00");
    }
    
    public void updatecustomer(String cus){
        
        clear();
        loadcreditors();
        /*
        try {
            ResultSet rs = d.srh("select * from customer where id = '"+cus+"'");
            while (rs.next()) { 
               selectedcus = Integer.parseInt(cus);
               customerlbl.setText("<html>"+rs.getString("name")+"<br>"+rs.getString("tel")+"</html>");
               balancelbl.setText(rs.getString("balance"));
            }
            
            loadcustomerdet(selectedcus);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
                */
        
    }
    

    
}

