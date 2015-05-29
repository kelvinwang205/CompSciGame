import java.util.ArrayList;

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
    
    private int health = 0;
    
    private int currentHealth;

    private int attack = 0;

    private int defense = 0;

    private int magic = 0;

    private int speed = 0;

    private int intelligence = 0;

    Weapon weapon;

    ArrayList<Item> itemList = new ArrayList<>();

    ArrayList<Magic> magicList = new ArrayList<>();


    /**
     * Constructor for objects of class Character
     */
    public TheCharacter(String n, int h, int a, int d, int m, int s, int i, Weapon newWeapon)
    {
        name = n;
        health = h;
        attack = a + newWeapon.getAttack();
        defense = d + newWeapon.getDefense();
        magic = m;
        speed = s;
        intelligence = i;
        currentHealth = h;
        magicList.add(newWeapon.getMagic());
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
        System.out.printf("Items:\n");

        for(int i = 0; i<itemList.size(); i++ )
        {
            System.out.println(itemList.get(i).getName()+": "+itemList.get(i).getDescription());
        }
        System.out.printf("Magic:\n");
        for(int i = 0; i<magicList.size(); i++ )
        {
            System.out.println(magicList.get(i).getName()+": "+magicList.get(i).getDescription());
        }
    }
    public void replaceWeapon(Weapon newWeapon)//magicList must have a Magic object already
    {
        attack = attack-weapon.getAttack();
        defense = defense - weapon.getDefense();
        weapon = newWeapon;
        attack = attack + newWeapon.getAttack();
        defense = defense + newWeapon.getDefense();
        magicList.set(0,newWeapon.getMagic());
    }
    
    public void addMagic(Magic newMagic)
    {
        magicList.add(newMagic);
    }
    public void addItem(Item newItem)
    {
       itemList.add(newItem);
    }
    
}
