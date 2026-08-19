class Solution {
    public int characterReplacement(String s, int k) {
        //no using hashSet because we are using count array to count.
        int[] count=new int[26];
        int left=0;
        int maxCount=0; //highest frequency
        int result=0;
        for(int i=0;i<s.length();i++)
        {
         count[s.charAt(i)-'A']++;
         //clever way of saying "which letter is this, numbered from 0 to 25?" — and that number becomes the index we use in count[].
         maxCount=Math.max(maxCount,count[s.charAt(i)-'A']);
         if(i-left+1-maxCount>k)
         {
            count[s.charAt(left)-'A']--;
            left++;
         }
         result=Math.max(result,i-left+1);
        }
        return result;
    }
}
