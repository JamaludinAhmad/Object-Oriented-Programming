package ngodingalakadarnya;

class Bapak{
    int a;
    int b;

    void show_variabel(){
        System.out.println("nilai a = " + a);
        System.out.println("nilai b = " + b );

    }

}

class Anak extends Bapak{
    int c;
    int a;
    int b;
    void show_variabel(){
        System.out.println("nilai a =  " + super.a);
        System.out.println("nilai b =  " + super.b);
        System.out.println("nilai c =  " + c);

    }
}

public class InheritExample {
    
    public static void main(String[] args) {
        Bapak bpk = new Bapak();
        Anak ank = new Anak();

        bpk.a = 1;
        bpk.b = 2;
        bpk.show_variabel();

        ank.c = 90;
        ank.show_variabel();
        
    }
    
}
