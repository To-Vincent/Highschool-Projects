//testing employee class
public class EmployeeTest
{

    public static void main(String[] args)
    {
      //variables
      Employee e1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
      Employee e2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
      Employee e3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
      
      //display employee info
      
      //employee 1
      System.out.println("\nEmployee #1");
      System.out.println("Employee name: " + e1.getName());
      System.out.println("ID: " + e1.getIdNumber());
      System.out.println("Department: " + e1.getDepartment());
      System.out.println("Position: " + e1.getPosition());
      
      //employee 2
      System.out.println("\nEmployee #2");
      System.out.println("Employee's name: " + e2.getName());
      System.out.println("ID: " + e2.getIdNumber());
      System.out.println("Department: " + e2.getDepartment());
      System.out.println("Position: " + e2.getPosition());
      
      //employee 3
      System.out.println("\nEmployee #3");
      System.out.println("Employee's name: " + e3.getName());
      System.out.println("ID: " + e3.getIdNumber());
      System.out.println("Department: " + e3.getDepartment());
      System.out.println("Position: " + e3.getPosition() + "\n");
    } 
}