public class Day10_Floor {
    public static void main(String[] args){
        int[] arr = {2,3,8,9,14,16,18};
        int target = 15;
        int ans = floor(arr,target);
        System.out.println(ans);//Output: 14
    }
    static int floor(int[] arr, int target){
        // agar target sabse chote element se bhi chota hai to floor exist nhi krega
        if(target<arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (target==arr[mid]){
                return arr[mid];//exact mil gya to vhi floor hai

            }
            if (target<arr[mid]){
                end= mid-1;
            }else {
                start= mid+1;
            }
        }
        //loop khtm hone pe end floor pe hota hai
        return arr[end];
    }
}