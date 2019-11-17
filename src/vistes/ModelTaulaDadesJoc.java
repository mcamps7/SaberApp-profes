/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import models.Joc;
import models.Partida;
import models.Professor;

/**
 *
 * @author montse
 */
public class ModelTaulaDadesJoc extends AbstractTableModel{
    private final Class[] tipoColumnes;
    private final String[] titleColumnes;
    private List<Partida> partides;
    private List<Joc> jocs;
    private List<Professor> professors;
    
    // This object can interpret strings representing dates in the format dd/MM/yyyy
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
    
    public ModelTaulaDadesJoc() {
        partides = new ArrayList();
        this.titleColumnes = new String[]{"Partida nº", "Data inici", "Data final"};
        this.tipoColumnes = new Class[]{Integer.class, Date.class, Date.class};
    }

    public List<Partida> getPartides() {
        return partides;
    }

    public void setPartides(List<Partida> partides) {
        this.partides = partides;
    }
    
    @Override
    public String getColumnName(int column) {
        return titleColumnes[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipoColumnes[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public int getRowCount() {
        return partides.size();
    }

    @Override
    public int getColumnCount() {
        return titleColumnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return partides.get(rowIndex).getNum_jornada();
            case 1:
                return partides.get(rowIndex).getData_inici();
            case 2: 
                return partides.get(rowIndex).getData_final();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        try {
            switch (columnIndex) {
                case 0:
                    partides.get(rowIndex).setNum_jornada((int) aValue);
                    break;
                case 1:
                    partides.get(rowIndex).setData_inici(df.parse(aValue.toString()));
                    break;
                case 2:
                    partides.get(rowIndex).setData_final(df.parse(aValue.toString()));
                default: ;
            }
            this.fireTableCellUpdated(rowIndex, columnIndex);
            this.fireTableRowsUpdated(rowIndex, rowIndex);
        } catch (ParseException ex) {
            Logger.getLogger(ModelTaulaDadesJoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
