package vinitha.method;

public class MethodEx {




    // Custom method, it belongs to us, we can change it as we want

    // public is an access modifier -- meaning it can be access from anywhere or any  class
    // int is the return data  type -- meaning this method must return a number
    // parameters or arguements
    // When we call a method it means we want that method do an activity, or do something
    public int add(int a,int b){
        return a + b;
    }

    public String fullName(String firstName, String lastName){

        String fullName = firstName + " " + lastName;

        return fullName;

    }

    public boolean isValid(){
        return true;
    }

    private Long calculate(Long num1, Long num2){

        return num1 + num2;

    }


    // PSVM is an in-built Method coming from Java, meaning we are not the one creating it
    public static void main(String[] args) {


        MethodEx obj = new MethodEx();

        System.out.println(obj.fullName("John", "Doe"));


    }

}
