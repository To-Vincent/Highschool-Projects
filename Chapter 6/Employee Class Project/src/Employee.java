//Employee Class
class Employee
{
  //private fields
  private String name;
  private String department;
  private String position;
  private int idNumber;
  
  //constructors
  public Employee(String n, int id, String d, String p)
  {
    name = n;
    idNumber = id;
    department = d;
    position = p;
  }
  public Employee(String n, int id)
  {
    name = n;
    idNumber = id;
    department = position = "";
  }
  public Employee()
  {
    name = department = position = "";
    idNumber = 0;
  }
  
  
  // Mutator methood (sets private field values)
  public void setName(String n)
  {
    name = n;
  }
  public void setDepartment(String d)
  {
    department = d;
  }
  public void setPosition(String p)
  {
    position = p;
  }
  public void setIdNumber(int i)
  {
    idNumber = i;
  }
  
  
  //Accessor methood (returns private field values)
  public String getName()
  {
    return name;
  }
  public String getDepartment()
  {
    return department;
  }
  public String getPosition()
  {
    return position;
  }
  public int getIdNumber()
  {
    return idNumber;
  }
}