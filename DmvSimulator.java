import java.security.SecureRandom;
public class DmvSimulator{
    public static void main(String[]args){
        SecureRandom random = new SecureRandom();
        int miracle = random.nextInt(100)+1;
        System.out.println("Welcome to DMV simlator.");
        int number = random.nextInt(200)+1;
        System.out.println("Your number is " + number + "\nPlease wait until your number is called.");
        boolean match = true;
        int caller = number+ 1;
        while(match){
            if(caller > 200){
                caller = 1;
            }
            if(caller == number){
                System.out.println(caller);
                if(miracle <= 99){
                System.out.println("You do not have the required paperwork, idiot.");
                System.out.println("Go get your papers and come back!\n\"No questons! Your holding up the line.\");");
                System.out.println("AhahaHAhaHaha");
                match = false;
                } else{
                    System.out.println("You have all the required paperwork. Your all set");
                    match = false;
                }
            }else{
                System.out.println(caller);
                caller++;
            }
        }
    }
}