import java.util.*;
class ThreadA extends Thread{
     public void run( ) {
        int n = 5;
        for (int i = 1; i <= 10; ++i)
            System.out.println(n + " * " + i +
                               " = " + n * i);
        System.out.println("Exiting from Thread A ...");
     }
}

class ThreadB extends Thread 
{
    public void run( ) 
    {
        Scanner sc = new Scanner(System.in);
 int  i,n,p,count,flag;
 
 System.out.println("Enter the number of prime terms you want!");
     n=sc.nextInt();
     System.out.println("First "+n+" prime numbers are :-"); 
 
 p=2;
     i=1; 
     	while(i<=n)
     {
         flag=1;
         for(count=2;count<=p-1;count++)
         {
             if(p%count==0)  
             {
              flag=0;
              break;     
             } 
         }
             if(flag==1)
             {
               System.out.print(p+" ") ;
              i++;
             }
         p++;
     }
}
       
//System.out.println("Exiting from Thread B ...");  
	
    
}

public class Demonstration_111 
{
    public static void main(String args[]) {
         ThreadA a = new ThreadA();
         ThreadB b = new ThreadB();
         a.start();
         b.start();
         System.out.println("... Multithreading is over ");
    }
}
