public class Day10_SmallestLetter {

    public static void main(String[] args){
        char[] letters = {'c','f','j'};
        char target = 'f';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);//Output:j
    }
    static char nextGreatestLetter(char[] letters,char target){
        int start = 0;
        int end = letters.length- 1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (target<letters[mid]){
                end = mid-1;
            }else {
                start= mid+1;
            }
        }
        //% se warp around handle ho jayega
        // agar start == length ho gya matlab 'j' se bhi bada target  hai, to wapas 'c' pe aa jao
        return letters[start%letters.length];

    }
}