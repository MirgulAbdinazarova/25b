package excSet;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Company  implements CompanyInterface{
    private ArrayList<Student>studentArrayList=new ArrayList<>();

    public Company(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }
    public Company(){

    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    @Override
    public void addStudents(Student student) {
            studentArrayList.add(student);
    }

    @Override
    public void printEmployers() {
        for (Student i:studentArrayList) {
            System.out.println(i.getName());
            System.out.println(i.getAge());
            System.out.println(i.getGpa());
        }

    }

    @Override
    public void gpaTop5() {
        ArrayList<Student>studentArrayList=new ArrayList<>();
        Set<Student>studentSet=new TreeSet<>(studentArrayList);
        System.out.println(studentSet);
    }
}
