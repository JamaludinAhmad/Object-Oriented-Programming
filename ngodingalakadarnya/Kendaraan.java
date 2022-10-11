package ngodingalakadarnya;



public class Kendaraan {

    protected String merk;
    protected int tahun_pembuatan;

    Kendaraan(String merk, int tahun_pembuatan){
        this.merk = merk;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTahun_pembuatan(int tahun_pembuatan) {
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }

    public void infoMotor(){
        System.out.println("Merk " + getMerk());
        System.out.println("tahun: " + getTahun_pembuatan());
    }

}