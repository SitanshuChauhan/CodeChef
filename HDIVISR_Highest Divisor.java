
//https://www.codechef.com/FEB21C/problems/HDIVISR

import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),x=0;
	for(int i=1;i<11;i++){
	    if(n%i==0 && i>x)
	        x=i;
    }
        System.out.println(x);
    }
}
