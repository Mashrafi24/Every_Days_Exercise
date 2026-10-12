# When to Stack and When to Heap, Confusing!!
Date:11-10-2026


Stack memory stores method execution frames and local variables, while Heap memory stores objects and their instance data.

# Problem 1: Demonstrate Stack and Heap Memory in Java

### Memory Concept

    STACK MEMORY
    -------------
    main()
     |
     student reference
     |
    display()
     |
     marks = 85
    
    
    
    HEAP MEMORY
    -------------
    Student Object
    
    age = 20

  
  ### Explanation:
    - student → Stack এ reference
    - Student object → Heap এ তৈরি হয়
    - age → Object-এর সাথে Heap এ থাকে
    - marks → display() method-এর Stack frame এ থাকে

  
  # Problem 2: Stack Frames, Heap Objects, and Inner Classes
 
   ### Memory Explanation

    HEAP MEMORY

    Employee Object
    
    salary = 30000

    display() method
    When:
    emp.display();
    
       runs:
    Stack frame তৈরি হয়:


    STACK
    
    display()
    
    salary reference
    bonus = 5000

    Enter salary: 30000
    Enter bonus: 5000
    
    Employee Object Created
    Employee Identity Hash Code: 12345678
    
    Inside display() Method:
    Salary (Instance Variable): 30000
    Bonus (Local Variable): 5000
    
    Report Object Created
    Report Identity Hash Code: 87654321
    Report: Employee salary is 30000

   
    Employee employee = new Employee(salary);
        │                  │
        │                  └── Employee object → Heap
        │
        └── reference → Stack

Memory Concept:
Employee object -> Heap
Report object -> Heap
salary -> Instance field
bonus -> Local variable/value in display()
show() -> Executes in its own method frame

    Heap
    ┌────────────────────┐
    │ Employee Object    │
    │                    │
    │ salary = 30000     │
    └────────────────────┘

    Heap
    ┌────────────────────┐
    │ Employee Object    │
    │                    │
    │ salary = 30000     │
    └────────────────────┘

  Report Object
    
    Report report = new Report();

    HEAP

    Report Object


  ## Stack and Heap Memory Concept

### Heap Memory
    - Objects are created in Heap memory.
    - Instance variables are stored with objects.
    - Heap objects remain until garbage collection.

Example:

    Student student = new Student();

Student object -> Heap


### Stack Memory
    - Method calls create stack frames.
    - Local variables are stored inside stack frames.
    - Each method has its own stack frame.

Example:

void display(){

    int marks = 85;

}

marks -> Stack


### Identity Hash Code

    System.identityHashCode(object)
    
    returns a unique identity value for an object.
    
    It is not the actual memory address.

### Q: Why is Heap Memory mainly used in Java?

    Answer: Heap memory is mainly used for dynamic memory allocation of objects and their instance data. It allows objects to remain available beyond the method that created them, as long as they are reachable. The JVM manages heap memory and reclaims memory occupied by eligible objects through garbage collection.
    মনে রাখবে: Stack = method execution, Heap = objects and instance data। এটা Java memory management বোঝার সবচেয়ে সহজ conceptual rule.

### Q. Why is Heap important?
    
    1. Dynamic memory allocation: প্রোগ্রাম চলার সময় new ব্যবহার করে object তৈরি করা যায়।
    2. Objects can outlive a method: কোনো method শেষ হলেও তার তৈরি করা object অন্য কোনো reachable reference-এর মাধ্যমে ব্যবহার করা যেতে পারে।
    3. Shared access: একই object-এর reference একাধিক method বা thread ব্যবহার করতে পারে।
    4. Garbage Collection: কোনো object আর reachable না থাকলে JVM তার memory garbage collection-এর মাধ্যমে reclaim করতে পারে।
