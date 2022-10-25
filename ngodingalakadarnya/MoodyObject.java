package ngodingalakadarnya;

/**
 * MoodyTest
 */

public class MoodyObject{
    protected String getMood(){
        return "Moody";
    }

    public void speak(){
        System.out.println("I am on " + getMood());
    }

    void laugh (){}
    void cry (){}

}

class SadObject extends MoodyObject{
    protected String getMood(){
        return "SAD";
    }

    public void cry(){
        System.out.println("Cry harder");
    }
}

class MoodyTest {

    public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        m.speak();

        m = new SadObject();
        m.speak();
        m.cry();
    }
    
    
}