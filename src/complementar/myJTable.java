/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementar;

import javax.swing.JTable;

/**
 *
 * @author deadlock
 */
public class myJTable extends JTable{
    public myJTable(){
        super();
        //this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
    @Override
    public boolean isCellEditable(int row, int col) {
        return col != 0;          
    }
}
