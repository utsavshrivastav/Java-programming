
public class PatternsQues {
    public static void main(String[] args)
{int a=65;
for (int i=1;i<=4;i++){
           for(int j=1;j<=i;j++){
             System.out.print(" ");    }
            for (int k=1;k<=5-i;k++)
{System.out.print((char)a+ " ");  a++;}
  System.out.println(); }
for(int i=4;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print(" ");
}
for (int k=1;k<=5-i;k++)
{System.out.print((char)a+" ");  a++;}
System.out.println();  
}}}

