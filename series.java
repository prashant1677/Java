/* Question:- https://www.hackerrank.com/challenges/java-loops/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
Input Format =The first line contains an integer, , denoting the number of queries.Each line  of the  subsequent lines contains three space-separated integers describing the respective a,b ,n and  values for that query.
Output Format = For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  n space-separated integers.

Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/

import java.util.*;
import java.io.*;
import java.lang.Math;


class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int prev=a;
            
            for(int j=0;j<n;j++){
                prev+=Math.pow(2,j)*b;
                System.out.print(prev+" ");
            }
            System.out.println("");
        }
        in.close();
    }
}
