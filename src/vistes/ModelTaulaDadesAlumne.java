/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistes;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import models.Alumne;

/**
 *
 * @author montse
 */
public class ModelTaulaDadesAlumne extends AbstractTableModel {

    private final Class[] tipusColumnes;
    private final String[] titleColumnes;
    private List<Alumne> alumnes;

    public ModelTaulaDadesAlumne() {
        alumnes = new ArrayList();
        this.titleColumnes = new String[]{"id_alumne", "Nick", "Contrasenya", "Nom", "Cognoms", "Email", "Institut", "Curs", "Punts", "Partides jugades"};
        this.tipusColumnes = new Class[]{Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Integer.class};
    }

    public List<Alumne> getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(List<Alumne> alumnes) {
        this.alumnes = alumnes;
    }

    @Override
    public String getColumnName(int column) {
        return titleColumnes[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipusColumnes[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public int getRowCount() {
        return alumnes.size();
    }

    @Override
    public int getColumnCount() {
        return titleColumnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return alumnes.get(rowIndex).getId();
            case 1:
                return alumnes.get(rowIndex).getNick();
            case 2:
                return alumnes.get(rowIndex).getPassword();
            case 3:
                return alumnes.get(rowIndex).getNom();
            case 4:
                return alumnes.get(rowIndex).getCognoms();
            case 5:
                return alumnes.get(rowIndex).getEmail();
            case 6:
                return alumnes.get(rowIndex).getInstitut();
            case 7:
                return alumnes.get(rowIndex).getCurs();
            case 8:
                return alumnes.get(rowIndex).getPuntuacio();
            case 9:
                return alumnes.get(rowIndex).getNum_partides_jugades();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                alumnes.get(rowIndex).setId((int) aValue);
                break;
            case 1:
                alumnes.get(rowIndex).setNick(aValue.toString());
                break;
            case 2:
                alumnes.get(rowIndex).setPassword(aValue.toString());
                break;
            case 3:
                alumnes.get(rowIndex).setNom(aValue.toString());
                break;
            case 4:
                alumnes.get(rowIndex).setCognoms(aValue.toString());
                break;
            case 5:
                alumnes.get(rowIndex).setEmail(aValue.toString());
                break;
            case 6:
                alumnes.get(rowIndex).setInstitut(aValue.toString());
                break;
            case 7:
                alumnes.get(rowIndex).setCurs((int) aValue);
                break;
            case 8:
                alumnes.get(rowIndex).setPuntuacio((int) aValue);
                break;
            case 9:
                alumnes.get(rowIndex).setNum_partides_jugades((int) aValue);
                break;
            default: ;
        }
        this.fireTableCellUpdated(rowIndex, columnIndex);
        this.fireTableRowsUpdated(rowIndex, rowIndex);

    }

}
