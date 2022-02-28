/*
Ques - Formatted output - https://www.hackerrank.com/challenges/java-output-formatting/problem
        
#Input Format::Every line of input will contain a String followed by an integer. Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

#Output Format::In each line of output there should be two columns:The first column contains the String and is left justified using exactly  characters. The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
*/

import java.util.Scanner;
import java.util.*;

public class formattedOutput {

    public static void main(String[] args) {
        String str = "java 100 \n"
                + "cpp 65\n"
                + "python 50\n";
        Scanner sc = new Scanner(str);

        System.out.println("Input::");
        System.out.println(str);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String st = sc.next();
            int x = sc.nextInt();
            // Complete this line
            Formatter fmt = new Formatter();
            fmt.format("%-15s%03d", st, x);
            System.out.println(fmt);
        }
        System.out.println("================================");

    }
}
