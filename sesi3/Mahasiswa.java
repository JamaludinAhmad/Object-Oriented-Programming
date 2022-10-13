package sesi3;

public class Mahasiswa {
    String nama, nim;
    int nilai;

    Mahasiswa(String nama, String nim, int nilai){
        this.nama = nama;
        this.nama = nim;
        this.nilai = nilai;
    }

    public String getGrade(){
        if(getNilai() >= 80 && getNilai() <= 100){
            return "A";
        }

        else if(getNilai() >= 70 && getNilai() < 80){
            return "B";
        }

        else if((getNilai() >= 60 && getNilai() < 70)){
            return "C";
        }

        else if((getNilai() >= 50 && getNilai() < 60)){
            return "D";
        }
        
        return "E";
    }

    public void infoMahasiswa(){
        System.out.println("NIM: " + getNim());
        System.out.println("Nama: " + getNama());
        System.out.println("Nilai: " + getNilai());
        System.out.println("GRADE: " + getGrade());
        System.out.println("========================================");
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}
