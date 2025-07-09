import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);

        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }

        return sb.toString();
    }
}