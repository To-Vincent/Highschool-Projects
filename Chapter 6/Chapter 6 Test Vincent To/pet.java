//pet class
public class pet
{
  //private fields
  private String name;
  private String animal;
  private int age;
  private int weight;
  
  //constructors
  public pet(String n, String a, int i, int w)
  {
    name = n;
    animal = a;
    age = i;
    weight = w;
  }
  
  //mutator methood (sets private field values)
  public void setName(String n)
  {
    name = n;
  }
  public void setAnimal(String a)
  {
    animal = a;
  }
    public void setAge(int i)
  {
    age = i;
  }
  public void setWeight(int w)
  {
    weight = w;
  }
  
  //accessor methoods (returns private field values)
  public String getName()
  {
    return name;
  }
  public String getAnimal()
  {
    return animal;
  }
  public int getAge()
  {
    return age;
  }
  public int getWeight()
  {
    return weight;
  }
}