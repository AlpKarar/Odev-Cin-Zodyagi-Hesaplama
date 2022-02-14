import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int year, rem;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the year of your birth: ");
        year = input.nextInt();
        
        rem = year%12;
        
        String str = "Your Chinese Zodiac Sign: ";
        
        switch(rem) {
            case 0:
               System.out.print(str + "Monkey");
               break;
            case 1:
               System.out.print(str + "Rooster");
               break;
            case 2:
               System.out.print(str + "Dog");
               break;
            case 3:
               System.out.print(str + "Pig");
               break;
            case 4:
               System.out.print(str + "Mouse");
               break;
            case 5:
               System.out.print(str + "Ox");
               break;
            case 6:
               System.out.print(str + "Tiger");
               break;
            case 7:
               System.out.print(str + "Rabbit");
               break;
            case 8:
               System.out.print(str + "Dragon");
               break;
            case 9:
               System.out.print(str + "Snake");
               break;
            case 10:
               System.out.print(str + "Horse");
               break;
            case 11:
               System.out.print(str + "Sheep");
               break;
        }
    }
}
