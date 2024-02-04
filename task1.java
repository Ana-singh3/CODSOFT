//NUMBER GAME
import java.io.*;
import java.util.*;
public class task1 {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("-----NUMBER GAME---- ");
    System.out.println("generating a random number btw 1-100!");

    int x=(int)(Math.random()*100)+1;
    
    System.out.println(" RULES - ");
    System.out.println("# We have generated a random number btw 1-100 . Time to guess !!");
    System.out.println("# Only 5 attempts/round allowed and a maximum of 2 rounds are allowed");
    
    for(int i=1;i<=2;i++)//number of rounds
    {
        int a=0;//number of attempts
        System.out.println("Round "+i +" Enter the number");
    int no=0;
    while(no!=x && a<=5)
    {  
     no=sc.nextInt();
    if(no<x)
    {
        System.out.println("Try again ! Too Low");a++;
    
    }
    else if(no>x){
        System.out.println("Try again ! Too High ");a++;
        
    }
}
    
    if(no==x)
    {
        System.out.println("Congratulations !! Correct guess");
        break;
    }
    else{
        System.out.println("Out of attempts!! "+x+" was the correct number");
      
    }

   
    System.out.println("YOUR FINAL SCORE OUT OF 10 (based on the number of attempts played) IS="+(10-a));
}
    sc.close();

}
}



