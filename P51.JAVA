import java.util.*;
import java.io.*;
import java.lang.*;
class Author
{
private static String name;
private static String email;
private static char gender;
Author(String n,String e,char g)
{
name=n;
email=e;
gender=g;
}
}
class Book
{
String name1,author;
double price;
int qtyInStock;
Book(String n1)
{
name1=n1;
}
void setPrice()
{
price=170;
}
double getPrice()
{
return price;
}
void setQtyInStock()
{
qtyInStock=7;
}
int getQtyInStock()
{
return qtyInStock;
}
String getName()
{
return name1;
}
}
class Books{
public static void main(String args[])
{
Book b=new Book("Computer Networks");
System.out.println("The name of the author is  Ravindra Babu");
System.out.println("The email id is : drbabu91177@gmail.com");
System.out.println("The gender is : M");
b.setPrice();
b.setQtyInStock();
System.out.println("The name of the book is :"+b.getName());
System.out.println("The price of the book is :"+b.getPrice());
System.out.println("The stock is :"+b.getQtyInStock());
}
}
