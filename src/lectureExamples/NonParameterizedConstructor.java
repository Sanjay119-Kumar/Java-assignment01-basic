package lectureExamples;

public class NonParameterizedConstructor {
    String name;
    int id;
    public NonParameterizedConstructor(){
        this.name="Kya Tum Non-Parameterized Constructor Ho HO";
        this.id=01;
    }
}
class TestNonParameterizedConstructor{
    public static void main(String[] args) {
        NonParameterizedConstructor s1 = new NonParameterizedConstructor();
        System.out.println("Student name : " + s1.name + "\n" + "Student id : " + s1.id);
    }
}