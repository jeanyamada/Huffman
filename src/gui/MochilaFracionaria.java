/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import complementar.myJTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Metodos;

/**
 *
 * @author deadlock
 */
public class MochilaFracionaria extends javax.swing.JPanel {

    /**
     * Creates new form MochilaFracionaria
     */
    public MochilaFracionaria() {
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

        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldCapacidade = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new myJTable()
        ;
        jFormattedTextFielNumObjeto = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel3.setText("Capacidade da mochila");

        jFormattedTextFieldCapacidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Mochila viável ");

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jButton2.setText("executar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("gerar tabela");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Objetos", "Peso", "Valor"
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

        jFormattedTextFielNumObjeto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Numero de objetos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextFieldCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFielNumObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFielNumObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
        defaultTableModel.setRowCount(0);
        if(!jFormattedTextFielNumObjeto.getText().isEmpty()){
            int value = Integer.parseInt(jFormattedTextFielNumObjeto.getText());
           
            for(int i = 0;i < value;i++){
                String [] campos = new String[3];
                campos[0] = "Objeto "+(i+1);
                defaultTableModel.addRow(campos);
            }

        }              
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       // if(jFormattedTextFieldCapacidade.getText().)
        jTable1.getSelectionModel().clearSelection();
        
        if(jTable1.isEditing()) jTable1.getCellEditor().stopCellEditing();
        
        if(jFormattedTextFieldCapacidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Deve fornecer a carga!");
            return;
        }
        Float carga = new Float(jFormattedTextFieldCapacidade.getText());
        
        Integer [] aux = new Integer[jTable1.getRowCount()];
        
        for(int i = 0;i < aux.length;i++)
            aux[i] = i;
        
        Float [] valor = getValor();
        
        if(valor == null) return;
        
        Float [] peso = getPeso();   
        
        if(peso == null) return;
        
        mergeSort(valor, peso,aux,0,jTable1.getRowCount()-1);
        
        Float [] result = Metodos.mochilaFracionaria(peso,valor, carga);
        String out ="";
        
        for(int i = 0;i < result.length;i++){
            

            if(result[i] == 1){
                out+="Objeto "+(aux[i]+1)+"\n";
            }
            else if(result[i] != 0){
                out+=(result[i]*100)+"% do Objeto "+(aux[i]+1)+"\n";
            }
        }
        
        jTextArea3.setText(out);
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private Float[] getPeso(){
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
        Float []peso = new Float[jTable1.getRowCount()];
        
        for(int i = 0;i < jTable1.getRowCount();i++){
            
            String value =  (String) defaultTableModel.getValueAt(i,1);
            
            if(value == null || value.isEmpty()) {
                JOptionPane.showMessageDialog(this,"Todos os campos devem estar preenchidos!");
                return null;
            }
            
           peso[i] = Float.parseFloat(value);
        }
        return peso;
    }
    
    private Float[] getValor(){
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
        Float []valor = new Float[jTable1.getRowCount()];
        
        for(int i = 0;i < jTable1.getRowCount();i++){
            
            String value =  (String) defaultTableModel.getValueAt(i,2);
            
            if(value == null || value.isEmpty()) {
                JOptionPane.showMessageDialog(this,"Todos os campos devem estar preenchidos!");
                return null;
            }
            
           valor[i] = Float.parseFloat(value);
        }
        return valor;
    }

    public static void mergeSort(Float [] valor,Float []peso,Integer [] aux, int inicio, int fim) {

        if (inicio < fim) {

            int meio = (inicio + fim) / 2;

            mergeSort(valor,peso,aux, inicio, meio);
            mergeSort(valor,peso,aux, meio + 1, fim);
            merge(valor,peso,aux, inicio, meio, fim);
        }
    }

    public static void merge(Float [] valor,Float []peso,Integer [] aux, int inicio, int meio, int fim) {

        int i, j, k;
        Float [] auxValor;
        Float [] auxPeso;
        Integer [] auxiliar;
        
        i = inicio;
        j = meio + 1;
        k = inicio; 
        //auxiliar = array.clone();
        
        auxValor = new Float [valor.length];
        auxPeso = new Float [peso.length];
        auxiliar = new Integer[aux.length];
        
        for (int l = i ; l <= fim; l++){ 
                auxValor[l] = valor[l];
                auxPeso[l] = peso[l];
                auxiliar[l] = aux[l];
        }
        
        
        while (i <= meio && j <= fim) {

            if (auxValor[i]/auxPeso[i] < auxValor[j]/auxPeso[j]) {

                valor[k] = auxValor[i];
                peso[k] = auxPeso[i];
                aux[k] = auxiliar[i];
                
                i++;
            } else {
                valor[k] = auxValor[j];
                peso[k] = auxPeso[j];
                aux[k] = auxiliar[j];
                j++;
            }
            k++;
        }

        while (i <= meio) {

            valor[k] = auxValor[i];
            peso[k] = auxPeso[i];
            aux[k] = auxiliar[i];
            i++;
            k++;
        }

        while (j <= fim) {
            valor[k] = auxValor[j];
            peso[k] = auxPeso[j];
            aux[k] = auxiliar[j];
            j++;
            k++;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextFielNumObjeto;
    private javax.swing.JFormattedTextField jFormattedTextFieldCapacidade;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}