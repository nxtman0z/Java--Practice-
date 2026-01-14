public class array {
    public static void main(String[] args) {
        int nums[] ={4,6,8,3};
        nums[1] = 8;
        System.out.println(nums[1]);

        //define array length
        int num[] =new int[4];
        num[0]=1;
        num[1]=7;
        num[2]=87;
        num[3]=9;
        for(int i =0;i<num.length;i++){
            System.out.println(num[i]);
        }

    }
}
