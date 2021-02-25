import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shaker on 02/25/2021.
 */
public class Revers {
    public static void main(String[] args) {
        List numbers = new ArrayList(Arrays.asList(11,12,13,14,15));
        System.out.println("Before : " + numbers);
        int x = numbers.size()-1;
        for (int i = 0; i < x; i++) {
            numbers.add(i, numbers.remove(x));
        }
        System.out.println("After : " + numbers);
    }
}
