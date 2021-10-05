public class complex{
int x;
int y;

void get(int a,int b)
{
	x=a;
	y=b;
}
void show(){
System.out.println(x+"+"+y+"i");
}
public static void main(String[] args){
complex obj1=new complex();
complex obj2=new complex();
complex obj3=new complex();

obj1.get(3,6);
obj2.get(5,6);

obj1.show();
obj2.show();

obj3.x=obj1.x+obj2.x;
obj3.y=obj1.y+obj2.y;
obj3.show();
}
}