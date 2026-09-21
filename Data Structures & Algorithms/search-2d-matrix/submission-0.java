class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top=0; int bottom=rows-1;
        int correctRow=-1;
        while(top<=bottom)
        {
            int mid = top+(bottom-top)/2;
            if(target>=matrix[mid][0]&&target<=matrix[mid][cols-1])
            {
                correctRow=mid;
                break;
            }
            else if(target<matrix[mid][0])
            {
                bottom=mid-1;
            }
            else
            {
                top=mid+1;
            }
        }
        if(correctRow==-1)
        {
            return false;
        }
        int left=0;
        int right=cols-1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(matrix[correctRow][mid] == target)
            {
                return true;
            }
            if(matrix[correctRow][mid] < target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
}
