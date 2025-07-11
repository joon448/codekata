class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(n%i != 1 && i<=1000000){
            i++;
        } 
        if (i > 1000000){
            return n;
        } else{
            return i;
        }
    }
}