package hello;

import java.util.Scanner;

public class merge {

	public static void main(String[] args) {
		int m,n;
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of 1st array");
		m=s.nextInt();
		int []a=new int[m];
		System.out.println("enter 1st sorted arrray - ");
		for(int i=0;i<m;++i)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter size of 2nd array");
		n=s.nextInt();
		int []b=new int[n];
		System.out.println("enter 2nd sorted arrray - ");
		for(int i=0;i<n;++i)
		{
			b[i]=s.nextInt();
		}
		int []c=new int[m+n];
		
		int i=0,j=0,k=0;
		while(i<m && j<n)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		if(i<m)
			c[k++]=a[i++];
		if(j<n)
			c[k++]=b[j++];
		
		for(int p=0;p<m+n;++p)
			System.out.println(c[p]);
					

	}

}
