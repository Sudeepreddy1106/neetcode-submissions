class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> a = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            boolean valid = true;
            while (!a.isEmpty() && a.peek() > 0 && asteroids[i] < 0) {
                if (Math.abs(asteroids[i]) > a.peek()) {
                    a.pop();
                } else if (Math.abs(asteroids[i]) == a.peek()) {
                    a.pop();
                    valid=false;
                    break;
                } else {
                    valid = false;
                    break;
                }
            }
            if (valid)
                a.push(asteroids[i]);
        }
        int[] ans = new int[a.size()];

        for (int i = 0; i < a.size(); i++) {
            ans[i] = a.get(i);
        }

        return ans;
    }
}