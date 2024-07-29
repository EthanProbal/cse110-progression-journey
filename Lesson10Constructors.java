import java.util.Scanner;

class Character {
    private String name;
    private int age;

    public Character() {
        name = "NAME_NOT_ENTERED";
        age = -25;
    }

    public Character(String nmm) {
        name = nmm;
        age = 99;
    }

    public Character(String nmm, int agg) {
        name = nmm;
        age = agg;
    }

    public void setName(String nm) {
        name = nm;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class Lesson10Constructors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Character ch = new Character();
        Character ch1 = new Character("Chris RedField");
        Character ch2 = new Character("Jill Valentine", 25);

        System.out.println(ch.getName());
        System.out.println(ch.getAge() + "\n");

        ch.setName("Jesus Christ");
        ch.setAge(35);

        System.out.println(ch.getName());
        System.out.println(ch.getAge() + "\n");

        System.out.println(ch1.getName());
        System.out.println(ch1.getAge() + "\n");

        System.out.println(ch2.getName());
        System.out.println(ch2.getAge() + "\n");

    }
}