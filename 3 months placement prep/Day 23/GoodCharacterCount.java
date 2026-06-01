class Solution {
     private static final long MOD = 1_000_000_007L;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;

        long count =  (pow(5, even) * pow(4, odd))% MOD;

        return (int)count; 

    }

    public long pow(long x, long n) { 
        if(n == 0) return 1;
        if(n == 1) return x % MOD;

        long half = pow(x, n/2);

        if(n%2 == 0) return (half * half)% MOD;
        else return (x % MOD) * (half * half)%MOD;
    }
}