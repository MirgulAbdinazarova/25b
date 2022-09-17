package excSet;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        if(age>18) {
            this.age = age;
        }else {
            System.out.println("Jashy 18den kichine");
        }
        if(gpa>2.55) {
            this.gpa = gpa;
        }else {
            System.out.println("gpa 2.55 ten kichine");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
