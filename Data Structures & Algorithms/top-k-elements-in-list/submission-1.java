class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            Map.Entry.comparingByValue(Comparator.reverseOrder()));
        pq.addAll(map.entrySet());

        
        ArrayList<Integer> sortedKeys = new ArrayList<>();

        int count = k;
        while (!pq.isEmpty() && count > 0) {
            sortedKeys.add(pq.poll().getKey());
            count--;
        }
        return sortedKeys.stream().mapToInt(Integer::intValue).toArray();
    }
}
