import java.util.*;
import java.lang.*;
import java.io.*;
class Patient{
String name;
double height,weight;
Patient(double w,double h)
{
weight=w;
height=h;
}
double BMI()
{
return ((weight/(height*height))*703);
}
}
class Patients
{
public static void main (String[] args)
{
Patient a=new Patient(126.7,167.7);
System.out.println(a.BMI());
}
}
