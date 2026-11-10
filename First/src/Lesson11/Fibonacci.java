package Lesson11;

class Fibonacci {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        int previous = 0; // F(0)
        int current = 1;  // F(1)

        for (int i = 2; i <= n; i++) {
            int next = previous + current; // F(i) = F(i - 2) + F(i - 1)
            previous = current;             // Shift forward: old F(i - 1)
            current = next;                 // Store F(i)
        }

        return current;
    }
}
