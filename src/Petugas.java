import java.util.Scanner;

public class Petugas {
    public String namaPetugas;
    DaftarNilai dafNilai = new DaftarNilai();
    Scanner scn = new Scanner(System.in);

    public void inputPetugas() {
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.next();
    }
    /*public void inputNilai() {
        int i = 0;
        for (int i=0; i<dafNilai.jumlahMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
        }
    }*/
}
