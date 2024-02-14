//import java.util.Scanner;
public class Calculator{
    public float add(float num1, float num2){
      float addtion=num1+num2;
      return addtion;
    }
        
    /**
     * The function "sub" takes two float numbers as input and returns their subtraction as a float.
     * 
     * @param num1 The first number to be subtracted.
     * @param num2 The second number to be subtracted from the first number.
     * @return The method is returning the result of subtracting `num2` from `num1`.
     */
    public float sub(float num1, float num2){
        float substraction=num1-num2;
        return substraction;
    }
        
    /**
     * The function multi takes two float numbers as input and returns their multiplication as a float.
     * 
     * @param num1 The first number to be multiplied.
     * @param num2 The second number to be multiplied.
     * @return the result of multiplying `num1` and `num2`.
     */
    public float multi(float num1, float num2){
        float multiplication=num1*num2;
        return multiplication;
       
    }
        
    /**
     * The function div takes two float numbers as input and returns their division as a float.
     * 
     * @param num1 The first number to be divided.
     * @param num2 The second number to be divided by.
     * @return The division of num1 by num2 is being returned.
     */
    public float div(float num1, float num2){
        float division=num1/num2;
        return division;
        
    }

    
       // The code block `public static void main(String[] args)` is the main method of the program. It
       // is the entry point of the Java program and is automatically executed when the program is run.
        public static void main(String[] args) {
            System.out.print("Enter the 2 numbers:");
          //Scanner sc=new Scanner(System.in);
           // float num1=sc.nextFloat();
          //  float num2=sc.nextFloat();
            float num1=20;
            float num2=10;
            Calculator c=new Calculator();
            System.out.println("The Addtion of two numbers:"+c.add(num1, num2));
            System.out.println("The  substraction of two numbers:"+c.sub(num1, num2));
            System.out.println("The multiplication of two numbers:"+c.multi(num1, num2));
            System.out.println("The  division of two numbers:"+c.div(num1, num2));
           // sc.close();
        }
}
        
    
