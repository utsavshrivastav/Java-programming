    import java.util.Scanner;
    public class Checksnos {

public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num=sc.nextInt();

   if (num>0){
    System.out.println("Positive number");
               }

   else if (num==0){
    System.out.println("zero");
              }

   else {
    System.out.println("Negative number");
             }
         sc.close(); // good practice to close scanner

            }
          }   

          
        
          

     

