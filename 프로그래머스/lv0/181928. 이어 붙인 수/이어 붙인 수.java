class Solution {
    public int solution(int[] num_list) {
        
        StringBuilder oddSb  = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();

        
        for (int j = 0; j < num_list.length; j++) {
            if (num_list[j] % 2 != 0) {
                oddSb.append(num_list[j]);
            } else {
                evenSb.append(num_list[j]);
            }
        }

        
        int oddNum  = Integer.parseInt(oddSb. toString());
        int evenNum = Integer.parseInt(evenSb.toString());

        return oddNum + evenNum;
    }
}
