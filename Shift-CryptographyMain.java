
package shiftcryptography;

import java.util.Scanner;

public class ShiftCryptographyMain {
    public static void main(String[] args) {
        int key;
        String str,str1;
        ShiftCryptography shiftcryptography=new ShiftCryptography();
        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        System.out.print("Enter key:");
        key=scan.nextInt();
        System.out.print("Enter text to encript:");
        str=scan1.nextLine();
       shiftcryptography.encript(key, str);
        System.out.print("Enter text to decript:");
       str1=scan1.nextLine();
        shiftcryptography.decript(key, str1);
    }
}
