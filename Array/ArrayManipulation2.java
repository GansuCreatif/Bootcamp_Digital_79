import java.util.Scanner;


public class ArrayManipulation2
{
     public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int changeNumber, indexToChange = 0;
        int numbers[] = {3,2,5,11,7,10,11,3,15,11,17,10,5};
        //boolean isThere = false;
        
        System.out.println("Array Number");
        System.out.print("{3,2,5,11,7,10,11,3,15,11,17,10,5}");
        
        System.out.println("Merubah nilai dari arrays numbers !!!");
            do{
                System.out.println("Masukan posisi yang mau diganti 1 - 13 : ");
                indexToChange = keyboard.nextInt();
            }while(indexToChange < 1 || indexToChange > 13);
        System.out.println("Masukan nilai yang akan diinputkan kedalam array numbers: ");
        changeNumber = keyboard.nextInt();
            for(int i=0; i < numbers.length; i++)
            {
                if(indexToChange - 1 == i)
                {
                    numbers[i] = changeNumber;
                }
            }
        System.out.println("Menampilkan array numbers setelah dirubah");
        System.out.print("{");
            for(int i=0; i < numbers.length; i++)
            {
                System.out.print(numbers[i] + " ");
            }
        System.out.print("}");
    }
}
