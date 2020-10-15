import javax.swing.*;
import java.text.DecimalFormat;
public class AeraRectangle
{
  public static void main (String[] args)
  {
    //variables
    double length;
    double width;
    double area;
    
    //get dimensions
    length = getLength();
    width = getWidth();
    
    //calculations
    area = getArea (width, length);
    
    //show answer
    displayData(area);
    System.exit(0);
  }


//methoods
public static double getWidth()
{
  //variables
  String inputWidth;
  double theWidth;
  
  //get width
  inputWidth = JOptionPane.showInputDialog ("What is the width of the rectangle?");
  theWidth = Double.parseDouble(inputWidth);
  
  //Return width
  return theWidth;
}

public static double getLength()
{
  //variables
  String inputLength;
  double theLength;
  
  //get Length
  inputLength = JOptionPane.showInputDialog ("What is the length of the rectangle?");
  theLength = Double.parseDouble(inputLength);
  
  //Return Length
  return theLength;
}

public static double getArea(double theLength, double theWidth)
    {
      return theLength * theWidth;
    }
    
 public static void displayData(double area)
    {
      //decimal formatter
      DecimalFormat formatter = new DecimalFormat ("#,###.00");
    
  JOptionPane.showMessageDialog(null, "The area of the rectangle is " + formatter.format(area));
  }
}
      