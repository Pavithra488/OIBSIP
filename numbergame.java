import java.util.*;
import java.util.Random;
public class numbergame
{ 
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int j=1,k=1,score=0;
        do
        {
        System.out.println("Rules for the game :\n~Enter any number between 1 to 100\n~After your guess a random number will be generated\n~You will be given a maximum of 3 chances to guess the correct number\n~If your guess is correct the final score,number of attempts will be displayed along with number of attempt in which you made it correct and the game will be over\n~After the 3rd chance even if you wish to continue,the game will be over followed by displaying he final score and the number of attempts");
        System.out.println("enter the number :");
        int n=sc.nextInt();
        if(n>=1 && n<=100){
        Random random=new Random();
        int r=random.nextInt(1,100);                        
        System.out.println("The random number is "+r); 
        if(n==r)
        {
          System.out.println("Correct answer");
          
          score++;
          if(j==1)
          {
              System.out.println("Congratulations!You got the correct answer in the 1st attempt");
          }
          else if(j==2)
          {
              System.out.println("Congratulations!You got the correct answer in the 2nd attempt");
          }
          else
          {
              System.out.println("Congratulations!You got the correct answer in the 3rd attempt");
          }
        }
        else if(Math.abs(n-r)<=5)
        {
            
          System.out.println("too low");
          System.out.println("Better luck in the next attempt");
        }
        else
        {
          System.out.println("too high");
          System.out.println("Better luck in the next attempt");
        }
      
        System.out.println("enter 1 to continue and 0 to exit");
        k=sc.nextInt();
        j++;
    }
    else 
    {
        System.out.println("Error!\nEnter number 1 to 100");
    }
       } while(j!=4 && k==1 && score==0 );
       System.out.println("Your number of attempts are "+(j-1));
       System.out.println("Your score is "+score);
       System.out.println("Thankyou! for playing");
       
    }
    
}