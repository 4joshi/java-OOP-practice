package com.oops.set1;

//Summary:
//    - Primitive Datatypes are stored in Stack memory
//    - Wrapper classes are available for Primitive datatypes, and thus primitive datatypes can be represented as Objects
//    - There is no pass by reference in java for primitive datatypes, although internally objects are passed as reference, as object variable is a reference variable
//    - Primitive datatype in stack then primitive datatype's array in heap how?  --    int[] numArray = new int[5];
//    - Final keyword with primitive datatype, and objects, and objects of wrapper classes


class SampleClass{
    int val;
}

public class T2_PrimitiveDatatypesAndWrapperClassesAndFinal {
    public static void main(String[] args) {
        int num1 = 5; //Primitive Datatypes - stored in stack memory
        SampleClass sampleObject1 = new SampleClass(); //Objects - stored in heap memory

        //There are wrapper classes for Primitive datatypes, like:
            //Integer for int
            //Add more...
        Integer num2 = 15; //Stored in heap memory as it is an object

        //Primitive datatype in stack then primitive datatype's array in heap how?
        int[] numArray = new int[5];
        for(int i=0; i<5; i++){
            System.out.println(numArray[i]);
        }

        //final keyword
        //When final is used with primitive type variable, it becomes immutable
        final int NUM3 = 16; //By convention, name final variables with uppercase letters
        //NUM3 = 17;  -- Gives error as num3 is final i.e. immutable

        //When using with final, the object reference cannot change but instance variables of object can change
        final SampleClass sampleObject2 = new SampleClass();
        //sampleObject2 = new SampleClass();  --  Gives error as sampleObject2 is of type final
        sampleObject2.val = 144;// This is allowed as we're just updating the values inside the fixed object

        final Integer num4 = 34;
        //num4 = 45;  --  Gives error, although we're changing the value of a object instance variable here but Integer is a final class and thus its object is immutable in all senses.
    }
}
