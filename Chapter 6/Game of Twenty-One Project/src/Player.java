/**
  This program will solve the programming challenge 8, Chapter 6
  
 */

public class Player
{
  private int dieValue1;
  private int dieValue2;
  private int totalDieValue;

  public void rollDice()
  {
    Die die1 = new Die(6);
    Die die2 = new Die(6);
    
    
    dieValue1 = die1.getDieValue();
    dieValue2 = die2.getDieValue();
    
    totalDieValue += (dieValue1 + dieValue2);
  }
  
  public int getTotalDieValue ()
  {
    return totalDieValue;//Can't make it (dieValue1 + dieValue2) because it is adding the die values together after each roll.
  }
  
  public Player()
  {
    dieValue1 = 0;
    dieValue2 = 0;
    totalDieValue = 0;
  }
}
  
    