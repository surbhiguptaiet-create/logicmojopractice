# DSA Problems Solutions

## Progress
**Solved:** 4/145 problems  
**Last Updated:** May 24, 2026

## Solutions

| # | Problem | Difficulty | LeetCode | Solution | Date Solved | Notes |
|---|---------|-----------|----------|----------|-------------|-------|
| 283 | Move Zeroes | Easy | [Link](https://leetcode.com/problems/move-zeroes/) | [Code](https://raw.githubusercontent.com/surbhiguptaiet-create/logicmojopractice/main/solutions/Array/8-move-zeroes.java?raw=true) | May 22, 2026 | - |
| 238 | Product of Array Except Self | Medium | [Link](https://leetcode.com/problems/product-of-array-except-self/) | [Code](https://raw.githubusercontent.com/surbhiguptaiet-create/logicmojopractice/main/solutions/Array/4-product-of-array-except-self.java?raw=true) | May 23, 2026 | - |
| 1 | Two Sum | Easy | [Link](https://leetcode.com/problems/two-sum/) | [Code](https://raw.githubusercontent.com/surbhiguptaiet-create/logicmojopractice/main/solutions/Array/1-two-sum.java?raw=true) | May 24, 2026 | class Solution {
    public int[] twoSum(int[] numbers, int target) {        

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<numbers.length;i++)
        {
           if(map.containsKey(target-numbers[i]))
           {
            return new int[]{i,map.get(target-numbers[i])};
           }
           else
           {
            map.put(numbers[i],i);
           }
        }
 return new int[] {-1, -1};
     
     }
      
     
     }
 |
| 268 | Missing Number | Easy | [Link](https://leetcode.com/problems/missing-number/) | [Code](https://raw.githubusercontent.com/surbhiguptaiet-create/logicmojopractice/main/solutions/Array/10-missing-number.java?raw=true) | May 24, 2026 | using xor and with sum we can do |
