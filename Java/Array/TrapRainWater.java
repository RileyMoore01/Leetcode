class Solution {
    public int trap(int[] height) {
        int result = 0, current = 0;
        Stack<Integer> stack = new Stack<Integer>();

        while (current < height.length) {
            while (!stack.empty() && height[current] > height[stack.peek()]) {
                int top = stack.peek();
                stack.pop();
                if (stack.empty())
                    break;
                int distance = current - stack.peek() - 1;
                int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
                result += distance * bounded_height;
            }
            stack.push(current++);
        }

        return result;
    }
}
