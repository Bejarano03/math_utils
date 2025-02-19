/**
 * This main class is outputting
 * the functionality behind each
 * static method in MathUtils package.
 *
 * @author Marco Bejarano
 * @version 2/18/2025
 */

package MathUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to MathUtils!");
        System.out.println();
        System.out.println("Addition:" + MathUtils.Add(3, 5));
        System.out.println("Subtraction: " + MathUtils.Subtract(3, 5));
        System.out.println("Multiplication: " + MathUtils.Multiply(3, 5));
        System.out.println("Division: " + MathUtils.Divide(3, 5));
    }
}
