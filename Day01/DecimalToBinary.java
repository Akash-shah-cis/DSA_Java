package Day01;

/**
 * DecimalToBinary
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println("Decimal To Binary");
        
        // 1: divide by 2
        // 2. Get reminder
        // 3. bin = bin + rem*pow(10,power)
        // 4. power ++
        
        int DecimalNum = 438;
        int pow = 0;
        int BinaryNum = 0;
        
        while(DecimalNum>0){
            int rem = DecimalNum%2;
            BinaryNum += rem*Math.pow(10,pow);
            pow++;
            DecimalNum /= 2; 
        }
        System.out.print("Binary no of is => " +BinaryNum );
    }
}