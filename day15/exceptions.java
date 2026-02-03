

public class exceptions {
    public static void main(String[] args) {
        int i =0;
        int j =0;

        int nums[] = new int[5];

        try {
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your ");
        }
        System.out.println(j);
    }
}
