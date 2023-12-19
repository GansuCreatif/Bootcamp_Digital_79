
import java.util.Scanner;

public class CafeReservation
{
    public static void main(String[] args){
        String name,gender,day,result;
        int age;
        double appreance,money; 
        Scanner keyboard = new Scanner(System.in);
    
        //inisiasi variable
        result = "";
    
        //Text output untuk Inputan User
        System.out.println("Welcome to Reservation Cafe Secret Semut 79");
        System.out.println("Please insert your Name: ");
        name = keyboard.next();
        
        System.out.println("How old are You?");
        age = keyboard.nextInt();
        
        System.out.println("What is your Gender (Male/Female): ");
        gender = keyboard.next();
        
        System.out.println("How attractive are you? (1 to 10)");
        appreance = keyboard.nextDouble();
        
        System.out.println("How much money do you have ?");
        money = keyboard.nextDouble();
        
        System.out.println("What day do you want to make a Reservation?");
        day = keyboard.next();
        
        //Membuat kondisi IF untuk setiap Day atau Hari Reservasi
        if(day.equalsIgnoreCase("Monday"))
        {
            /*
             * Condition for Monday
             * 
             * Young Night:
             * -Age from 20 to 30
             * -All Gender
             * -Money start from $500
             */
                if(age >= 20 && age <= 30 && money >= 500)
                {
                result = "Reservation successfully, You can Order on Monday. Young Night.";
                }
                else
                {
                 result = "Sorry, You can't Order on Monday!!!. Because it is for Young Night.";
                }
            }
        else if (day.equalsIgnoreCase("Tuesday"))
        {
            /*
             * Condition for Tuesday
             * 
             * Oldest Night:
             * -Age from 31 to 50
             * -Female Gender
             * -Money start from $250
             */
            if(age >= 31 && age <= 50 && money >= 250)
            {
            result = "Reservation successfully, You can Order on Tuesday. Oldest Night.";
            }
            else
            {
            result = "Sorry, You can't Order on Tuesday!!!. Because it is for Oldest Night.";
            }
        }
        else if (day.equalsIgnoreCase("Wednesday"))
        {
            /*
             * Condition for Wednesday
             * 
             * Ladies Night:
             * -Age from 20 to 35
             * -Female Gender
             * -Must Actractive
             * -Money start from $300
             */
            if(gender.equalsIgnoreCase("Female") && age >= 20 && age <= 35 && appreance >= 8 && money >= 300)
            {
            result = "Reservation successfully, You can Order on Wednesday. Ladies Night.";
            }
            else
            {
            result = "Sorry, You can't Order on Wednesday!!!. Because it is for Ladies Night.";
            }
        }
        else if (day.equalsIgnoreCase("Thursday"))
        {
            /*
             * Condition for Thursday
             * 
             * Party Night For Single:
             * -Age from 21 to 30
             * -All Gender
             * -Female must Actractive and money start from $300
             * -Male must have money start $1000
             */
            if(gender.equalsIgnoreCase("Female") && age >= 21 && age <= 30 && appreance >= 8 && money >= 300)
            {
            result = "Reservation successfully, You can Order on Thursday. Party Night For Single.";
            }
            else if(gender.equalsIgnoreCase("Male")&& age >= 21 && age <= 30 && money >= 1000)
            {
            result = "Reservation successfully, You can Order on Thursday. Party Night For Single.";
            }
            else
            {
            result = "Sorry, You can't Order on Thursday!!!. Because it is for Party Night For Single.";
            }
        }
         else if (day.equalsIgnoreCase("Friday"))
        {
            /*
             * Condition for Thursday
             * 
             * Women Night:
             * -Female Age from 21 to 45
             * -Male Age from 21 to 25
             * -All Gender
             * -Male must Actractive
             * -Female must have money at least $1000
             */
            if(gender.equalsIgnoreCase("Female") && age >= 21 && age <= 45 && money >= 1000)
            {
            result = "Reservation successfully, You can Order on Friday. Party Women Night.";
            }
            else if(gender.equalsIgnoreCase("Male")&& age >= 21 && age <= 25 && appreance >= 8)
            {
            result = "Reservation successfully, You can Order on Friday. Party Women Night.";
            }
            else
            {
            result = "Sorry, You can't Order on Thursday!!!. Because it is for Party Night For Single.";
            }
        }
        else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))
        {
            /*
             * Weekend Freedom
             * -Age 18 to 60
             * -money start $1000
             */
            if(age >= 18 && age <= 60 && money >= 1000)
            {
            result = "Reservation successfully, You can Order on Weekend Days. Party Weekend Freedom.";
            }
            else
            {
            result = "Sorry, You can't Order on Weekend Days!!!. Because it is for Party Weekend Freedom.";
            }
        }
        //Output text hasil
        System.out.println();
        System.out.println("Hi "+ name + ", Thank you for using our Application");
        System.out.println("Following Results for your Reservation");
        System.out.println(result);
    }
}
