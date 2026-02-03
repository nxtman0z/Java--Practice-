public class Test {

    static void divide() throws ArithmeticException {
        int a = 10 / 0;   // exception yahin aayega
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Program run ho gaya, exception handle ho gaya");
        }
    }
}
