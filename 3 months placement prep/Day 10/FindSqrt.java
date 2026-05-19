class Solution {
    public int mySqrt(int x) {
        long sqrt = 0;
        int left = 1, right = x;
        while(left <= right) {
            long mid = left + (right - left) / 2;
            if( mid * mid <= x) {
                sqrt = mid;
                left = (int)mid + 1;
            }else{
                right = (int)mid - 1;
            }
        }

        return (int)sqrt;
    }
}