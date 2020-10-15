import javax.swing.*;
import java.text.DecimalFormat;
public class kineticEnergy
{
  public static void main (String[] args)
  {
    //variables
    double Mass;
    double Velocity;
    double kineticEnergy;
    
    //decimal formatter
    DecimalFormat formatter = new DecimalFormat ("#,###.00");
    
    //get Mass
    Mass = getMass();
      
    //get Velocity
    Velocity = getVelocity();
      
    //kinetic energy calculation
    kineticEnergy = getKineticEnergy (Mass, Velocity);
    
    JOptionPane.showMessageDialog(null,"the kinetic energy in your object is " + formatter.format(kineticEnergy));
    System.exit(0);
  }
  
  //methoods
  public static double getMass()
{
  //variables
  String inputMass;
  double Mass;
  
  //get Mass
  inputMass = JOptionPane.showInputDialog ("What is the mass of the object in kilograms?");
  Mass = Double.parseDouble(inputMass);
  
  //Return width
  return Mass;
}
  
  public static double getVelocity()
{
  //variables
  String inputVelocity;
  double Velocity;
  
  //get width
  inputVelocity = JOptionPane.showInputDialog ("What is the velocity of the object?");
  Velocity = Double.parseDouble(inputVelocity);
  
  //Return width
  return Velocity;
}
  public static double getKineticEnergy (double Mass, double Velocity)
  {
   //variables
    double kineticEnergy;
    
    Velocity = Velocity * Velocity;
    kineticEnergy = 0.5 * Mass * Velocity;
    return kineticEnergy;
  }
}
    