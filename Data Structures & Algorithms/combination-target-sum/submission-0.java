class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solve(0, 0, res, nums, target, new ArrayList<>());
        return res;
    }

    public void solve(int i, int total, List<List<Integer>> res, int[] nums, 
    int target, List<Integer> curr){
        if(total == target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(total > target || i >= nums.length){
            return;
        }
        curr.add(nums[i]);
        solve(i, total + nums[i], res, nums, target, curr);
        curr.remove(curr.size() - 1);
        solve(i + 1, total, res, nums, target, curr);

    }
}
