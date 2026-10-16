# Statements
A statement is a complete command/instruction to be executed. Can have one or more expressions. Statements tell *Java what to do*

---

## Rules & Mechanics:
- Must end with a `;`
- Statements are executed from **top-to-bottom** unless control-flow logic changes it
- Can contain expressions
- Can call methods
- Can declare/initalize variables
- Live inside **methods, blocks, or loops**
- Whitespace does not affect statements

---

## Why is this important
Statements are the building blocks of all Java programs! The allow my code to:
- perform actions
- make decisions
- store values
- repeat tasks
- call methods
- control program flow

Every Java program is built from statements. Even the simple `System.out.println("Hello World");` is a statement and without it, nothing will print.

---

## Examples

### 1. Declaration Statements:
Introduce a variable to the program 

    int age;   
    double price;  
    char grade

### 2. Initialization Statements:
Assign a value to a variable

    age = 25;  
    price = 10.99;  
    grade = 'A';

### 3. Declaration + Initialization Statements
   
    int score = 100;  
    boolean isActive = true;

### 4. Expressions Statements:
These produce a value and end with a semicolon.   

    x = x + 1;  
    count++;  
    System.out.println("Hello World");  

For more information on what an expression is please see `notes/expressions.md`

### 5. Method Call Statements
These statements call a method to perform an action.

    System.out.println("Java is fun");

Above is the main statement inside `HelloWorld.java`.`System.out.println` is a buitlin method provided by Java

### 6. Control Flow Statements:
These are used to change the flow from normal **top-to-bottom**.  
- If-Else statements (see examples in `notes/if-conditionals.md`)
- Switch statements (see examples in `notes/switch.md`)

---

## Common Mistakes
- Forgetting the `;` at the end of a statement
- Putting statements outside of methods
- Using assignment (`=`) instead of comparison (`==`) inside statements

---

## Summary:
Statements are complete instructions that Java executes, and form the backbone of every Java program. They can be found in:
- declarations
- initializations
- methods calls
- control flow

## Side-Notes
- One statement can contain multiple statements
- A statement can contain multiple expressions