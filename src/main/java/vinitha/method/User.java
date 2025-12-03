package vinitha.method;

public class User {

    public String userFullName(String firstName, String lastName){
        String fullName = firstName + " " + lastName;

        return fullName;
    }

    public static void main(String[] args) {


        User result = new User();

        System.out.println(result.userFullName("John", "Snow"));
    }


}
