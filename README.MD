## Question: Regex Pattern Validation (PatternMatch.java)

Using regular expressions (regex), we can easily match or search for patterns in text. Before searching for a pattern, we must specify one using a well-defined syntax.

Refer to the implementation in the [`PatternMatch.java`](PatternMatch.java) file.

### Input Format

- The first line of input contains an integer, denoting the number of test cases.
- The next lines each contain a string of any printable characters representing the regex pattern.

### Output Format

- For each test case, print `Valid` if the syntax of the given pattern is correct.
- Otherwise, print `Invalid`.

_Do not print the quotes in the output._

## Alice and Bob Score Comparison (AliceBobScore.java)

This Java program compares the scores of Alice and Bob in three categories and determines who has the higher score in each category.

### Problem Description

- Alice and Bob each have three scores.
- For each category, compare Alice's and Bob's scores:
  - If Alice's score is higher, she gets 1 point.
  - If Bob's score is higher, he gets 1 point.
  - If their scores are equal, neither gets a point.
- Output the total points for Alice and Bob.

### How to Use

1. **Input:**

   - Enter 3 integers for Alice's scores (space-separated or line-separated).
   - Enter 3 integers for Bob's scores (space-separated or line-separated).

2. **Output:**
   - The program prints two integers: Alice's total points and Bob's total points.

### Example

**Input:**

```
5 6 7
3 6 10
```

**Output:**

```
1 1
```

- Alice wins the first category, Bob wins the third, and the second is a tie.
