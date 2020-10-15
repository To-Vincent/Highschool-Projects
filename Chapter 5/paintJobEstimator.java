import javax.swing.*;
import java.text.DecimalFormat;
public class paintJobEstimator
{
  public static void main (String[] args)
  {
    //variables 
    String stringInput;
    int rooms;
    int room;
    int hours;
    int gallons;
    int sqFeet;
    int sqFeetTotal = 0;
    double paintCost;
    double labourCost;
    double paintPerGallon;
    double total;
    
    //decimal formatter
    DecimalFormat formatter = new DecimalFormat ("#,###.00");
    
    //ask for rooms
    stringInput = JOptionPane.showInputDialog ("How many rooms are there to be painted?");
      rooms = Integer.parseInt(stringInput);
    
    
    //cost of paint
    stringInput = JOptionPane.showInputDialog ("How much does one gallon of paint cost?");
      paintPerGallon = Double.parseDouble(stringInput);
    
    //for loop
    for (room = 1; room <= rooms; room++)
    {
      stringInput = JOptionPane.showInputDialog ("How many Square feet is being painted in room " + room + "?");
      sqFeet = Integer.parseInt(stringInput);
      sqFeetTotal = sqFeetTotal + sqFeet;
    }
    
    //gallons needed
    gallons = getGallon(sqFeetTotal);
      
    //labour needed
    hours = getHours(sqFeetTotal);
      
    //paint cost
    paintCost = getPaintCost(gallons, paintPerGallon);
    
    //labour charges
    labourCost = getLabourCost(hours);
    
    //grand total
    total = getTotal(labourCost, paintCost);
    
    //total
    JOptionPane.showMessageDialog(null,"The Paint Job will take " + hours + " hours to complete and will require " + gallons + " gallons of paint.");
    JOptionPane.showMessageDialog(null,"The cost of paint will be $" + formatter.format(paintCost) + " and the cost for the labour is $" + formatter.format(labourCost) + ".");
    JOptionPane.showMessageDialog(null,"The total cost of the whole job is $" + formatter.format(total) + ".");
    
    System.exit(0);
  }
  //methoods
  public static int getGallon(int sqFeetTotal)
  {
    if (sqFeetTotal >= 115)
    {
      return sqFeetTotal / 115;
    }
    else 
    {
      return 1;
    }
  }
  
  public static int getHours(int sqFeetTotal)
  {
    return (sqFeetTotal / 14);
  }
  
  public static double getPaintCost (int gallon, double paintPerGallon)
  {
    return gallon * paintPerGallon;
  }
  
  public static double getLabourCost (int hours)
  {
    return hours*18;
  }
  
  public static double getTotal (double labourCost, double paintCost)
  {
    return labourCost + paintCost;
  }
}