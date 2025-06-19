public class Task8{ 
    public static void sum(int... numbers) {
        int total = 0;
        for (int x : numbers){
            System.out.print(x + " + ");
            total += x;
        }
        System.out.println( " = "+ total);
    }
    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5, 6, 7);
    }
}
 