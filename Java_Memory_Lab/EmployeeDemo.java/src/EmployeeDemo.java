public class EmployeeDemo {


    public static void main(String[] args) {


        Employee emp =
                new Employee(30000);


        System.out.println(
                "Employee Object Created"
        );


        System.out.println(
                "Employee Identity Hash Code: "
                        + System.identityHashCode(emp)
        );


        emp.display();

    }
}



class Employee {


    // Instance variable
    int salary;



    Employee(int salary) {

        this.salary = salary;

    }



    void display() {


        // Local variable
        int bonus = 5000;



        System.out.println(
                "\nInside display() Method:"
        );


        System.out.println(
                "Salary (Instance Variable): "
                        + salary
        );


        System.out.println(
                "Bonus (Local Variable): "
                        + bonus
        );



        // Local Inner Class

        class Report {


            void show() {


                System.out.println(
                        "Report: Employee salary is "
                                + salary
                );

            }

        }



        // Creating Report object
        Report report = new Report();



        System.out.println(
                "\nReport Object Created"
        );


        System.out.println(
                "Report Identity Hash Code: "
                        + System.identityHashCode(report)
        );


        report.show();

    }

}