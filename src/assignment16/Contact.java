package assignment16;

/*
        QUESTION.5.-> Define a class Contact with instance variables name and mobile. Provide
                      setters and getters in the class. Create a class DetailContact as a
                       subclass of Contact to provide additional properties like email and da of birth.
                       Provide setters and getters in the class
 */
public class Contact {

    // instance variable
    private String name;
    private long mobile;

    //setters and getters
    public void setName(String name){
        this.name=name;
    }
    public void setMobile(long mobile){
        this.mobile=mobile;
    }
    public String getName(){
        return name;
    }
    public long getMobile(){
        return mobile;
    }

}
//subclass
class DetailContact extends Contact{
    // instance variables
    private String email;
    private String dateOfBirth;

    // setters and getters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
class TestContact{
    public static void main(String[] args) {
        DetailContact d1 = new DetailContact();
        d1.setName("Demo");
        d1.setMobile(1123456789);
        d1.setEmail("demo001@gmail.com");
        d1.setDateOfBirth("01-12-2005");

        System.out.println("----------Detail of Contact---------" + "\n" +
                "Name = " + d1.getName() + "\n" +
                "Mobile = " + d1.getMobile() + "\n" +
                "Email = " + d1.getMobile() + "\n" +
                "Data Of Birth = " + d1.getDateOfBirth()

                );
    }
}