class Solution {
    public String solution(int n) {
        String answer = "수박수박".repeat(n/4);
        answer += "수박수박".substring(0, n%4);
        return answer;
    }
}