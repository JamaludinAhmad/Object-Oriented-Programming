package ngodingalakadarnya;

public class KendaraanBermotor extends Kendaraan{

    int cc;

    KendaraanBermotor(String merk, int tahun_pembuatan){
        super(merk, tahun_pembuatan);
    }

    public int getCC(){
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void infoMotor(){
        super.infoMotor();
        System.out.println("CC " + getCC()
        
        );
    }

    public static void main(String[] args) {
        KendaraanBermotor motorku = new KendaraanBermotor("Vario", 2022);
        motorku.setCc(110);
        motorku.infoMotor();
    }
}
