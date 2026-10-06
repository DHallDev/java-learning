# For Loops

A **for loop** is a control-flow statement used to repeat a block of code a specific number of times.

## Rules & Mechanics
- Designed for **counted iteration**
- 
- Contains three parts:
  - **initialization** &rarr; sets the state, initializes a loop variable before the loop runs
  - **condition** &rarr; checked before each iteration, once false the loop ends
  - **update** &rarr; runs after each iteration, updates the loop variable so that it can reach the end state set by the condition
- Variables declared inside the loop header are only seen by the loop: **loop-local scope**
- Loops continues while the **condition** is true
- Commonly used for:
  - indexing arrays
  - repeating logic a fixed number of times
  - iterating with counters

## Why Is This Important

- Automate repetitive tasks
- Iterate through arrays and collections
- Control execution with precise counters
- Reduce code duplication
- Make iteration predictable and structured

Without loops, repeated logic would require manually writing the same code multiple times.

## Structure

### Basic Structure

    for (initialization; condition; update) {
        // code to repeat
    }

### Example

    for (int i = 0; i < 5; i++) {
        System.out.println("Count: " + i);
    }

    Count: 0
    Count: 1
    Count: 2
    Count: 3
    Count: 4

## Common Mistakes

- Forgetting to update the loop variable (can cause an infinite loop)
- Declaring the loop variable outside  when it should be scoped inside
- Writing a condition that never becomes false
- Modifying the loop counter inside the loop body

## Summary

For loops provide a clean, structured way to repeat code a specific numbers of times. They are ideal for counted iteration, array traversal, and 
predictable repetition.

## Side-note:

- The loop variable is known as the **iteration variable** so most name it `i` during the initialization portion of the loop.