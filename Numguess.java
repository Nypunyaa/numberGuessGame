import java.util.Scanner;

public class Numguess {
    public static void main(String[] args){
        int n=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int g=0 ;
        do{
            System.out.println("Guess my number (1-100) :");
             g=sc.nextInt();
            if(n==g) {
            System.out.println("congo!!You made a right guess");
            break;
            }
             else if(n<g)
             {
            System.out.println("Oops!!Guess a little lower number");
            }
            else{
            System.out.println("Oops!!Guess a little higher number");
            }
        }
        while(g>=0);
        System.out.println("My number is:"+n);
    }
}