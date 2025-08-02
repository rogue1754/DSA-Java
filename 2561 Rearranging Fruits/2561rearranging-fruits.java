import java.util.*;

class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        HashMap<Integer, Integer> h2 = new HashMap<>();
        for (int e : basket1) {
            h1.put(e, h1.getOrDefault(e, 0) + 1);
        }
        for (int e : basket2) {
            h2.put(e, h2.getOrDefault(e, 0) + 1);
        }
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int e : h1.keySet()) {
            int a = h1.get(e);
            int b = h2.getOrDefault(e, 0);
            int diff = a - b;
            if (diff % 2 != 0)
                return -1;
            if (diff > 0) {
                for (int i = 0; i < diff / 2; i++)
                    temp1.add(e);
            } else if (diff < 0) {
                for (int i = 0; i < (-diff) / 2; i++)
                    temp2.add(e);
            }
        min = Math.min(e, min);
        }
        for (int e : h2.keySet()) {
            if (h1.containsKey(e))
                continue;
            int b = h2.get(e);
            if (b % 2 != 0)
                return -1;
            for (int i = 0; i < b / 2; i++)
                temp2.add(e);
            min = Math.min(e, min);
        }
        Collections.sort(temp1);
        Collections.sort(temp2, Collections.reverseOrder());
        if (temp1.size() != temp2.size())
            return -1;
        long cost = 0;
        for (int i = 0; i < temp1.size(); i++)
            cost += Math.min(Math.min(temp1.get(i), temp2.get(i)), min * 2);
        return cost;
    }
}