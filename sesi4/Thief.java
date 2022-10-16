package sesi4;

public class Thief extends Hero{
    
    public void suaraKhas(){
        super.suaraKhas();
        System.out.println("STEALLLLLLLLLLLLLLLLLLL");
    }

    public static void main(String[] args) {
        Thief t = new Thief();
        t.suaraKhas();
    }
}
