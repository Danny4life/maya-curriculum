package christian.exception;

public class RegistrationService {

    public void registerUser(int age) throws InvalidAgeException {


        if(age < 18){
            throw new InvalidAgeException("You are too young to register and vote!!");
        }


    }
}
