package ExceptionHandler;

public class Person {
    public String name;
    public int age;

    public void display(String name,int age) {
        try {
            if (age > 18 && age < 60) {
                System.out.println("Name of a person is  "+name+ " and his age is " +age);
            } else {
                throw new PersonAgeException("Argument passes are not proper");
            }
        } catch (PersonAgeException pae) {
            System.out.println(pae);
        }
    }

    public static void main(String[] args) {
        Person p=new Person();
        p.name="Ayushi";
        p.age=19;
        p.display(p.name, p.age);

    }
}


class PersonAgeException extends Exception {
    public PersonAgeException(String  msg ){
        super(msg);
    }
}
