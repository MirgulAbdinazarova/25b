package excSet;

import java.util.ArrayList;
import java.util.Random;

public class Main2 {
    static Random random=new Random();
    public static void main(String[] args) {

        ArrayList<Student>studentArrayList=new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Student student= new Student("Student" + (i + 1), random.nextInt(15,26),
                    random.nextDouble(1,4.1));
            studentArrayList.add(student);

        }
        for (Student i:studentArrayList){
            System.out.println(i);
        }

    }


}
