import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    for(int i=1; i<=25; i++){
      if(i%2==1)System.out.print(i+" ");
    }
    System.out.println("");

    for(int i=0; i<=73-17; i++){
      if(i%10==0)System.out.println("");
      System.out.print(i+17+" ");
      
    }
    System.out.println("");

    System.out.println("Enter a number between 0 and 50:");
    Scanner N=new Scanner(System.in);
    int n = N.nextInt();
    if(n>0&&n<50){
      for(int i=0; i<=50-n; i++){
        if(i%5==0)System.out.println("");
        System.out.print(i+n+" ");
      }
    } else System.out.print("error");
    
    System.out.println("\nEnter a positive integer:");
    int s = N.nextInt();
    if(s>0){
      for(int i=s; i!=-1; i--){
      if(i%3==0)System.out.print(i+" ");
    }
    } else System.out.println("error");

    

  }
}
