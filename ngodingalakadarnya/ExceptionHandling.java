package ngodingalakadarnya;

public class ExceptionHandling {
    
    public static void main(String[] args){
        try {
            throw new B();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
    
}

class B extends Exception{
    B(){

    }

    public String toString(){
        return "object dengan tipe kelas B";
    }
}
