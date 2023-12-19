import java.util.Scanner;

/**
 * Write a description of class CalculateMoneySpent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculateMoneySpent
{
     public static void main(String[] args){
        String name;
        int moneySpent;
        double average;
        int total;
        int totalDay = 7;
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Masukan nama: ");
        name = keyboard.next();
        
        System.out.println("Money spent Club Monday ?");
        moneySpent = keyboard.nextInt();
        
        total = moneySpent;
        
        System.out.println("Money spent Club Tuesday ?");
        moneySpent = keyboard.nextInt();
        
        total = total + moneySpent;
        
        System.out.println("Money spent Club Wednesday ?");
        moneySpent = keyboard.nextInt();
        
        total = total + moneySpent;
        
        System.out.println("Money spent Club Thursday ?");
        moneySpent = keyboard.nextInt();
        
        total = total + moneySpent;
        
        System.out.println("Money spent Club Friday ?");
        moneySpent = keyboard.nextInt();
        
        total = total + moneySpent;
        
        System.out.println("Money spent Club Saturday ?");
        moneySpent = keyboard.nextInt();
        
        total = total + moneySpent;
        
        System.out.println("Money spent Club Sunday ?");
        moneySpent = keyboard.nextInt();
        
        total = total + moneySpent;
        
        average = (double) total/totalDay;
        
        System.out.println("The Calculation Result: ");
        System.out.println("Hi"+ name);
        System.out.println("Total money spent club for weeks: "+ total);
        System.out.println("with average daily : "+ average);
    
    }
  
}
