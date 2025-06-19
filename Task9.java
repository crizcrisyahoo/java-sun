import static java.lang.Math.*;

public class Task9{
    public static void main(String[] args) {
        MathMethod mm = new MathMethod();
        
        int z = addExact(2, 4);
        int y = subtractExact(8, 5);
        int x = multiplyExact(5, 3);
        int w = floorDiv(10, 2);

        System.out.println("addition: " + z + "\n" +
                            "subtraction: " + y + "\n" +
                            "multiplication: " + x + "\n" +
                            "division: " + w + "\n");
    }    
}

class MathMethod{
    public static int add(int a, int b) {
        addExact(a, b);
    }

    public static int subtract(int a, int b) {
        subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        floorDiv(a, b);
    }
}