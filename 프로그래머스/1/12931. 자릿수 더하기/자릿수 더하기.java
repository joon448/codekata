import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = n;
        while (tmp != 0){
            answer += (tmp%10);
            tmp/=10;
        }
        return answer;
    }
}