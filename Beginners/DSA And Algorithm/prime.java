

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter a no : ");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int count=0;
    for(int i=1;i<=n;i++)
    {
    	if(n%i==0)
    		count++;
    }
    if(count==2)
    	System.out.println("Prime no");
    else
    	System.out.println("not prime");
	}
}
