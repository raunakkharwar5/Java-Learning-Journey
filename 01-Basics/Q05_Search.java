public class Q05_Search {
    public static void main(String[] args) {
        int[] num = {2, 34, 35, 56, 7};
        int target = 35;
        for(int n : num) if(n==target){ System.out.println("Found 35"); return; }
        System.out.println("Not Found");
    }
}