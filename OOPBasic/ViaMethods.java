package OOPBasic;
class Student1 {  // student ek datatype bn chuka h apna bnaya hua (non-primitive)
    String name;
    int rollNo;
    String college;

    public void init(String name, int rollNo, String college){
        this.name = name;
        this.rollNo = rollNo;
        this.college = college;
    }
}

public class ViaMethods {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.init("Anshita",12,"JNCT");
    }
}
