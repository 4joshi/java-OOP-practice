package com.oops.set2;

//Summary:
//    - Singleton Classes can have only 1 object
//    - To achieve that we need to make sure:
//            - It is not allowed to call the constructor directly to create an object - Make constructor private
//            - There is a way for other classes to get the single instance (or create if not present) - Static method that returns the instance

class Singleton{
    int value;

    private Singleton(int value){
        this.value = value;
    }

    private static Singleton instance = null;

    public static Singleton getInstance(int value){
        if(Singleton.instance == null){
            instance = new Singleton(value);
        }

        return Singleton.instance;
    }
}
public class T2_SingletonClass {
    public static void main(String[] args) {
        Singleton S1 = Singleton.getInstance(5);
        Singleton S2 = Singleton.getInstance(15);
        Singleton S3 = Singleton.getInstance(25);

        System.out.println("Value of S1 instance = " + S1.value);
        System.out.println("Value of S2 instance = " + S2.value);
        System.out.println("Value of S3 instance = " + S3.value);
    }
}
