/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InSearch_Search;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hamma
 */
public class Model extends AbstractTableModel{

    private String[] columns;
    private Object[][] rows;

    public Model() {
    }

    public Model(String[] columns, Object[][] rows) {
        this.columns = columns;
        this.rows = rows;
    }
    
    public Class getColumnClass(int column){
        if(column == 0){
            return Icon.class;
        }
        else {
            return getValueAt(0,column).getClass();
        }
    }
    
    public int getRowCount() {
        return this.rows.length;
    }

    
    public int getColumnCount() {
        return this.columns.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
    return this.rows[rowIndex][columnIndex];
    }
    public String getColumnName(int col){
        return this.columns[col];
    }
}
