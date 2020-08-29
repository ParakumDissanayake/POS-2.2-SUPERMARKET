/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Viewer;

import Model.DB;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author Ashan Lakshitha
 */
public class updatesupplier extends javax.swing.JDialog {

    /**
     * Creates new form updateproduct
     */
    DB d = new DB();
    DefaultListModel jlm1 ;
    
    public updatesupplier(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setFrontText();
                    srhpanel.setVisible(false);
            srhpanel1.setVisible(false);
        jlm1 = new DefaultListModel();
    }
    
    private void setFrontText(){
        setPront(teltxt, "Telephone");
        setPront(nametxt, "Search Text");
        setPront(nametxt2, "Supplier Name");
        setPront(companytxt, "Company");
    }
    
    private void setPront(JTextField a , String text) {
        PromptSupport.setPrompt(text, a);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, a);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        srhpanel = new javax.swing.JScrollPane();
        srhpanel1 = new javax.swing.JList();
        teltxt = new javax.swing.JTextField();
        nametxt2 = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        companytxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        idlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        srhpanel1.setBackground(new java.awt.Color(0, 0, 0));
        srhpanel1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        srhpanel1.setForeground(new java.awt.Color(255, 255, 255));
        srhpanel1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        srhpanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srhpanel1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        srhpanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srhpanel1MouseClicked(evt);
            }
        });
        srhpanel1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                srhpanel1ValueChanged(evt);
            }
        });
        srhpanel.setViewportView(srhpanel1);

        jPanel1.add(srhpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 100));

        teltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teltxtKeyTyped(evt);
            }
        });
        jPanel1.add(teltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 174, 182, 34));

        nametxt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nametxt2KeyTyped(evt);
            }
        });
        jPanel1.add(nametxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, 388, 34));

        nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nametxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nametxtKeyTyped(evt);
            }
        });
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 260, 34));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Update Supplier");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Please Update Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 23));

        companytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                companytxtKeyTyped(evt);
            }
        });
        jPanel1.add(companytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 174, 200, 34));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 219, 88, 34));
        jPanel1.add(idlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 54, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(idlbl.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please search Supplier First");
            nametxt.requestFocus();
        }else if(nametxt2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please insert a valid Name");
            nametxt2.requestFocus();
        }else{
            try {
                int i = d.aud("update supplier set name = '"+nametxt2.getText()+"' , number = '"+teltxt.getText()+"' , company = '"+companytxt.getText()+"' where id = '"+idlbl.getText()+"' ");
                if(i==1){
                    JOptionPane.showMessageDialog(this, "Updated Succesfully");
                    clear();
                }else{
                    JOptionPane.showMessageDialog(this, "Something Went Wrong");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxtKeyReleased
        if(nametxt.getText().isEmpty()){
            srhpanel.setVisible(false);
            srhpanel1.setVisible(false);
            clear();
        }else{
            clear();
            srh();
        }
    }//GEN-LAST:event_nametxtKeyReleased

    private void nametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxtKeyTyped
        char c = evt.getKeyChar();
        
        String key = String.valueOf(c);
        
        if  (!(Character.isDigit(c) || key.equals("/") || key.equals(" ") || key.equals("(") || key.equals(")") || key.equals("-") || key.equals("+") || key.equals("/")|| key.equals(",")|| key.equals(".") || key.equals(".") || Character.isAlphabetic(c))) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
        if(nametxt.getText().length() == 0 && key.equals(" ") ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_nametxtKeyTyped

    private void teltxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teltxtKeyTyped
        char c = evt.getKeyChar();
        
        String key = String.valueOf(c);
        
        if  (!(Character.isDigit(c) || key.equals("/") || key.equals(" ") || key.equals("(") || key.equals(")") || key.equals("-") || key.equals("+") || key.equals("/")|| key.equals(",")|| key.equals(".") || key.equals(".") || Character.isAlphabetic(c))) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
        if(teltxt.getText().length() == 0 && key.equals(" ") ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_teltxtKeyTyped

    private void companytxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_companytxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_companytxtKeyTyped

    private void nametxt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxt2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxt2KeyTyped

    private void srhpanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srhpanel1MouseClicked
        String cnum = srhpanel1.getSelectedValue().toString();
        String arr[] = cnum.split(" - ", 2);
        idlbl.setText(arr[0]);
        loadproduct();
        srhpanel.setVisible(false);
        srhpanel1.setVisible(false);
    }//GEN-LAST:event_srhpanel1MouseClicked

    private void srhpanel1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_srhpanel1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_srhpanel1ValueChanged

    private void srh() {
        srhpanel.setVisible(false);
        String srh = nametxt.getText();
        
        try {
            jlm1.removeAllElements();
            ResultSet rs = d.srh("select *  from supplier where id LIKE '%"+srh+"%' OR name LIKE '%"+srh+"%' OR company LIKE '%"+srh+"%' ");
            for (int i = 0; rs.next(); i++) {
                jlm1.add(i, rs.getString("id") + " - " + rs.getString("name") + " - " + rs.getString("company") );
            }
            srhpanel1.setModel(jlm1);
            srhpanel.setVisible(true);
            srhpanel1.setVisible(true);
            
            if(srhpanel1.getModel().getSize() == 0){
                srhpanel.setVisible(false);
                srhpanel1.setVisible(false);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
                
    }   
    
    private void loadproduct() {
        srhpanel.setVisible(false);
        try {
            ResultSet rs = d.srh("select *  from supplier where id = '"+idlbl.getText()+"' ");
            while(rs.next()) {
                nametxt2.setText(rs.getString("name"));
                companytxt.setText(rs.getString("company"));
                teltxt.setText(rs.getString("number"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
                
    }
    
    
    
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
            java.util.logging.Logger.getLogger(updatesupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatesupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatesupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatesupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updatesupplier dialog = new updatesupplier(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField companytxt;
    private javax.swing.JLabel idlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField nametxt2;
    private javax.swing.JScrollPane srhpanel;
    private javax.swing.JList srhpanel1;
    private javax.swing.JTextField teltxt;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        nametxt2.setText("");
        teltxt.setText("");
        companytxt.setText("");
        idlbl.setText("");
    
    }
}