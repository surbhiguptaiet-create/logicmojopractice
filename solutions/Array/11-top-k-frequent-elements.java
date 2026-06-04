
// first store in hashmap
// apply sorting onto values

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
        int n=nums.length;

        for(int c:nums){
        if(hashmap.containsKey(c)){
            hashmap.put(c,hashmap.get(c)+1);
        } 
        else
        {
            hashmap.put(c,1);
        }

        }

         List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(hashmap.entrySet());

        // Sort by frequency (highest first)
        list.sort((a, b) -> b.getValue() - a.getValue());
        int[] result = new int[k];
        for(int i=0;i<k;i++)
        {

            result[i]=list.get(i).getKey();
        }
    return result;
    }
}