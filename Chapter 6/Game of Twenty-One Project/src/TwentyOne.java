import java.util.Scanner;
public class TwentyOne
{
  public static void main ( String [] args ) 
  {
    Scanner scanner = new Scanner (System.in);
    char playAgain = 'y';
    Player player1 = new Player();
    Player computer = new Player();
    
    System.out.println ( "The 21 Game");
    System.out.println ( "The Rules: ");
    System.out.println ( "1. The player will be playing against the computer");
    System.out.println ( "2. The goal of the game is to roll a dice value that is the closest to 21");
    System.out.println ( "3. The player and computer will start off by rolling two dice");
    System.out.println ( "4. The computer's dice value will be hidden untill the end of the round");
    System.out.println ( "5. The player will choose to roll again or stay with the existing value");
    System.out.println ( "6. If your value is bigger than the computer's value without exceeding 21, you win the game!\n");
      
      
   
    
    while ( playAgain == 'y')
    {
     player1.rollDice();
     computer.rollDice();
     {
       if ( player1.getTotalDieValue() <= 21)
       {
     System.out.println ( "You just rolled and your total is " + player1.getTotalDieValue());
     System.out.println ( "The computer just rolled");
     System.out.println ("Do you want to roll? (y/n)");
     playAgain = scanner.nextLine().charAt(0);
       }
       else {
         playAgain = 'N';
       }
    }
    }
    if (((player1.getTotalDieValue() > computer.getTotalDieValue()) && (player1.getTotalDieValue() <=21 )) || (((player1.getTotalDieValue() < computer.getTotalDieValue()) && (computer.getTotalDieValue() >21 ))&&player1.getTotalDieValue() <= 21))
    
{
  System.out.println ( "Player 1 won with a total of " + player1.getTotalDieValue() + ", the computer had " + computer.getTotalDieValue());
}
    else if ((( computer.getTotalDieValue()> player1.getTotalDieValue())&&( player1.getTotalDieValue() <= 21)) || (((computer.getTotalDieValue() < player1.getTotalDieValue()) && (player1.getTotalDieValue() >21 )) && computer.getTotalDieValue() <= 21))
    {
  System.out.println ( "The computer won with a total of " + computer.getTotalDieValue() + ", player 1 had " + player1.getTotalDieValue());
  }
    else if (( computer.getTotalDieValue() == player1.getTotalDieValue()) && (computer.getTotalDieValue() > 21)&&( player1.getTotalDieValue() > 21))
    {
  System.out.println ( "Its a tie! The computer had " + computer.getTotalDieValue() + ", player 1 had " + player1.getTotalDieValue());
  }
    else {
      System.out.println("Both players were over 21");
}
  }
  }



    
  





    
      