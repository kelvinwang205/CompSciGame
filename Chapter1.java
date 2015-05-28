import java.util.Random;
import java.util.Scanner;
public class Chapter1 implements Phase
{
  public Phase execute(TheCharacter character)
  {
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    int whileEnd = 0;
    System.out.println("You are about to enter the magical world of De Troit. Do not use capital letters in your responses. Any last words?");
    String lastWords = in.next();
    System.out.println("Ok then. Seeya.")
    for(int i = 0; i<60;i++)
    {
      int randomInt = random.nextInt(Integer.MAX_VALUE);
      System.out.println(randomInt);
    }
    System.out.println("Type anything and press enter to continue.")
    String lastWords = in.next();
    System.out.print('\u000C');
    System.out.println("You wake up with your eyes blurry and head spinning. Some party you had last night.");
    System.out.println("Faint sounds of a speaking voice can be heard. You lift your head to see a terrifying mustache and five o'clock shadow.");
    System.out.println("You're in a one-room, wooden schoolhouse of De Troit High of the mythical low countries of De Troit. Your teacher stares you down.");
    System.out.println("\""+character.getName()+", do you have an answer to my question?\"");
    int answer = in.next();
    while(whileEnd==0)
    {
      if(answer.equals("yes"))
      {
        whileEnd=1;
        System.out.println("\"Oh really? Then tell me... What is the derivative of the cos(x^2)?/"");
        System.out.println("1.-sin(2x)\n2.-2xcos(x^2)\n3.-2xcos(x^2)");
        int newAnswer = in.nextInt();
        if(newAnswer==2)
        {
          System.out.println("\"Impressive.\"");
          System.out.println(character.getName()+" has gained 25 Intelligence!");
          character.setIntelligence(character.getIntelligence()+25);
        }
        else
        {
           System.out.println("Nice try, bud.");
        }
      }
      else if(answer.equals("no"))
      {
        System.out.println("The teacher shakes his head.");
        whileEnd=1;
      }
      else
      {
        System.out.println("I do not understand that command.");
      }
      
    }
    System.out.println("\"Moving on...\"");
    System.out.println("The day moves by slowly. Your teacher, who is also your father, Thomas-Jefferson Thomas lead you through the day.");
    System.out.println("All of a sudden, the sky darkens and the wooden schoolhouse tremors. A reptilian screech can be heard overhead.");
    System.out.println("\"Dragon!\", someone yells.");
    System.out.println("")
    
    
    
  }
  
}
