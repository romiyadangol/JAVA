import java.io.*;

//Build a program that reads a file containing serialized Java objects and deserializes
//them to recreate the original objects.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("Animal.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Animal animal = new Animal();
        objectOutputStream.writeObject(animal);

        FileInputStream fileInputStream = new FileInputStream("Animal.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Animal person1 = (Animal) objectInputStream.readObject();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        }
    }
