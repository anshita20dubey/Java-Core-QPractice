package OOPBasic;

class Student2 {  // student ek datatype bn chuka h apna bnaya hua (non-primitive)
    String name;
    int rollNo;
    String college;

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", college='" + college + '\'' +
                '}';
    }

    public Student2(){}
    public Student2(String name, int rollNo, String college) {
        this.name = name;
        this.rollNo = rollNo;
        this.college = college;
    }

}

public class ViaContructor {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Anshita", 12, "JNCT"); // parametrized constructor
        Student2 s2 = new Student2(); // default constructor
        System.out.println(s1);
    }
}
