/*A Basic Calculator
In this project, you will use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:

Add two integers
Subtract two integers
Multiply two integers
Divide two integers
Apply the modulo operator on two integers*/

public class Calculator {
  
    public Calculator() {
  
    }
      public int add(int a, int b) {
        return a + b;
      }
      public int subtract(int a, int b) {
        return a - b;
      }
      public int multiply(int a, int b) {
        return a * b;
      }
      public int divide(int a, int b) {
        return a / b;
      }
      public int modulo(int a, int b) {
        return a % b;
      }
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5, 7));
      System.out.println(myCalculator.subtract(45, 11));
      System.out.println(myCalculator.multiply(11, 7));
      System.out.println(myCalculator.divide(45, 9));
      System.out.println(myCalculator.modulo(100, 27));
    }
  }