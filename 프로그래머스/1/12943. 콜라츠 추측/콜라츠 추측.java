class Solution {
    public int solution(int num) {
        long n = num;
        int answer = 0;
        while (answer < 500){
            if (n == 1){
                return answer;
            }
            if (n % 2 == 0){
                n /= 2;
            }
            else{
                n *= 3;
                n ++;
            }
            answer++;
        }
        return -1;
    }
}