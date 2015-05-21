import java.util.Scanner;
public class Chapter1 implements Phase
{
  public void execute(TheCharacter character)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Oh, hello there. What is your name?")
    String name = in.next();
    System.out.println("Dope name, "+name+".")
  }
}
