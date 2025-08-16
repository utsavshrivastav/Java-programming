import java.util.Scanner;

public class Sum {
	int a , b , c;
	Scanner ip =new Scanner(System.in);
	
	 void set()
	 {
		 System.out.println("Enter the number a and b ");
		 a= ip.nextInt();
		 b= ip.nextInt();

	 }

	 void cal()
	 {
		 c = a+b;
		 System.out.println("c="+c);
		 
	 }
		 public static void main(String[] args) {
		
		 Sum ob = new Sum();
			ob.set();
			ob.cal();

		}

	}

