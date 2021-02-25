/**
 * Created by shaker on 02/20/2021.
 */
public class Test {
    public static void main(String[] args) {
        Person p1;
        Student s1 = new Student(19,"jawaher",123);

        p1=s1;//widening cast (لما أحط شي صغير في كبير)
        System.out.println(p1);

        Person p2 = new Student(20,"jawaher",111);
        if (p2 instanceof Student)//handling cast exception
        {
            Student s2 = (Student) p2;//narroing (لما أحط شي كبير في صغير)
            System.out.println(s2);}
        }
    }

