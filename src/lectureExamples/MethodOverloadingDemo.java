package lectureExamples;

public class MethodOverloadingDemo {


    public void showMyInfo(String name){
        System.out.println("My name is " + name);

    }
    public void showMyInfo(int age){
        System.out.println("My age is " + age);
    }
    public void showMyInfo(String name, int age, String course){
        System.out.println("**************My full information ********** "+ "\n" +
                "My name is " + name +"\n" +
                "My age is " + age + "\n" +
                "My course " + course

                );
    }


}
class FIndMyInfo{
    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();
        demo.showMyInfo("Demo Bhai");
        demo.showMyInfo(21);
        demo.showMyInfo("Cool Bhai" , 22, "BCA");
    }
}