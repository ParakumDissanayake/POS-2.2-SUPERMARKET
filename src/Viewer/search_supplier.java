/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Viewer;

import Model.DB;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ashan Lakshitha
 */
public class search_supplier extends javax.swing.JPanel {

    /**
     * Creates new form ProductSearch
     */
    
    DB d  = new DB();
    DefaultTableModel dtm;
    private String selectedname;
    
    public search_supplier() {
        initComponents();
        dtm = (DefaultTableModel) jTablesu.getModel();
        searchTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextFieldPRO = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablesu = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(922, 475));
        setMinimumSize(new java.awt.Dimension(922, 475));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search By");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "NAME", "GARMENT" }));

        jTextFieldPRO.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldPRO.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPRO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPROKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPROKeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel3.setText("Supplier Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        jTablesu.setBackground(new java.awt.Color(204, 204, 204));
        jTablesu.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTablesu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "TEL", "ADDRESS", "GARMENT"
            }
        ));
        jTablesu.setMaximumSize(new java.awt.Dimension(250, 500));
        jTablesu.setMinimumSize(new java.awt.Dimension(250, 100));
        jTablesu.setPreferredSize(new java.awt.Dimension(250, 250));
        jTablesu.setRowHeight(20);
        jTablesu.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jTablesu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablesuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablesu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPRO, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(314, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(115, 115, 115))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPRO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTablesuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablesuMouseClicked
        searchesupplier();
    }//GEN-LAST:event_jTablesuMouseClicked

    private void jTextFieldPROKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPROKeyReleased
        searchTable();
    }//GEN-LAST:event_jTextFieldPROKeyReleased

    private void jTextFieldPROKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPROKeyTyped
         char c = evt.getKeyChar();
        
        String key = String.valueOf(c);
        
        if  (!(Character.isDigit(c) || key.equals("/") || key.equals("(") || key.equals(")") || key.equals("-") || key.equals("+") 
                || key.equals("/")|| key.equals(",")|| key.equals(".") || key.equals(".") || Character.isAlphabetic(c))) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }


    }//GEN-LAST:event_jTextFieldPROKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablesu;
    private javax.swing.JTextField jTextFieldPRO;
    // End of variables declaration//GEN-END:variables

    private void searchTable() {
        dtm.setRowCount(0);
        try {
            
             String Selectedname = "ID";
            
            if(jComboBox1.getSelectedItem().toString().equals("ID")){
            Selectedname = "ID";
                System.out.println("ID");
            }else  if(jComboBox1.getSelectedItem().toString().equals("NAME")){
            Selectedname = "NAME";
            
            }else  if(jComboBox1.getSelectedItem().toString().equals("GARMENT")){
            Selectedname = "GARMENT";
            }
            
             ResultSet rs = d.srh("select * from supplier where "+Selectedname+" LIKE '%"+jTextFieldPRO.getText()+"%' ");
             while(rs.next()){
                Vector v = new Vector();
                v.add( rs.getString("ID") + " - " + rs.getString("name"));
                v.add(rs.getString("NAME"));
                v.add("");
                v.add("");
                v.add(rs.getString("GARMENT"));
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

    private void searchesupplier() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}