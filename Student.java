/**
 * Created by shaker on 02/20/2021.
 */
public class Student extends Person {
    public int id ;

    public Student(int age, String name, int id) {
        super(age, name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "id=" + id +
                '}';
    }
}
