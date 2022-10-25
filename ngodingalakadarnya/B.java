package ngodingalakadarnya;

public class B extends A{
    B(){
        System.out.println("kons B dijalankan");
        var_a = "Var_a dari B";
        var_b = "Var_a dari B";
        var_c = "Var_a dari B";
    }
    
    public static void main(String[] args) {
        System.out.println("O A");
        A aa = new A();
        System.out.println("menampilkan ");
        System.out.println(aa.var_a);
        System.out.println(aa.var_b);
        System.out.println(aa.var_c);

        B bb = new B();
        System.out.println("tampil B");
        System.out.println(bb.var_a);
        System.out.println(bb.var_b);
        System.out.println(bb.var_c);

    }
}
