package ngodingalakadarnya;

class Dataku{
    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}

public class Data {
    
    public static void main(String[] args) {
        Dataku d1 = new Dataku();
        d1.setData("10");
        String nilai = (String)d1.getData();
        System.out.println(nilai);    
    }
}
