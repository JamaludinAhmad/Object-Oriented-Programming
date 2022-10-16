package sesi4;

public class Wizard extends Hero{
    
    public void suaraKhas(){
        super.suaraKhas();
        System.out.println("Expecto Patronum");
    }

    public static void main(String[] args) {
        Wizard n = new Wizard();
        n.suaraKhas();
    }
}
