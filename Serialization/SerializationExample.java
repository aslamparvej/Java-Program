package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class SerializationExample {
    public static void main(String[] args) {

        try {
            Student s1 = new Student("Ashu", 206);

            FileOutputStream fos = new FileOutputStream("file.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);

            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("success");

        } catch(Exception e){
            System.out.println(e);
        }  
    }
}
