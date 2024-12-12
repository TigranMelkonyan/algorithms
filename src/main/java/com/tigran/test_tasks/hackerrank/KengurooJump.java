package com.tigran.test_tasks.hackerrank;

/**
 * Created by Tigran Melkonyan
 * Date: 12/12/24
 * Time: 12:22 PM
 */
public class KengurooJump {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // If the kangaroos have the same velocity
        if (v1 == v2) {
            // They will only meet if they start at the same position
            return (x1 == x2) ? "YES" : "NO";
        }

        // Check if the difference in positions is divisible by the difference in velocities
        if ((x2 - x1) % (v1 - v2) == 0 && (x2 - x1) / (v1 - v2) >= 0) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(0, 2, 5, 3));
    }
}

/* 
To solve the problem, we need to determine whether two kangaroos, starting at different positions and moving at different rates, will land on the same position at the same time after a certain number of jumps.

Problem Breakdown
You are given:

The starting position of the first kangaroo (x1).
The rate at which the first kangaroo moves (v1), i.e., the distance it covers in each jump.
The starting position of the second kangaroo (x2).
The rate at which the second kangaroo moves (v2).
The task is to check if, after some number of jumps, both kangaroos will land at the same position at the same time.

Key Concept
The positions of the kangaroos after n jumps can be described by the following equations:

Position of kangaroo 1 after n jumps: x1 + n * v1
Position of kangaroo 2 after n jumps: x2 + n * v2
We need to find out if there exists a non-negative integer n such that:

x1 + n * v1 = x2 + n * v2
This equation simplifies to:

n * (v1 - v2) = x2 - x1
This means that the difference in positions between the two kangaroos must be divisible by the difference in their jump speeds, i.e.,

(x2 - x1) % (v1 - v2) == 0
This is only valid if:

The velocities are not the same (v1 != v2), because if v1 == v2, then the kangaroos will only meet if they start at the same position (x1 == x2).
The difference in positions (x2 - x1) is divisible by the difference in velocities (v1 - v2). 

Let's break down that point step by step in simpler terms.

Step 1: The general formula
Each kangaroo's position after n jumps is given by the equation:

Kangaroo 1: x1 + n * v1
Kangaroo 2: x2 + n * v2
Here:

x1 and x2 are the starting positions of the kangaroos.
v1 and v2 are the distances each kangaroo moves per jump (their velocities).
n is the number of jumps.
We need to find out if there is some number of jumps n such that both kangaroos end up at the same position at the same time. That is, we want to know if there exists an n where:

Copy code
x1 + n * v1 = x2 + n * v2
Step 2: Rearranging the equation
If we subtract x2 + n * v2 from both sides, we get:

scss
Copy code
x1 - x2 = n * (v2 - v1)
Now, we have a simpler equation:

scss
Copy code
n = (x1 - x2) / (v2 - v1)
This tells us that for the kangaroos to meet after some number of jumps n, the difference in their starting positions (x1 - x2) must be divisible by the difference in their velocities (v2 - v1).

Step 3: Why must it be divisible?
For the kangaroos to meet, the difference in their starting positions (x1 - x2) should be exactly divisible by the difference in their velocities (v2 - v1). Why?

Because n must be a whole number. If (x1 - x2) is not perfectly divisible by (v2 - v1), then n would not be an integer, which means that the kangaroos would never land on the same spot at the same time.

Example 1:
Let’s take an example to illustrate:

x1 = 0, v1 = 3, x2 = 4, v2 = 2
We substitute into the formula:

scss
Copy code
n = (x1 - x2) / (v2 - v1)
n = (0 - 4) / (2 - 3)
n = (-4) / (-1)
n = 4
So, n = 4 is a valid number of jumps. This means after 4 jumps, both kangaroos will meet at the same position. In fact:

Kangaroo 1 will reach position 0 + 4 * 3 = 12.
Kangaroo 2 will reach position 4 + 4 * 2 = 12.
Thus, they meet at position 12 after 4 jumps.

Example 2:
Let’s look at a different example:

x1 = 0, v1 = 2, x2 = 5, v2 = 3
Substitute into the formula:

scss
Copy code
n = (x1 - x2) / (v2 - v1)
n = (0 - 5) / (3 - 2)
n = (-5) / (1)
n = -5
In this case, n = -5, which is negative. This doesn't make sense because the number of jumps can't be negative. 
In other words, the kangaroos will never meet at the same time if the value of n is negative.

Moreover, you can also think about this logically: Kangaroo 2 is moving faster (v2 = 3 vs. v1 = 2),
but it starts further ahead, so it will just keep getting further ahead. The two kangaroos will never land at
the same position at the same time.

Step 4: Conclusion
The condition that (x1 - x2) % (v2 - v1) == 0 ensures that the number of jumps n is 
an integer (i.e., divisible without any remainder), and the condition that n should be non-negative ensures
that the two kangaroos are moving in the right direction to meet each other.

In summary:

The difference in positions (x1 - x2) must be divisible by the difference in their velocities (v2 - v1) 
for them to meet.
The result of that division must be non-negative, meaning the kangaroo with the higher velocity must not 
be starting behind the other one in such a way that it will never catch up.
*/