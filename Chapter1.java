import java.util.Random;
import java.util.Scanner;
public class Chapter1 implements Phase
{
  public Phase execute(TheCharacter character)
  {
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    System.out.println("You are about to enter the magical world of De Troit. Any last words?");
    String lastWords = in.next();
    System.out.println("Ok then. Seeya.")
    for(int i = 0; i<60;i++)
    {
      int randomInt = random.nextInt(99999999999999999999999999999999999999999999999) + 100000000000000000000000000000000000000000000;
      System.out.println(randomInt);
    }
    System.out.println("Type anything and press enter to continue.")
    String lastWords = in.next();
    System.out.print('\u000C');
    System.out.println("You wake up with your eyes blurry and head spinning. Some party you had last night.");
    System.out.println("Faint sounds of a speaking voice can be heard. You lift your head to see a terrifying mustache and five o'clock shadow.");
    
  }
  
}
