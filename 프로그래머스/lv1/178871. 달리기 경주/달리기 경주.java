import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> rank = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        
        for (String call : callings) {
            int i = rank.get(call);
            String overtaken = players[i - 1];
            
            players[i - 1] = call;
            players[i] = overtaken;
            
            rank.put(call, i - 1);
            rank.put(overtaken, i);
        }
        
        return players;
    }
}