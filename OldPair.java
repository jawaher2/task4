/**
 * Created by shaker on 02/20/2021.
 */
public class OldPair {
    Object first;
    Object second;

    public OldPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "OldPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        OldPair bookpair = new OldPair("book",123);
        String x = (String) bookpair.getFirst();
        int y = (int)bookpair.getSecond();
        System.out.println(bookpair);
    }
}
