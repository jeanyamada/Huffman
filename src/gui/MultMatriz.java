/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deadlock
 */
public class MultMatriz extends javax.swing.JPanel {

    /**
     * Creates new form MultMatriz
     */
    public MultMatriz() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFormattedTextFieldColuna = new javax.swing.JFormattedTextField();
        jFormattedTextFieldLinha = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jScrollPane1.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matriz", "Linha", "Coluna"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jFormattedTextFieldColuna.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jFormattedTextFieldLinha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setText("inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Linha");

        jLabel2.setText("Coluna");

        jButton2.setText("remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("executar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTable1.getRowCount() == 0){
                     
            if(!jFormattedTextFieldLinha.getText().isEmpty() && !jFormattedTextFieldColuna.getText().isEmpty()){
                
                DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();

                Integer [] lxc = new Integer[3];

                lxc[0] = 1;
                lxc[1] = new Integer(jFormattedTextFieldLinha.getText());
                lxc[2] = new Integer(jFormattedTextFieldColuna.getText());

                if(lxc[0] <1 || lxc[1] < 1){
                    JOptionPane.showMessageDialog(this,"Os valores devem ser maiores que zero!");
                    return;
                }

                defaultTableModel.addRow(lxc); 

                jFormattedTextFieldLinha.setEditable(false);
            }            
        }
        else{
            if(!jFormattedTextFieldColuna.getText().isEmpty()){
                DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();

                Integer [] lxc = new Integer[3];

                lxc[0] = jTable1.getRowCount()+1;
                lxc[1] =  (Integer) defaultTableModel.getValueAt(defaultTableModel.getRowCount()-1,1);
                lxc[2] = new Integer(jFormattedTextFieldColuna.getText());

                if(lxc[0] <1 || lxc[1] < 1){
                    JOptionPane.showMessageDialog(this,"Os valores devem ser maiores que zero!");
                    return;
                }

                jFormattedTextFieldLinha.setText(Integer.toString(lxc[1]));

                defaultTableModel.addRow(lxc);       
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
        
        if(jTable1.getSelectedRow() >= 0){
            
            if(jTable1.getSelectedRow() > 0 && jTable1.getSelectedRow() < jTable1.getRowCount()-1)
                defaultTableModel.setValueAt(defaultTableModel.getValueAt(jTable1.getSelectedRow(),1),jTable1.getSelectedRow()-1,1);
            else{
                if(jTable1.getSelectedRow() > 0)
                    jFormattedTextFieldLinha.setText(Integer.toString((int) defaultTableModel.getValueAt(jTable1.getRowCount()-1,0)));
            }
                
            defaultTableModel.removeRow(jTable1.getSelectedRow());
        }
        
        if(jTable1.getRowCount() == 0) jFormattedTextFieldLinha.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jTable1.getRowCount() > 0)
            jTextArea1.setText(metodos.Metodos.multMatriz(getValuesTable()));
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private Integer[] getValuesTable(){
        
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
        
        Integer [] values = new Integer[jTable1.getRowCount()+1];
        
        for(int i = 0;i < jTable1.getRowCount();i++)
            values[i] = (Integer) defaultTableModel.getValueAt(i,1);
        
        values[jTable1.getRowCount()] = (Integer) defaultTableModel.getValueAt(jTable1.getRowCount()-1,2);
        
        return values;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextFieldColuna;
    private javax.swing.JFormattedTextField jFormattedTextFieldLinha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}