package com.alphadev.designpatterns;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        exampleSerialization();
        exampleReflection();
    }

    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
//        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
//        //Knowing only one constructor taking it using index
//        Constructor constructor = constructors[0];
//        constructor.setAccessible(true);
//        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();
//
//        System.out.println("Reflected hashcode singleton :"+lazySingleton.hashCode());
//        System.out.println("Singleton instance : "+instance.hashCode());

        //solution to go this for enum
        EnumSingleton.INSTANCE.doSomething();
    }


    private static void exampleSerialization() throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test"));
//        objectOutputStream.writeObject(lazySingleton);
//        objectOutputStream.close();
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test"));
//        LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
//        objectInputStream.close();
//
//        System.out.println("Object 1 : "+ lazySingleton.hashCode());
//        System.out.println("Object 2 : "+ deserializedLazy.hashCode());

        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test1.obj"));
        objectOutputStream.writeObject(serializableSingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test1.obj"));
        SerializableSingleton serializableSingleton1 = (SerializableSingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Object 1 : "+ serializableSingleton.hashCode());
        System.out.println("Object 2 : "+ serializableSingleton1.hashCode());
    }
}
