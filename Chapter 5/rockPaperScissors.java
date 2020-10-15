import javax.swing.*;
import java.util.*;
public class rockPaperScissors
{
  public static void main (String[] args)
  {
    //variables
      String computerOutcome;
      String userOutcome = "";
      String playAgain;
      String winner;
      int random;
      
    //random number generator
    Random randomNumbers = new Random();
    do
    {
      do
      {
    //numbers between
    random = randomNumbers.nextInt(3) + 1;
    
    //get User's input
    userOutcome = userRPS(userOutcome);
    
    //get computer's outcome
    computerOutcome = computerRPS(random);
 
    //display choices
   JOptionPane.showMessageDialog(null, "You chose " + userOutcome + "\n" + "The computer Chose " + computerOutcome);
    
    //print winner
    winner = getWinner(userOutcome, computerOutcome);
    JOptionPane.showMessageDialog(null, winner + "!");
      }while (winner.equals("It's a tie!"));
    
    //play again
    playAgain = JOptionPane.showInputDialog("Do you want to play again?");
      
      }while (playAgain.equalsIgnoreCase("yes"));
      JOptionPane.showMessageDialog(null, "Thanks for playing");
        
        System.exit(0);
    }

//methoods
    public static String userRPS (String userOutcome)
    {
      String userRPS = "";
      
    userOutcome = JOptionPane.showInputDialog ("Rock Paper or Scissors?");
    if (userOutcome.equalsIgnoreCase ("Rock"))
    {
      userRPS = "Rock";
    }
    else if (userOutcome.equalsIgnoreCase ("Paper"))
    {
      userRPS = "Paper";
    }
    else if (userOutcome.equalsIgnoreCase ("Scissors"))
    {
      userRPS = "Scissors";
    }
    else
    {
  JOptionPane.showInputDialog ("Input invalid please choose either Rock Paper or Scissors.");
    }
    return userRPS;
    }
    
    public static String computerRPS (int random)
    {
      //variables
      String computerRPS = "";
         
         
      if (random == 1)
      {
        computerRPS = "Rock";
      }
      else if (random == 2)
      {
        computerRPS = "Paper";
      }
      else if (random == 3)
      {
        computerRPS = "Scissors";
      }
      return computerRPS;
    }
    
    //winner
    public static String getWinner (String computerRPS, String userRPS)
    {
      String winner = "";
      
      if (computerRPS.equalsIgnoreCase (userRPS))
      {
        winner = "Its a tie!";
      }
      else if (computerRPS.equalsIgnoreCase("Rock") && userRPS.equalsIgnoreCase("Paper"))
      {
        winner = "You Lose!";
      }
      else if (computerRPS.equalsIgnoreCase("Rock") && userRPS.equalsIgnoreCase("Scissors"))
      {
        winner = "You win!";
      }
      else if (computerRPS.equalsIgnoreCase("Paper") && userRPS.equalsIgnoreCase("Rock"))
      {
        winner = "You win!";
      }
      else if (computerRPS.equalsIgnoreCase("Paper") && userRPS.equalsIgnoreCase("Scissors"))
      {
        winner = "You Lose!";
      }
      else if (computerRPS.equalsIgnoreCase("Scissors") && userRPS.equalsIgnoreCase("Rock"))
      {
        winner = "You Lose!";
      }
      else if (computerRPS.equalsIgnoreCase("Scissors") && userRPS.equalsIgnoreCase("Paper"))
      {
        winner = "You win!";
      }
      return winner;
  }
}
                 
      
    
      