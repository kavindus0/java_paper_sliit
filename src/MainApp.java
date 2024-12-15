import java.awt.print.Book;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        ArrayList<Item> arrayList = new ArrayList<>();

        Books book1 = new Books("Book 1",  1,300,  "School",200,"Dasatha");
        Books book2 = new Books("Book 2",  2,350,  "Physics",380,"Lanka Newspapers");
        arrayList.add(book1);
        arrayList.add(book2);

        Car car1 = new Car("Red KZ-1222",001,4350000,"V8","SUV");
        Car car2 = new Car("Blue VX-1992",002,2450000,"F9","SUV");

        arrayList.add(car1);
        arrayList.add(car2);

    }
}
