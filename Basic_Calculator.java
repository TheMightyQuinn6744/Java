public class Calculator{

    public Calculator(){
    //add method which adds two integers 
    public double add(int a, int b){
      return a + b;
    }
    //subtract method which subtracts two integers
    public double subtract(int a, int b){
      return a - b;
    }
    //multiply method which multiplies two integers
    public double multiply(int a, int b){
      return a * b;
    }
    //divide method which divides two integers
    public double divide(int a, int b){
      return a / b;
    }
    //modulo method which returns mod value of two integers
    public double modulo(int a, int b){
      return a % b;
    }

    public static void main(String[] args){
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5,7));
      System.out.println(myCalculator.subtract(45,11));
    }
  }
