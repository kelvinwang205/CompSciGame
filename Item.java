public class Item
{
  private String name;
  private String description;
  
  public Item(String n, String d, int e){
    name=n;
    description=d;
    effect=e;
  }
  
  public String getName(){
    return name;
  }
  
  public String getDescription(){
    return description;
  }
}
