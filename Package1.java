//Save as AccountBalance.java in the folder name as Mypack
//javac -d . AccountBalance.java
//java Mypack.AccountBalance
package MyPack;
class Balance 
{
String name;
double bal;
Balance(String n, double b) 
{
name = n;
bal = b;
}
void show()
{
if(bal<0)
System.out.print("-->> ");
System.out.println(name + ": $" + bal);
}
}
class AccountBalance {
public static void main(String args[]) {
Balance current[] = new Balance[3];
current[0] = new Balance("K. J. Fielding", 123.23);
current[1] = new Balance("Will Tell", 157.02);
current[2] = new Balance("Tom Jackson", -12.33);
}
}
