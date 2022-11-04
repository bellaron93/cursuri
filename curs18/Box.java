package curs18;

public class Box<T,A,S> {
     public T camp1;
     public A camp2;

     public S getInfo(S info){
         return info;
     }

     public static <Z> String toString(Z info){
         return info.toString();
     }
}
