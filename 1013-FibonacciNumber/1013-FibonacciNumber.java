// Last updated: 14/07/2026, 14:13:12
class Solution {
    public int fib(int n) {
         if (n<=1) return n;
        int x=0;
        int y=1;
        int z=0;
        for(int i=2;i<=n;i++){
            z=x+  y;
            x=y;
            y=z;
        }
        return z;
    }
}