public class EqualsExample {
    public static void main(String[] args) {
        String first = new String("hello");
        String second = new String("hello");

        // == checks if both references point to the same object in memory
        System.out.println("Using == : " + (first == second));

        // equals() checks if both objects have the same value/content
        System.out.println("Using equals(): " + first.equals(second));
    }
}
