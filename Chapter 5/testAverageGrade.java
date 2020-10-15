import javax.swing.*;
import java.text.DecimalFormat;
public class testAverageGrade
{
  public static void main (String[] args)
  {
    //variables
    char letterGrade;
    String stringInput;
    double average;
    double total = 0;
    double testScore = 0;
    int test;
    
    //decimal formatter
      DecimalFormat formatter = new DecimalFormat (".00");
      
     //for loop
      for (test = 1; test <=5; test++)
      {
       stringInput = JOptionPane.showInputDialog ("What is the score of test " + test + "?");
       testScore = Double.parseDouble(stringInput);
       total = total + testScore;
       
       //determine letter grade
       letterGrade = determineGrade (testScore);
       JOptionPane.showMessageDialog(null, "Test " + test + " = " + letterGrade);
  }
  
  //calculate average return letter grade
  average = calcAverage(total);
  testScore = average;
  letterGrade = determineGrade (testScore);
  JOptionPane.showMessageDialog (null, "Average = " + formatter.format(testScore) + "%");
  JOptionPane.showMessageDialog (null, "Final Grade = " + letterGrade);
  
  System.exit(0);
}

public static char determineGrade (double testScore)
{
  //char holder
  char grade = 'F';
    
  //determine grade
    if (testScore < 60)
  {
    grade = 'F';
  }
  
  else if (testScore < 70)
  {
    grade = 'D';
  }
  
 else if (testScore < 80)
 {
   grade = 'C';
 }
 else if (testScore < 90)
 {
   grade = 'B';
 }
 else if (testScore <= 100)
 {
   grade = 'A';
 }
 return grade;
}

 public static double calcAverage(double total)
 {
   return total / 5;
 }
}
   