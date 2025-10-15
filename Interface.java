interface Area {
static final float pi = 3.14f;
float compute (float x, float y);
 }


class Rectangle implements Area 
{
public float compute(float x,float y)
{
return(x*y);
}
}


class Circle implements Area
{
public float compute(float x, float y)
{
return(pi*x*x);
}
}





class ICT{
public static void main(String args[]) {
Rectangle rect=new Rectangle();
Circle c = new Circle();
Area area;
area=rect;
System.out.println("Area of rectangle ="+area.compute(10,20));

area=c;
System.out.println("Area of Circle ="+area.compute(10,0));
}
}
