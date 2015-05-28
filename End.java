import java.util.Scanner

public class End implements Phase
{
  public Phase execute(TheCharacter character)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("You stare out a window of the Jefferson Airplane and realize you are about to land.");
    System.out.println("The Jefferson Airplane lands and you exit with the melancholy feeling of having to leave");
    System.out.println("the beautiful plane, but your realize that you must defeat the powers of logic before");
    System.out.println("the entire land of De Troit is destroyed");
    System.out.println("As you exit the plane you see the Gate and the Gatekeeper.");
    System.out.println("You calmly approach only to realize that the Gatekeeper is no one other than Augustus DeMorgan,");
    System.out.println("the one whom Bono warned of.")
    System.out.println("You weigh your decision heavily as you realize you must battle.");
    System.out.println("1.Draw your weapon\n2.Use a spell\n3.Use an item");
    int i = in.nextInt();
    int win = 0;
    while(win==0)
    {
      if(i==1)
      {
        System.out.println("You heroically wield your weapon as you charge torwards DeMorgan, the esteemed Gatekeeper.");
    }
  }
}
