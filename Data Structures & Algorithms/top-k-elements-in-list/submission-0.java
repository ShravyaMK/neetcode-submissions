class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int i=0;i<nums.length;i++)
     {
        int num=nums[i];
        int current=map.getOrDefault(num,0);
        map.put(num,current+1);
     }   
     List<Integer>[]buckets=new List[nums.length+1];
     for(int i=0;i<buckets.length;i++)
     {
        buckets[i]=new ArrayList<>();
     }
     for(Map.Entry<Integer,Integer>entry:map.entrySet())
     {
        int number=entry.getKey();
        int count=entry.getValue();
        buckets[count].add(number);
     }
     List<Integer>result=new ArrayList<>();
     for(int i=buckets.length-1;i>=0&& result.size()<k;i--)
     {
        for(int num:buckets[i])
        {
            result.add(num);
        }
     }
        int[]answer=new int[result.size()];
        for(int j=0;j<result.size();j++)
        {
            answer[j]=result.get(j);
        }
         return answer;
        }
       
    
}
