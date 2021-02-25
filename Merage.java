import java.util.ArrayList;

/**
 * Created by shaker on 02/25/2021.
 */
public class Merage {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("Welcome");
        list1.add("To");
        list1.add("You");
        System.out.println("ArrayList 1 : " + list1);

        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        System.out.println("ArrayList 2 : " + list2);

        list1.addAll(list2);
        System.out.println("Joind Array list : " + list1);
    }
}
