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
    character.displayInventory();
    System.out.println("1.Draw your weapon\n2.Use a spell\n3.Use an item");
    int i = in.nextInt();
    int win = 0;
    int j = 0;
    while(win==0)
    {
      if(i==1)
      {
        System.out.println("You heroically wield " + character.getWeapon().getName() + " as you charge torwards DeMorgan,"); 
        System.out.println("the esteemed Gatekeeper.");
        if(character.getAttack() >= 100)
        {
          System.out.println("DeMorgan is easy prey for" + character.getWeapon().getName + ", and he disintegrates into");
          System.out.println("a beam of light. The Gate is unguarded and you enter.")
          win = 1;
        }
        else if(character.getAttack() < 100 && character.getAttack >= 25 && j < 3)
        {
          j++;
          if(j <= 1)
          System.out.println("The attack hits DeMorgan, but it does not finish him.");
          if(j == 2)
          System.out.println("DeMorgan is almost finished!");
          System.out.println("DeMorgan attacks with the rage of a thousand nots, and y.");
          character.setHealth(character.getHealth - 50);
          character.displayInventory();
          System.out.println("What will you do?\n1.Attack again\n2.Use a spell\n3.Use an item");
          int i = in.nextInt();
        }
        else if(character.getAttack < 25 && j < 6)
        {
          if(j <= 3)
          System.out.println("The attack does little damage to the great DeMorgan.");
          if(j < 5)
          System.out.println("The attack does little damage to the great DeMorgan, but he begins to hurt.");
          if(j == 5)
          System.out.println("DeMorgan is almost finished!");
          System.out.println
        }
    }
  }
}
