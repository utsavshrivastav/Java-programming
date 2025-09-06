import java.util.Scanner;
public class Comparison{
  

public static void main(String[] args){

int num ;

System.out.print("Enter a number: ");
Scanner sc = new Scanner(System.in);

   num = sc.nextInt();

   if (num>100 || num<0)
         {
    System.out.println("Enter valid marks");
        }

   else
   {
        if(num>=80) {
           System.out.println("Grade A+");
          }
        else if (num<80 && num>=70){
          System.out.println("Grade A");
               }

        else if(num<70 && num>=60){ 
          System.out.println("Grade B");
                }
        else if (num<60 && num >=50){
           System.out.println("Grade C");
                  }
        else if ( num<50 && num >=40){
           System.out.println("Grade D");
                  }
        else{ 
          System.out.println("Fail");
               }
              }
        sc.close(); // good practice to close scanner


            } 
          }   
     
    

