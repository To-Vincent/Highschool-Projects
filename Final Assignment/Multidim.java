import java.util.*;
public class Multidim{

  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  char array[][] = new char[14][7];
         
  int row=1;
  int k=1;;
  int r=0,c=0;
  int O=0;

  System.out.println("Welcome to Java Airlines!");

   row=1;
     System.out.println("       | A | B | C | D | E | F |" );
      for(int i=0;i<13;i++){
      for(int j=0;j<6;j++){
      array[i][j]='*';

        if(j==0)
        {
        if(row<=9)
        System.out.print("Row"+row+"  ");
        else
        System.out.print("Row"+row+" ");   
        }
        System.out.print(" | "+array[i][j]);
        }
        System.out.print(" |");
        System.out.println();
        row++;
        }

    for(O=0;O<13;O++){ //just playing it out to enter another ticket
    array[r][c]='X';
    System.out.print("Please Select your ticket type[1]First Class[2]Economy Class");
    
    int m = sc.nextInt();

      switch(m){
                case 1: System.out.println("Please Enter Desired Seat");
                          System.out.print("Enter Row[1-2]:");
                          r = sc.nextInt();
                          System.out.print("Enter Column[1=A|2=B|3=C|4=D|5=E|6=F]:");
                          c = sc.nextInt();
                          break;
                          
                case 2:System.out.print("Smoking(1) or Non-smoking(2)");
                         int sn = sc.nextInt();
                          if(sn==1){
                            System.out.print("Enter Row[3-7]:");
                            r = sc.nextInt();
                            System.out.print("Enter Column[1=A|2=B|3=C|4=D|5=E|6=F]:");
                            c=sc.nextInt();
                          }
                          else if(sn==2){
                            System.out.print("Enter Row[8-13]:");
                            r = sc.nextInt();
                            System.out.print("Enter Column[1=A|2=B|3=C|4=D|5=E|6=F]:");
                            c=sc.nextInt();
                          }
                          break;
                default:  System.out.print("Invalid!");
                          break;
                          }
            
      System.out.println("       | A | B | C | D | E | F |" );
      row=1;
      r=r-1;
      c=c-1;
      for(int i=0;i<13;i++){
           for(int j=0;j<6;j++){
           if(r==i && c==j )
           {
             array[i][j]='X';
           }
           if(j==0)
           {
             if(row<=9)
               System.out.print("Row"+row+"  ");
             else
               System.out.print("Row"+row+" ");        
           }
               System.out.print(" | "+array[i][j]);
            }
            System.out.print(" |");
                System.out.println();
                row++;
            }
            }
    }
}
