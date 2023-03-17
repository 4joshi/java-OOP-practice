package com.oops.set1;

//Summary:
//    - Default Constructor
//    - Parameterized constructor (Function & Constructor Overloading/ Polymorphism )
//    - This - 2 Use cases :
//                    - To refer to the current object in the object method calls - to remove ambiguity
//                    - To call constructor of the same class from another constructor
//    - Passing object as argument to constructor
//    - Array of custom class and its default instance values and how to give a new definition for an object in the array


//Simple Class with a few instance variables
class Student{
    int rollNo = 5; //default value for instance variable
    String name;

    //Default constructor overloaded
    Student(){
        //this is used to call the matching constructor here
        this("Common");
    }

    //Parameterized constructor with one argument
    Student(String name){
        //this is used to refer to current object here, as it removes the ambiguity since the argument and the instance variable are of the same name,
        // and thus this keyword helps in knowing that we're referring the current object's instance variable
        this.name = name;
    }

    //Parameterized constructor with more arguments
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    //Object as parameter to constructor
    Student(Student s1){
        this.rollNo = s1.rollNo;
        this.name = s1.name;
    }
}

public class T1_Constructor {
    public static void main(String[] args) {

        //Default constructor call
        Student student1 = new Student();
        System.out.println("Student 1 - " + student1.rollNo + ", " + student1.name);

        //Parameterized Constructor Call
        Student student2 = new Student(4, "Abhishek");
        System.out.println("Student 2 - " + student2.rollNo + ", " + student2.name);

        //Constructor as Object parameter call
        Student student3 = new Student(student1);
        System.out.println("Student 3 - " + student3.rollNo + ", " + student3.name);


        //Array of custom class and its default instance values and how to give a new definition for an object in the array
        //Space for student array is allocated, no individual object is instantiated yet
        Student[] students = new Student[2];
        System.out.println(students[0]); //NULL Object. It doesn't point to an object in memory yet, since not instantiated
        //System.out.println(students[0].rollNo);  - Will give error as object is null, so property doesn't exist

        //Declaration + Definition for array object
        students[0] = new Student(100,"Array Student");
        System.out.println("Array Student - " + students[0].rollNo + ", " + students[0].name);
    }
}

