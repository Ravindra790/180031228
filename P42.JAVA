import java.util.*;
import java.lang.*;
import java.io.*;
class Calculator{
static double powerInt(int num1,int num2)
{
return Math.pow(num1,num2);
}
static double powerDouble(double num3,int num4)
{
return Math.pow(num3,num4);
}
}
class Sample
{
public static void main (String[] args)
{
Calculator a=new Calculator();
Calculator b=new Calculator();
double c=a.powerInt(2,3);
double d=b.powerDouble(2.2,3);
System.out.println("The result of powerInt:"+c);
System.out.println("The result of powerDouble:"+d);
}
}