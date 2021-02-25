/**
 * Created by shaker on 02/20/2021.
 */
public class GenericeArray<T> {
   T arr[];
    int num=0;

    public GenericeArray(){
        arr= (T[]) new Object[2];
    }
    public void add (T element){
        if (num <=arr.length-1) {
            arr[num++]=element;
        }
    }
    public void  print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        GenericeArray<Integer> a1=new GenericeArray<>();
        a1.add(11);
        a1.add(12);
        a1.print();
    }
}
