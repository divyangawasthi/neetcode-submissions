class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, res, new ArrayList<>(), nums);
        return res;
    }

    public void dfs(int i, List<List<Integer>> res, List<Integer> subset, int[] nums){
        if(i == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        dfs(i + 1, res, subset, nums);
        subset.remove(subset.size() - 1);
        dfs(i + 1, res, subset, nums);
    }
}
