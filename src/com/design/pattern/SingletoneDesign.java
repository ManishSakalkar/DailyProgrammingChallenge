package com.design.pattern;

public class SingletoneDesign {
    //Lazy Way of creating singletone class

//    private static SingletoneDesign obj;
//
//    public static SingletoneDesign getInstance(){
//        if(obj == null){
//            System.out.println("Object is Created");
//            obj = new SingletoneDesign();
//        }
//        return obj;
//    }


    //Eager Way of creating singletone class
//    private static SingletoneDesign obj = new SingletoneDesign();
//
//    public static SingletoneDesign getInstance(){
//        return obj;
//    }


    //For Multithread Environment we use synchronized block for creting singletone object.
    private static SingletoneDesign obj;

    public static SingletoneDesign getInstance(){
        if(obj == null){
            synchronized (SingletoneDesign.class){
                if(obj==null){
                    System.out.println("New Syncronized Object is Created");
                    obj= new SingletoneDesign();
                }
            }
        }
        return obj;
    }
}
