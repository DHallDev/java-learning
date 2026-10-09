# Loops
A loop is a control-flow structure  that repeats blocks of code while a condition is true or until a specifice endpoint is reached. There are **three main loop types**:
- **for loops** &rarr; repeats a certain number of times.
- **while loops** &rarr; repeat while a condition is true
- **do-while loops** &rarr; repeats at least once, then checks if condition is true

---

## Rules & Mechanics
- Loops repeat code automatically
- All loops rely on **boolean expressions**
- Loops must eventually reach an end condition
- Variables declared inside loop headers have **loop-local scope**
- Infinite loops happen when the condition never becomes false
- Each loop type has a different use-case, but all share the same idea: **repeat until done**

---

## Why Is This Important
Loops allow my program to:
- automate reptitive task
- process data efficiently
- react to changing conditions
- reduce code duplication
- build dynamic, flexible logic

Without loops, repeated logic would require manually writing the same code multiple times.

---

## Structure

### 1. For Loops
A **for loop** repeats code a specific number of times.

#### Rules & Mechanics
- Designed for **counted iteration**
- Has three parts:
  - **initialization** &rarr; sets the starting value
  - **condition** &rarr; checked before each iteration
  - **update** &rarr; runs after each iteration
- Loop continues while **condition** is true
- Used for:
  - indexing arrays
  - iterating with counters
  - repeating logic a fixed number of times

#### Basic Structure

    for (initialization; condition; update) {
        // code to repeat
    }

#### Example

    for (int i = 0; i < 5; i++) {
        System.out.println("Count: " + i);
    }

    Count: 0
    Count: 1
    Count: 2
    Count: 3
    Count: 4

### 2. While Loops
A **while loop** repeats **as long as** a condition is true.

#### Rules & Mechanics
- Condition is checked **before** the loops runs
- Loop may run **zero times** if the condition is false
- Best for situations where I **don't know** how  many times the loop will run
- Used for:
  - Waiting for user input
  - running until a state changes
  - game loops or continous checks

#### Basic Structure

    while (condition) {
        // code to repeat
    }

#### Example

    int health = 100;

    while (health > 0) {
        health -= 10;
        System.out.println(health);
    }

    90
    80
    70...

### 3. Do-While Loops
A **do-while loop** guarantees the code runs **at least once**.

#### Rules & Mechanics
- Condition is checked **after** the loops runs
- Always executes the body once
- Useful for:
  - Menus
  - User input validations
  - actions that must happen before checking a condition

#### Basic Structure

    do {
        // code to repeat
    } while (condition);

#### Example

    int option;

    do {
        option = getUserInput();
    } while (option != 1);

### Differences Between Loop Types

| Loop Type | Condition Checked | Runs At Least Once? | Best Use Case |
| --- | --- | --- | --- |
| **for** | before | no | counted repetition |
| **while** | before | no | unknown repetition |
| **do‑while** | after | yes | menus, input loops |

---

## Common Mistakes
- Forgetting to update the loop variable (infinite loop)
- Writing a condition that never becomes false
- Modifying the loop counter inside the loop body
- Using a `for` loop when a `while` loop is more apppropriate
- Forgetting braces when multiple statments are inside the loop

---

## Summary
Loops allows Java to repeat code automatically. Essential for:
- Iteration
- Automation
- Input handling
- game logic
- data process

## Side-note:
- The loop variable for a `for` loop is often named `i` (iteration variable)
- Infinite loops can be intentional
- Boolean expressions control every loop
- `break` and `continue` can modify loop behavior