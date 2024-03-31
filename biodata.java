// import scanner ke dalam kode program 
import java.util.Scanner;

class Biodata1 {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);

        System.out.println("## Biodata Mahasiswa ##");
        System.out.println("====================");
        System.out.println();
        // Deklarasi variabel
        String nama, nim, prodi;
        System.out.print("Nama: ");
        nama = input.nextLine();

        System.out.print("NIM: ");
        nim = input.nextLine();

        System.out.print("Prodi: ");
        prodi = input.nextLine();

        System.out.println();

        System.out.println("Data Mahasiswa");
        System.out.println("==============");
        System.out.println();
        System.out.println("Nama:"   + nama);
        System.out.println("NIM:"   + nim);
        System.out.println("Program Studi:"   + prodi);
        System.out.println();
        System.out.println("===============");

        





    }
}
