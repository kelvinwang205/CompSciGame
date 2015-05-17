
import java.util.arraylist;

/**
 * Check
 * Character details
 * @author Kelvin Wang
 * @version 1.1
 */

public class TheCharacter

{

    // instance variables - replace the example below with your own
    private String name = "";
    private int health = 100;

    private int attack = 0;

    private int defense = 0;

    private int magic = 0;

    private int speed = 0;

    private int intelligence = 0;

    Weapon weapon;

    Item[] itemInventory = new Item[10];

    Arraylist<Magic> magic = new Arraylist<>;

    Potion[] potionBelt = new Potion[3];

    /**
     * Constructor for objects of class Character
     */
    public Character(String n, int h, int a, int d, int m, int s, int i)
    {
        name = n;
        health = h;
        attack = a;
        defense = d;
        magic = m;
        speed = s;
        intelligence = i;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getName()
    {
        return name;
    }
    public int getHealth()
    {
        return health;
    }
    public int getAttack()

    {

        return attack;

    }

    public int getDefense()

    {

        return defense;

    }

    public int getMagic()

    {

        return magic;

    }

    public int getSpeed()

    {

        return speed;

    }

    public int getIntelligence()

    {

        return intelligence;

    }
    public void setHealth(int newHealth)
    {
        health = newHealth;
    }
    public void setAttack(int newAttack)

    {

        attack = newAttack;

    }

    public void setDefense(int newDefense)

    {

        defense = newDefense;

    }

    public void setMagic(int newMagic)

    {

        magic = newMagic;

    }

    public void setSpeed(int newSpeed)

    {

        speed = newSpeed;

    }

    public void setIntelligence(int newIntelligence)

    {

        intelligence = newIntelligence;

    }

    public void displayInventory()

    {
        System.out.printf("Weapon:"+weapon.getName()+"\n");
        System.out.printf("Description:"+weapon.getDescription()+"\n");
        System.out.printf("Ranged:"+weapon.getRange()+"\n");
        System.out.printf("Items:\n")

        for(int i = 0; i<itemInventory.length; i++ )
        {
            System.out.println(itemInventory[i].getName()+": "+itemInventory[i].getDescription());
        }
        System.out.printf("Magic:\n")
        for(int i = 0; i<magic.size(); i++ )
        {
            System.out.println(magic.get(i).getName()+": "+magic.get(i).getDescription());
        }
    }
    public boolean battle(TheCharacter opponent)
    {
        System.out.println();
        System.out.printf("%-30s|",name);
        System.out.printf("%30s", opponent.getName());
        System.out.println();
        System.out.printf("-------------------------------------------------------------");
        System.out.println();
        System.out.printf("%-30s|","Attack:"+attack);
        System.out.printf("%30s", "Attack:"+opponent.getAttack());
        System.out.println();
        System.out.printf("%-30s|","Defense:"+defense);
        System.out.printf("%30s", "Defense:"+opponent.getDefense());
    }
}
    }
