
//https://www.codechef.com/problems/SALE2

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int T= s.nextInt();
	    for(int i=0;i<T;i++){
	        int N=s.nextInt();
	        int X=s.nextInt();
	        System.out.println((N-N/3)*X);
	    }
	}
}
