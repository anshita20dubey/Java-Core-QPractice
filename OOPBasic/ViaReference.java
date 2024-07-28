package OOPBasic;

class Student3 {  // student ek datatype bn chuka h apna bnaya hua (non-primitive)
    String name;
    int rollNo;
    String college;
}
public class ViaReference {
    public static void main(String[] args) {
        Student3 s1 = new Student3(); // data ko via reference bhj rhe h but isme data duplicacy ho rhi h
        s1.name = "Blabla"; // string - array of characters hota h jisko ye object point kr rha h
        s1.rollNo = 23;
        s1.college = "LNCT";

        Student3 s2 = new Student3();
        s2.name = "hello";
        s2.rollNo = 3;
        s2.college = "JNCT";
    }
}
