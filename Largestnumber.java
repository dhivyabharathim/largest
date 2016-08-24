import java.util.Scanner;
public class Largestnumber {

	public static void main(String[] args) {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value a:");
	a=s.nextInt();
	System.out.println("enter the value b:");
	b=s.nextInt();
	System.out.println("enter the value c:");
	c=s.nextInt();
	if(a>b&&a>c)
	{
		System.out.println("a is big:");
	}
	else if(b>c)
	{
		System.out.println("b is big:");
	}
	else
	{
		System.out.println("c is big");
	}
}
}
