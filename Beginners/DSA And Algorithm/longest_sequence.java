package hello;

import java.util.Scanner;

public class longest_sequence {

	public static void main(String[] args) 
	{
		int m;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of 1st array");
		m=s.nextInt();
		int []a=new int[m];
		System.out.println("enter arrray elements - ");
		for(int i=0;i<m;++i)
		{
			a[i]=s.nextInt();
		}
		int lc=1,pc=1;
		for(int i=1;i<m;i++)
		{
			if(a[i]>a[i-1])
				pc++;
			else {
			if(pc>lc)
				{
					lc=pc;
					pc=1;
				
				}
			
		}
		}
		if(pc>lc)
		{
			lc=pc;
			pc=1;
		
		}
		System.out.println(lc);
	}

}
