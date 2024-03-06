
import java.util.Scanner;

public class guess {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mynum = (int)(Math.random()*100);

        int usernum = 0;
        do{
            System.out.println("Guess my num(1-100) :");
            usernum = sc.nextInt();
            if(usernum == mynum){
                System.out.println("WOOHOO... CORRECT NUMBER!!!");
                break;
            }
            if(usernum > mynum){
                System.out.println("your number is too large");
            }
            else {
                System.out.println("your number is too small");
            }
        }while(usernum >= 0);

        System.out.println("My number was : ");
        System.out.println(mynum);
    }
}
