/**
 * Created by shaker on 02/20/2021.
 */
public class GenericeMethod {
    public static <E> void print(E arr[]){
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5};
        String b[]={"sss","fff","rrr"};
        print(a);
        print(b);
    }
}
