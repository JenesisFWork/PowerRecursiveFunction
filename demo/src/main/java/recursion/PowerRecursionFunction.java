/* A program that uses recursive function (x^n).

    Programmer: Jenesis Fabia
    Class: Data Structures
    Date: April 28, 2022

    Inspired from a Youtube video (link below):
    https://www.youtube.com/watch?v=sE0sH8vSmE4
*/


package recursion;

public class PowerRecursionFunction {
    
    public static void main (String [] args) {
        sayHelloWorld(1);
    }

    public static void sayHelloWorld(int n) {
       if(n == 0) {
           System.out.println("Goodbye World!");
       }
       else {
           System.out.println("Hello World!");
           n--;
           sayHelloWorld(n);
       }
    }
    //Needs base case
}
