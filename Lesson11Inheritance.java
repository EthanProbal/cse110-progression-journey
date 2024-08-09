import java.util.Scanner;

class Formula {
    int x;
    String name;

    public Formula() {
        x = 0;
        name = "ENTER_NAME_HERE";
    }

    public void setX(int X) {
        x = X;
    }

    public int getX() {
        return x;
    }

    public void setName(String NAME) {
        name = NAME;
    }

    public String getName() {
        return name;
    }
}

class Derived extends Formula {
    int y;
    String city;

    public Derived() {
        y = 0;
        city = "ENTER_CITY_HERE";
    }

    public void setY(int Y) {
        y = Y;
    }

    public int getY() {
        return y;
    }

    public void setCity(String CITY) {
        city = CITY;
    }

    public String getCity() {
        return city;
    }
}

public class Lesson11Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Formula f = new Formula();
        Derived d = new Derived();

        System.out.println(f.getX());
        System.out.println(f.getName());

        System.out.println(d.getY());
        System.out.println(d.getCity());

    }
}