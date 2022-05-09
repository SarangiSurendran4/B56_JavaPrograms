import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int rem,rev=0,tem=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(rev==tem)
			System.out.println(tem+"is palindrome");
		else
			System.out.println(tem+"is not palindrome");
		

	}

}
