
/**
 * Weapon held by the character
 * 
 * @author Kelvin Wang 
 * @version 1.1
 */
public class Weapon
{
    private String name;
    private int attackBonus;
    private Magic magic;
    private String description;
    private boolean ranged;
    private int intelligenceReq;
    private int defenseBonus;
    
    public Weapon(String newName, String desc, int atkBonus, int defBonus, Magic mag, boolean range, int intel )
    {
        name = newName;
        description = desc;
        attackBonus = atkBonus;
        defenseBonus = defBonus;
        magic = mag;
        ranged = range;
        intelligenceReq = intel;
    }
    public int getAttack()
    {
        return attackBonus;
    }
    public Magic getMagic()
    {
        return magic;
    }
    public String getDescription()
    {
        return description;
    }
    public String getName()
    {
        return name;
    }
    public boolean getRange()
    {
        return ranged
    }
    public int getIntelligenceReq()
    {
        return intelligenceReq;
    }
    public int getDefense()
    {
        return defense;
    }
}
