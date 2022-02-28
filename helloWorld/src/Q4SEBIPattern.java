import java.util.Scanner;

public class Q4SEBIPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :: ");
        String str = sc.nextLine();
        sc.close();

        // String cipher= new String(cipherText);
        // System.out.println("The output is : "+cipher);

        String cipher = generateCipher(str);
        System.out.println("Hi::" + str + "---------" + cipher);
    }

    public static String generateCipher(String str) {
        char[] cipherText = new char[str.length()];
        int oscillator = -1;
        for (int i = 0; i < str.length(); i++) {
            oscillator = oscillator * (-1);
            cipherText[i] = formula(str.charAt(i), oscillator*(i+1));// + oscillator;
        }
        String ct = new String(cipherText);
        System.out.println("The output is : "+ct);// +cipherText));
        return ct;
    }

    public static char formula(char c, int no){
        int cipher = c+no;
        if(Character.isAlphabetic(cipher)) return (char)cipher;
        else if(cipher>123) return (char)(97+(cipher-123));
        else if(cipher<98) return (char)(124-(98-cipher));
        else {System.out.println("here"); return 0;}
    }

}