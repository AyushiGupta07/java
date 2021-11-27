package ExceptionHandler;

public class InvalidCountryException extends RuntimeException{
    InvalidCountryException(String msg){
        super(msg);
    }
}
class UserRegistration {
    void registerUser(String userName, String countryName) {
        try {
            if (countryName.equals("India")) {
                System.out.println("User registration done successfully ");
            } else
                //throw keyword is used for manually creating object
                //because if user raises the exception it is his responsibility make the object of that exception.
                throw  new InvalidCountryException("User outside India cannot be registered");
        } catch (InvalidCountryException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        UserRegistration obj=new UserRegistration();
        obj.registerUser("Ayushi","India");
    }
    }