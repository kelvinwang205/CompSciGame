import java.util.Arraylist;

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

    Item[] itemList = {new Item("<Empty>","<Empty>"),new Item("<Empty>","<Empty>"),new Item("<Empty>","<Empty>"),new Item("<Empty>","<Empty>"),new Item("<Empty>","<Empty>"),new Item("<Empty>","<Empty>"),new Item("<Empty>","<Empty>"),new Item("<Empty>","<Empty>"),new Item("<Empty>","<Empty>"),new Item("<Empty>","<Empty>"),};

    Arraylist<Magic> magicList = new Arraylist<>;

    Potion[] potionBelt = new Potion[3];

    /**
     * Constructor for objects of class Character
     */
    public Character(String n, int h, int a, int d, int m, int s, int i, Weapon newWeapon)
    {
        name = n;
        health = h;
        attack = a + newWeapon.getAttackBonus();
        defense = d + newWeapon.getDefenseBonus();
        magic = m;
        speed = s;
        intelligence = i;
        currentHealth = h;
        magicList.add(newWeapon.magic());
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
        for(int i = 0; i<magicList.size(); i++ )
        {
            System.out.println(magicList.get(i).getName()+": "+magicList.get(i).getDescription());
        }
    }
    public void replaceWeapon(Weapon newWeapon)//magicList must have a Magic object already
    {
        attack = attack-weapon.getAttackBonus();
        defense = defense - weapon.getDefenseBonus();
        weapon = newWeapon;
        attack = attack + newWeapon.getAttackBonus();
        defense = defense + newWeapon.getDefenseBonus();
        magicList.set(0,newWeapon.magic());
    }
    
    public void addMagic(Magic newMagic)
    {
        magicList.add(newMagic);
    }
    public void addItem(Item newItem)
    {
        boolean equals = 0;
        for(int i = 0; i<itemList.length; i++)
        {
            if(itemList[i].getName().equals("<Empty>"))
            {
                itemList[i]=newItem;
                i=itemList.length+1;
                equals++;
            }
            
        }
        if(equals==0)
        {
            System.out.println("Whoops! Your item inventory is full.")
        }
    }
    public void removeItem(String name)
    {
        
    }
    
}
    }
