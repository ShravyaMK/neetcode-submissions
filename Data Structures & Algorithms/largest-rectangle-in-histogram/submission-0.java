class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack();
        int maxArea = 0;
        for(int i=0;i<=heights.length;i++)
        {
            int currentHeight;
            if(i == heights.length)
            {
                currentHeight = 0;
            }
            else
            {
                currentHeight = heights[i];
            }
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()])
            {
                int index = stack.pop();
                int height = heights[index];
                int width;
                if(stack.isEmpty())
                {
                    width = i;
                }
                else
                {
                    width = i-stack.peek()-1;
                }
                int area = height*width;
                maxArea = Math.max(maxArea,area);
            }
            if(i < heights.length)
            {
                stack.push(i);
            }
        }
        return maxArea;
    }
}
