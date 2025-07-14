class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        if(sqrt == (int) sqrt){
            return ((long)sqrt+1)*((long)sqrt+1);
        }else{
            return -1;
        }
    }
}