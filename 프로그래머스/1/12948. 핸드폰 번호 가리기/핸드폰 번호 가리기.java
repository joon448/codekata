class Solution {
    public String solution(String phone_number) {
        char[] arr = phone_number.toCharArray();
        for(int i=0;i<arr.length-4;i++){
            arr[i] = '*';
        }
        StringBuilder sb = new StringBuilder();
        sb.append(arr);
        return sb.toString();
    }
}