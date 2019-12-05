import java.io.*;
import java.util.*;
class P32
{
public static void main(String args[])
{
int[] a=new int[]{3454,2567,783,664,9999,5233};
Arrays.sort(a);
System.out.println("Minimum Value is "+a[0]);
System.out.println("Maximum Value is "+a[a.length-1]);
}
}