interface Printable{
void print();
}
interface Showable{
void show();
}
class A47 implements Printable,Showable{
public void print(){
System.out.println("Hello");
}
public void show(){
System.out.println("Welcome");
}
public static void main(String args[])
{
A47 obj=new A47();
obj.print();
obj.show();
}
}