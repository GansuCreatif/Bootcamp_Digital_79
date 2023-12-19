import java.util.Scanner;


public class TebakAngka
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int secret,guess;
        boolean pass = false;
        
        secret = 1 + (int)(Math.random()*10);
        System.out.println("I am thingking of number from 1 to 10");
        System.out.println("You must guess what it is in three tries");
        System.out.println("Enter a guess: ");
        
        for(int i=0; i < 3; i++)
        {
            guess = keyboard.nextInt();
                if(guess == secret)
                {
                    System.out.println("RIGHT");
                    System.out.println("You have won a game");
                    pass = true;
                    break;
                }
                else if(Math.abs(guess - secret) == 1)
                {
                    System.out.println("HOT");
                }
                else if(Math.abs(guess - secret) == 2)
                {
                    System.out.println("WARM");
                }
                else
                {
                    System.out.println("COLD");
                }
        }
        
        System.out.println("Wrong.");
        System.out.println("The corret number was "+ secret + ".");
        System.out.println("You have lost game.");
    }

}
