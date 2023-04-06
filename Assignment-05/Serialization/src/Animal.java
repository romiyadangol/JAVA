import java.io.Serializable;

public class Animal implements Serializable {
    int age = 5;
    String name = "Dog";

    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }

}