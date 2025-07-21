import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(a->(a%divisor==0)).sorted().toArray();
        if (answer.length == 0){
            return new int[]{-1};
        }
        return answer;
    }
}