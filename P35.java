import java.io.*;
import java.util.*;
class P35
{
public static void main(String args[])
{
int[] a=new int[]{3454,2567,783,664,9999,5233};
Arrays.sort(a);
System.out.println("Top 2 Smallest Values are "+a[0]+","+a[1]);
System.out.println("Top 2 Largest Values are "+a[a.length-1]+","+a[a.length-2]);
}
}