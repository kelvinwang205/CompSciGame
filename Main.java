import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int end = 1;
        Phase phase = null;
        System.out.println("Oh, hello there. What is your name?");
        String name = in.next();
        System.out.println("Dope name, "+name+".");
        TheCharacter character = new TheCharacter(name,100,0,0,0,0,0,new Weapon("Fisticuffs","Good ol' fashioned fists",0,0,new Magic("<Empty>","<Empty>")));
        Phase phase = new Chapter1(character);
        while(end == 1)
        {
            phase = Chapter1.execute();
            end = 0;
            
        }
        System.out.println("------- The End -------");
    }
}
