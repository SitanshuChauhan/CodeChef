
//https://www.codechef.com/MARCH21C/problems/NOTIME

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                long H = sc.nextLong();
                long x = sc.nextLong();
                long T[] = new long[N];
                String result = "No";
                for(int i = 0;i < N;i++)
                {
                    T[i] = sc.nextLong();
                    if(T[i] >= H-x)
                        result = "Yes";
                }
                System.out.println(result);
            }
        }
        