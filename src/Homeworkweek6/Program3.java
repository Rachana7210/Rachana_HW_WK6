package Homeworkweek6;

public class Program3 {
    int a = 10;

    static int b = 20;

    public static void main(String[] args){
     Program3 obj = new Program3();
     System.out.println(obj.a);
     System.out.println(obj.b);
     pen();
     obj.myMethod();
    }
public void myMethod() {
    System.out.println(a);
}
      public static void pen(){
       System.out.println(Program3.b);

    }
}