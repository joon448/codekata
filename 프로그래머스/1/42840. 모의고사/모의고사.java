import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = new int[]{1,2,3,4,5,1,2,3,4,5};
        int[] student2 = new int[]{2,1,2,3,2,4,2,5};
        int[] student3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[]{0,0,0};
        for(int i = 0; i < answers.length; i++){
            if(student1[i%10]==answers[i]){
                count[0]++;
            }
            if(student2[i%8]==answers[i]){
                count[1]++;
            }
            if(student3[i%10]==answers[i]){
                count[2]++;
            }
        }
        
        int max = Arrays.stream(count).max().getAsInt();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if (count[i] == max){
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}