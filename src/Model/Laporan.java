//NIM=21090029
// NAMA=BIMA ARYA FATAH
// KELAS=1B

package Model;

public class Laporan {
    private String Nama;
    private int NIK;
    private String TTL;
    private  String Tahap;

    public Laporan(String nama, int nik, String ttl, String tahap){
        this.Nama=nama;
        this.NIK= nik;
        this.TTL = ttl;
        this.Tahap = tahap;
    }
    public void  PrintLaporanPengunjung() {
        System.out.println(Nama+" "+NIK+" "+TTL+" "+Tahap);
    }
}
