class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < operations.length - 1; i++) {
            if (operations[i].charAt(0) == '+') {
                int a = s.pop();
                int b = s.peek();
                s.push(a);
                s.push(a + b);
            } else if (operations[i].charAt(0) == 'D') {
                int o = s.peek();
                s.push(2 * o);
            }
            else if ((i < operations.length) && (operations[i].charAt(0) == 'C')) {
                s.pop();
            } else {
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int i = operations.length - 1;
        if (operations[i].charAt(0) == '+') {
            int a = s.pop();
            int b = s.peek();
            s.push(a);
            s.push(a + b);
        } else if (operations[i].charAt(0) == 'D') {
            int o = s.peek();
            s.push(2 * o);
        } else if (operations[i].charAt(0) == 'C') {
            s.pop();
        } else {
            s.push(Integer.parseInt(operations[i]));
        }
        int sum = 0;
        while (!s.empty()) {
            sum = sum + s.pop();
        }
        return sum;
    }
}