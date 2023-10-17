package com.oops.set2;

//Summary:
    // 1.  One public class per file



//ONE PUBLIC CLASS PER FILE
//When a java file is imported in Java, we expect a single java class to be imported, and thus there can only be a single public class in a file,
//and by standards the one public class should have same name as file
//------FOLLOWING CODE WILL GIVE ERROR-----
//  public class publicClassWithANameThatDoesntMatchFileName{ }
//-----------------------------------------


public class T1_PackageAndStatic {
    static int num = 10;

    static{
        num += 10;
        System.out.println(num);
    }

    public static void main(String[] args) {
        //T1_PackageAndStatic testClass = new T1_PackageAndStatic();
        System.out.println("Testing only statics");

        TestStaticBlock.testStaticMethod();
    }
}

class TestStaticBlock{
    static int num = 10;

    static{
        num += 10;
        System.out.println("Inside StaticBlock test class: " + num);
    }

    static void testStaticMethod(){
        System.out.println("Inside Static test method");
    }
}