package ngodingalakadarnya;

import java.util.Scanner;

public class Typing {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int yusgi = 0;
        int wigi = 0;

        String sesiScore = sc.nextLine();
        sesiScore += " ";

        for(int i = 0; i < sesiScore.length(); i++){
            if(sesiScore.charAt(i) == ' ' || sesiScore.charAt(i + 1) == ' '){
                continue;
            }

            if(sesiScore.charAt(i) == '1' && sesiScore.charAt(i + 1) == '0'){
                yusgi++;
            } 
            else{
                wigi++;
            }
        }

        if(yusgi > wigi){
            System.out.println("Yusgi menang");
        }
        else if(wigi > yusgi){
            System.out.println("wigi menang");
        }

        sc.close();
    }
}
