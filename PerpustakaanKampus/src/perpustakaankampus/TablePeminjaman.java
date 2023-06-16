/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaankampus;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class TablePeminjaman extends AbstractTableModel {
    List <Peminjaman> listPeminjaman;
    
    public TablePeminjaman(List<Peminjaman> listPeminjaman) {
        this.listPeminjaman = listPeminjaman;
    }
    
    public Peminjaman getRow(int row) {
        return listPeminjaman.get(row);
    } 
    
    @Override
    public int getRowCount() {
        return listPeminjaman.size();
    }
    public int getColumnCount() { 
        return listPeminjaman.getClass().getDeclaredFields().length; 
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex) {
            case 0: return listPeminjaman.get(rowIndex).getNim();
            case 1: return listPeminjaman.get(rowIndex).getBuku();
            case 2: return listPeminjaman.get(rowIndex).getTanggalPinjam();
            case 3: return listPeminjaman.get(rowIndex).isDisetujui();
            case 4: return listPeminjaman.get(rowIndex).isSelesai(); 
            case 5: return listPeminjaman.get(rowIndex).getDenda();
            case 6: return listPeminjaman.get(rowIndex).getKondisiBuku(); 
            default: return null;
        }
    }
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id";
            case 1: return "Panjang";
            case 2: return "Lebar";
            case 3: return "Tinggi";
            case 4: return "Tinggi";
            case 5: return "Tinggi";
            case 6: return "Tinggi";
            default: return null;
        }
    }
}
