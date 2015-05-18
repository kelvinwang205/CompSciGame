public class Magic 
{
  private String name; 
  private String description;
  private int length;
  private int health;
  private int attack;
  private int defense;
  private int magic;
  private int speed;
  private int intelligence;
  
    
  public Magic(String n, String d, int l, int h, int a, int d, int m, int s, int i) 
  { 
     name = n; 
     description = d;
     length = l;
     health = h;
     attack = a;
     defense = d;
     magic = m;
     speed = s;
     intelligence = i;
  }
  public String getName()
  {
    return name;
  }
  public String getDescription()
  {
    return description;
  }
  public int getLength()
  {
    return length;
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
  public void battleMagic(TheCharacter character)
  {
    character
  }
} 
