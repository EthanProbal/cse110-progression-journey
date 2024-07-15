import java.util.Scanner;

// Let's make some Classes mf !!!

class ActionFigure {
    String name, origin, color;
    float height, weight, price;

    void printDetails() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Origin: %s\n", origin);
        System.out.printf("Color: %s\n", color);

        System.out.printf("Height: %.2f cm\n", height);
        System.out.printf("Weight: %.2f grams\n", weight);
        System.out.printf("Price: %.2f taka\n", price);
    }
}

public class Lesson8Classes {

    private static void hulkBusterAF() {
        ActionFigure hulkBuster = new ActionFigure();
        hulkBuster.name = "Hulk Buster";
        hulkBuster.origin = "The Avengers";
        hulkBuster.color = "Red and Golden";
        hulkBuster.height = 10; // 10 Cm
        hulkBuster.weight = 500; // 500 grams
        hulkBuster.price = 600; // 600 tk
        hulkBuster.printDetails();
    }

    private static void kratosAF() {
        ActionFigure kratos = new ActionFigure();
        kratos.name = "Kratos - Ghost of Sparta";
        kratos.origin = "God of War series";
        kratos.color = "Ash white, Red stripes";
        kratos.height = 12; // 10 Cm
        kratos.weight = 600; // 500 grams
        kratos.price = 3000; // 600 tk
        kratos.printDetails();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        hulkBusterAF();
        System.out.println();
        kratosAF();
    }
}