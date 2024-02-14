public class ExtendedCalci {
    /**
     * The function "squ" takes a float number as input and returns the square of that number.
     * 
     * @param num1 The parameter "num1" is a float type variable that represents the number for which
     * you want to calculate the square.
     * @return the square of the input number.
     */
    public float squ(float num1){
        float square=num1*num1;
        return square;
        
    }
    /**
     * The function "cube" takes a float number as input and returns the cube of that number.
     * 
     * @param num1 The parameter "num1" is a float type variable that represents the number for which
     * you want to calculate the cube.
     * @return The cube of the input number.
     */
    public float cube(float num1){
        float cuberoot=num1*num1*num1;
        return cuberoot;
    }
 /**
  * The function calculates the modulo of two floating-point numbers.
  * 
  * @param num1 The first number for which you want to calculate the modulo.
  * @param num2 The second number (divisor) in the modulo operation.
  * @return the result of the modulo operation between num1 and num2.
  */
  
    public float modulo(float num1,float num2){
        float result=num1%num2;
        return result;
    }
  /**
   * The function calculates the area of a triangle given the base and height.
   * 
   * @param num1 The first parameter, num1, represents the base of the triangle.
   * @param num2 The parameter "num2" represents the height of the triangle.
   * @return the area of a triangle.
   */
    public float Areaoftriangle(float num1,float num2){
        float area = (float) (0.5 * num1 * num2);
        return area;
    }

}