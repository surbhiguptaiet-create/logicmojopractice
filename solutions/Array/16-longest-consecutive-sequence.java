class Solution {
    public int longestConsecutive(int[] nums) {
     Set<Integer> consset=new HashSet<Integer>();
     int max=0;
     int count=0;
    // first convert array into set
     for(int num:nums){
     consset.add(num);
     }
//for every num check if we ahve num-1 so we dont need to repeat again anda gain like for 100,99 no need to twic 99 will cover
     for(int num:consset)
     {
        if(consset.contains(num-1))
        {
            continue;
        }
        int next=num+1;
        count=1;
        while(consset.contains(next))
        {
            count+=1;
            next=next+1;
        }
       max=Math.max(count,max);

     }
        return max;
    }
}