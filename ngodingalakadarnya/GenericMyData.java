package ngodingalakadarnya;

class GenericData <T> {
    private T nama;

    public T getNama() {
        return nama;
    }

    public void setNama(T nama) {
        this.nama = nama;
    }
}

public class GenericMyData {
    
    public static void main(String[] args) {
        GenericData <String> d1 = new GenericData<String>();
        GenericData <Integer> d2 = new GenericData<>();
        GenericData <Double> d3 = new GenericData<>();
        
        d1.setNama("A");
        d2.setNama(90);
        d3.setNama(93.20342);

        String nilai = d1.getNama();
        int nilai_i = d2.getNama();
        double nilai_d = d3.getNama();

        System.out.println(nilai);
        System.out.println(nilai_i);
        System.out.println(nilai_d);
    }
}
