# When to Stack and When to Heap, Confusing!!
Date:11-10-2026

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
