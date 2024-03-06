import java.security.SecureRandom;
public class DmvSimulator{
    public static void main(String[]args){
        SecureRandom random = new SecureRandom();
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
                System.out.println("You do not have the required paperwork, idiot.");
                System.out.println("Go get your papers and come back!");
                match = false;
            }else{
                System.out.println(caller);
                caller++;
            }
        }
    }
}