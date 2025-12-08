/*public interface upper 
{
     void drawupper(int n);

}

public interface lower
{
    void drawlower(int n);
}
    

class Sandglass implements upper , lower {

    @Override
    public void drawupper();
    {
        int space = 0, n; 
        for(int stars = n ; stars >=1 ; stars =-2)
        {
        printSpace(space);
            printStars(stars);
            space++;

        }
    }
}

@Override
 public void drawlower()
  {
    int space = (n/2) - 1 ; 
    for(int stars = 3 ; stars>=n; stars =+2)
    {
        printspace(space);
        printstars(stars);
        space-- ; 
    }
  }


  private void spaces(int count)
  {
    for(int i = 0 ; i < count ; i++)
    {
        System.out.print(" ");
    }
  }

  private void stars(int count)
  {
    for(int i = 0 ; i < count ; i++)
    {
        System.out.print("*");
    }
    System.out.println();
  }

  public class Main{
    public static void main(String arg[])
    {
        int n = 7 ;
        Sandglass sp = new Sandglass();
        sp.drawupper();
        sp.drawlower();
    }
  }

*/


