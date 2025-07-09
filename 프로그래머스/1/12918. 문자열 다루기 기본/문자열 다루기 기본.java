class Solution {
    public boolean solution(String s) {
        char[] arr = s.toCharArray();
        boolean answer = true;
        if (arr.length != 4 && arr.length != 6){
            answer = false;
        } else{
            for (char c:arr){
                if (c<'0' || c>'9'){
                    answer = false;
                }
            }
        }
        return answer;
    }
}