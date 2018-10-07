import java.util.Scanner;

/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Menentukan nilai terbesar dan terkecil dari nilai-nilai
 * mahasiswa yang jumlah dan nilainya diinputkan oleh petugas dengan konsep OOP
 *
 */
public class main {

    public static void main(String[] args) {
        Petugas ptg = new Petugas();
        DaftarNilai dafNilai = new DaftarNilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
        ptg.inputPetugas();
        dafNilai.inputJumlahMhs();

//        input nilai mhs
        for (int i=0; i<dafNilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
            dafNilai.hitungNilaiTerbesar(i);
            dafNilai.hitungNilaiTerkecil(i);
        }
        dafNilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah "+dafNilai.nBesar);
        System.out.println("Nilai terkecil adalah "+dafNilai.nKecil);

        System.out.print("\nPetugas : "+ptg.namaPetugas);
    }
}
