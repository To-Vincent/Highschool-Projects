
/**
  This program will solve the programming challenge 8, Chapter 6
  
  This is a class
 */
import java.util.Random;

public class Die
{
  private int numberSides;
  private int dieValue;
  
  public void roll ()
  {
    Random random = new Random();
    
    dieValue = random.nextInt(numberSides) + 1;
  }
  public int getDieValue()
  {
    return dieValue;
  }
  public Die (int numberSidesGiven)
  {
    numberSides = numberSidesGiven;
    roll();
  }
}