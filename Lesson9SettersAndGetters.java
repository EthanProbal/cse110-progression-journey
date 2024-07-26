import java.util.Scanner;

// class Book {
//     String title, author, cover, genre;
//     int pageNo, publishYr;
//     boolean hardCopy;

//     void printDetails() {
//         System.out.printf("%s\n", title);
//         System.out.printf("%s\n", author);
//         System.out.printf("%s\n", cover);
//         System.out.printf("%s\n", genre);

//         System.out.printf("%d\n", pageNo);
//         System.out.printf("%d\n", publishYr);
//         System.out.printf("%b\n", hardCopy);
//     }

// }

class Student {
    private String name;
    private int id;

    // --> Set Functions START
    public void setName(String nm) {
        name = nm;
    }

    public void setId(int i) {
        id = i;
    }
    // --> Set Functions END

    // --> Get Functions START
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    // --> Get Functions END

}

public class Lesson9SettersAndGetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Book bk = new Book();

        Student st = new Student();

        st.setName("Chris RedField");
        st.setId(12345678);

        System.out.printf("%s\n", st.getName());
        System.out.printf("%d\n", st.getId());

    }
}