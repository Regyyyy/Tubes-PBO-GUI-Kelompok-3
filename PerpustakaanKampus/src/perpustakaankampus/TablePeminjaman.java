package perpustakaankampus;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import perpustakaankampus.Peminjaman;

public class TablePeminjaman extends AbstractTableModel {
    
    List <Peminjaman> listPeminjaman;
    
    public TablePeminjaman() {}
    public TablePeminjaman(List<Peminjaman> listPeminjaman) { this.listPeminjaman = listPeminjaman; }
    
    public Peminjaman getRow(int row) { return listPeminjaman.get(row); } 
    
    @Override
    public int getRowCount() { return listPeminjaman.size(); }
    @Override
    public int getColumnCount() { return 8; }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> listPeminjaman.get(rowIndex).getIdPeminjaman();
            case 1 -> listPeminjaman.get(rowIndex).getNim();
            case 2 -> listPeminjaman.get(rowIndex).getKodeBuku();
            case 3 -> listPeminjaman.get(rowIndex).getJudulBuku();
            case 4 -> listPeminjaman.get(rowIndex).getTanggalPinjam();
            case 5 -> listPeminjaman.get(rowIndex).getBatasPinjam();
            case 6 -> listPeminjaman.get(rowIndex).isDisetujui();
            case 7 -> listPeminjaman.get(rowIndex).isSelesai();
            case 8 -> listPeminjaman.get(rowIndex).getDenda();
            default -> null;
        };
    }
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "IdPeminjaman";
            case 1: return "NIM";
            case 2: return "KodeBuku";
            case 3: return "JudulBuku";
            case 4: return "TanggalPinjam";
            case 5: return "BatasPinjam";
            case 6: return "Disetujui";
            case 7: return "Selesai";
            case 8: return "Denda";
            default: return null;
        }
    }
    
}