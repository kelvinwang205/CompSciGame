
import java.util.arraylist;

/**
 * Check
 * Character details
 * @author Kelvin Wang
 * @version 1.1
 */

public class Character

{

    // instance variables - replace the example below with your own

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
    public Character(int a, int d, int m, int s, int i)
    {
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

    public void displayItems()

    {

        for

        public Weapon getItem(int index)

        {

        }
