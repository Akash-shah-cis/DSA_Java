package Day01;

import java.util.Scanner;

public class BinaryToDecimal {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Binary to Decimal");
        System.out.println("Enter Binary ");
        int binary = s.nextInt();
        int power = 0;
        int decimal = 0;
        while(binary > 0){
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            binary = binary / 10;
            power++;
        }
        System.out.println("Decimal number is : "+ decimal);
    }
}
