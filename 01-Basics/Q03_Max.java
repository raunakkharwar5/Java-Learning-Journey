public class Q03_Max {
    public static void main(String[] args) {
        int[] num = {2, 34, 35, 56, 7};
        int max = num[0];
        for(int n : num) if(n > max) max = n;
        System.out.println("Max = " + max);
    }
}
