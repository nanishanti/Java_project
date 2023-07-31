public class Arithmetic
{
int i=10;
int j=20;


public void add()
{
int add=i+j;
System.out.println("the addition of i and j::"+add);

}

public void sub()
{
int sub=i-j;
System.out.println("the subtraction of i and j::"+sub);
}

public static void main(String args[])
{
Arithmetic obj=new Arithmetic();
obj.add();
obj.sub();
}
