import java.io.*;
import java.util.*;
class Box
{
public double vol(double width,double height,double depth)
{
return width*height*depth;
}
public static void main(String args[])
{
Box rb=new Box();
double a=rb.vol(2.2,3.3,4.4);
System.out.println(a);
}
}