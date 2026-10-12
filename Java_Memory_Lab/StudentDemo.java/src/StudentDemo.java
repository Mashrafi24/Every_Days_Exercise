public class StudentDemo {

    public static void main(String[] args) {

        // Creating object in Heap memory
        Student student = new Student(20);

        System.out.println("Student Object Created");

        // Object identity
        System.out.println(
                "Object Identity Hash Code: "
                        + System.identityHashCode(student)
        );

        // Calling method
        student.display();
    }
}


class Student {

    // Instance variable
    // Stored inside Heap with object
    int age;


    // Constructor
    Student(int age) {
        this.age = age;
    }


    void display() {

        // Local variable
        // Stored in Stack frame
        int marks = 85;


        System.out.println(
                "Instance Variable (age): "
                        + age
        );


        System.out.println(
                "Local Variable (marks): "
                        + marks
        );
    }
}