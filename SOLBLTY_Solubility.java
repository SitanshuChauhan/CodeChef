
//https://www.codechef.com/MAY21C/problems/SOLBLTY

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
	    int t=s.nextInt();
	    int i;
	    
	    for(i=0;i<t;i++){
	        int X=s.nextInt();
	        int A=s.nextInt();
	        int B=s.nextInt();
	        System.out.println((A+(100-X)*B)*10);
	    }
	}
}
