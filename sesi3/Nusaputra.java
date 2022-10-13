package sesi3;
import java.util.ArrayList;
import java.util.Scanner;

public class Nusaputra extends Mahasiswa {
    Nusaputra(String nama, String nim, int nilai){
        super(nama, nim, nilai);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Nusaputra> mhs = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.print("isikan NIM: ");
            String nim = sc.nextLine();
            
            System.out.println("isikan Nama: ");
            String nama = sc.nextLine();

            System.out.println("isikan nilai");
            int nilai = Integer.parseInt(sc.nextLine());

            mhs.add(new Nusaputra(nim, nama, nilai));
        }
    }

    public void itungMahasiswa(){

    }
}
