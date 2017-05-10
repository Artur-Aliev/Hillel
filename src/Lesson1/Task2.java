package Lesson1;

public class Task2 {
    public static void main(String[] args) {
        int a = 51, b = 32, c = 42;
        int result;


        if (a<b && a<c && b<c) {
            System.out.println("result: "+a+" "+b+" "+c+"");
        } else {
            if (b<a && b<c && a<c) {
                System.out.println("result: "+b+" "+a+" "+c+"");
            }else if (a<b && a<c && b>c) {
                System.out.println("result: "+a+" "+c+" "+b+"");
            } else if (b<a && b<c && a>c) {
                System.out.println("result: "+b+" "+c+" "+a+"");
            } else if (c<a && c<b && b<a){
                System.out.println("result: "+c+" "+b+" "+a+"");
            } else  {
                System.out.println("result: "+c+" "+a+" "+b+"");

            }
        }
    }
}





