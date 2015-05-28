import java.util.Random;
import java.util.Scanner;
public class Chapter1 implements Phase
{
  public Phase execute(TheCharacter character)
  {
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    int whileEnd = 0;
    System.out.println("You are about to enter the magical world of De Troit. Any last words?");
    String lastWords = in.next();
    System.out.println("Ok then. Seeya.")
    for(int i = 0; i<60;i++)
    {
      int randomInt = random.nextInt(99999) + 10000;
      System.out.println(randomInt);
    }
    System.out.println("Type anything and press enter to continue.")
    String lastWords = in.next();
    System.out.print('\u000C');
    System.out.println("You wake up with your eyes blurry and head spinning. Some party you had last night.");
    System.out.println("Faint sounds of a speaking voice can be heard. You lift your head to see a terrifying mustache and five o'clock shadow.");
    System.out.println("You're in a one-room, wooden schoolhouse of De Troit High of the mythical low countries of De Troit. Your teacher stares you down.");
    System.out.println(character.getName()+", do you have an answer to my question?\n1.Yes\n2.No\n3.C");
    int answer = in.nextInt();
    while(whileEnd==0)
    {
      if(answer==1)
      {
        whileEnd=1;
        System.out.println("Oh really? Then tell me... What is the derivative of the cos(x^2)?");
        System.out.println("1.-sin(2x)\n2.-2xcos(x^2)\n3.-2xcos(x^2)");
        int newAnswer = in.nextInt();
        if(newAnswer==2)
        {
          System.out.println(""Impressive."");
          System.out.println(character.getName()+" has gained 25 Intelligence!");
          character.setIntelligence(character.getIntelligence()+25);
        }
        else
        {
           System.out.println("Nice try, bud.");
        }
      }
      else if(answer==2||answer==3)
      {
        System.out.println("The teacher shakes his head.");
        whileEnd=1;
      }
      else
      {
        System.out.println("Choose one of the number options.");
      }
      
    }
    System.out.println("")
    
    
    
  }
  
}
