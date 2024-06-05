public class Lesson2TypeCastingNumericToNonNumericAndViceVersa {

    public static void main(String[] args) {
        // Numeric to Non Numeric conversion and Vice versa

        // Numeric to Char and Vice Versa
        int asciiOfA = 65;
        System.out.println("The integer is : " + asciiOfA);

        char castedChar = (char) asciiOfA;

        System.out.println("The original Char is : " + castedChar);

        // Vice versa

        char theChar = 'A';

        int castedInt = (int) theChar;

        System.out.println("The original Char is : " + theChar);
        System.out.println("The integer is : " + castedInt);

        // ----------------------------End of part one---------------------------

        // Numeric to String

        int myNum = 10;
        System.out.println("Integer is : " + myNum);

        // String result = String.valueOf(myNum);
        String result = Integer.toString(myNum);
        System.out.println("This is the string : " + result);

        // Numeric to String

        String myString = "20";
        System.out.println("The String is : " + myString);

        int expectedNum = Integer.parseInt(myString);
        System.out.println("The converted Integer is : " + expectedNum);

        // ---------------------------End of part 2----------------------------
        // ---------------------------End of Code----------------------------

    }
}