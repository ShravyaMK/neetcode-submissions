class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxpile=piles[0];
        for(int i=1; i<piles.length;i++)
        {
            if(piles[i]>maxpile)
            {
                maxpile=piles[i];
            }
        }
            int left=1,right=maxpile;
            while(left<=right)
            {
                int mid = left+(right-left)/2;
            long totalHours=0;
            for(int i=0;i<piles.length;i++)
            {
                int hours = (piles[i]+mid-1)/mid;
                totalHours+=hours;
            }
            if(totalHours <=h)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
            }
        return left;
    }
}
