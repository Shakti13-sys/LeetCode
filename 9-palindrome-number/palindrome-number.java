class Solution {
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int n = x;
        int rev = 0;
        while (x!=0) {
            int digit = x%10;
            rev = rev*10+digit;
            x /= 10;
        }
        return n == rev;
    }
    public static void main(System[] args){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(isPalindrome(x));
    }
}