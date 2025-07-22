import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length==1){
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(a->a>min).toArray();
        
    }
}