class Solution {
    public int solution(int a, int b) {
        String string1 = String.format("%d%d", a, b);
        String string2 = String.format("%d%d", b, a);
        
        int int1 = Integer.parseInt(string1);
        int int2 = Integer.parseInt(string2);
        
        return (int1 > int2) ? int1 : int2;
    }
}