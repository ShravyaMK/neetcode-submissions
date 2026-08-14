class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
         int longest=0;
        for(int i=0;i<nums.length;i++)
        {
           
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
             int num=nums[i];
            if(!set.contains(num-1))
            {
                int count=1;
            while(set.contains(num+1))
            {
                num=num+1;
                count++;
                }
            
                if(count>longest)
                {
                    longest=count;
                }
                
            }}


        return longest;
    }
}
