import java.io.*;
import java.util.*;
class P31
{
public static void main(String args[])
{
int sum=0;
int[] a=new int[]{1,2,3};
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
for(int i=0;i<a.length;i++){
sum=sum+a[i];
}
System.out.println("Sum of an array is : "+sum);
System.out.println("Average is: "+sum/a.length);
}
}

