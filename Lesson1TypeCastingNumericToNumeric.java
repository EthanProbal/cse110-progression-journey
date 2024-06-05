public class Lesson1TypeCastingNumericToNumeric {

    // Today is the typecasting session

    public static void main(String[] args) {

        // Widening typecasting

        byte num = 100;

        System.out.println("The number is in byte : " + num);

        int typecastedNum = num;

        System.out.println("The casted number is : " + typecastedNum);

        System.out.println();

        // Narrowing typecasting

        float myNum = 100.05f;

        System.out.println("New number is : " + myNum);

        byte castedNum = (byte) myNum;

        System.out.println("Casted number is : " + castedNum);
    }
}