package sesi4;

public class Assassin extends Hero{
    
    public void suaraKhas(){
        super.suaraKhas();
        System.out.println("We work in the dark, to serve the light");
    }

    public static void main(String[] args) {
        Assassin a = new Assassin();

        a.suaraKhas();
    }
}
