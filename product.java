public class product{
String pcode,pname;
float price;
public void setdata(String a,String b,float c){
pcode=a;
pname=b;
price=c;
}
void display()
{
System.out.println("\nPCODE: " +pcode+"\nPNAME: " +pname+ "\nPRICE: " +price);
}
public static void main(String[] args){
product obj1=new product();
product obj2=new product();
product obj3=new product();

obj1.setdata("p1001","Back pack",100);
obj2.setdata("p1005","Travel bag",50);
obj3.setdata("p1008","Hand bag",10);
System.out.println("The product with lowest price");
if((obj1.price<obj2.price) && (obj1.price<obj3.price))
{
	obj1.display();
}
else if(obj2.price<obj3.price)
{
	obj2.display();
}
else
{
	obj3.display();
}
}
}
