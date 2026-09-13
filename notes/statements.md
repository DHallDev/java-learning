## Statements
A statment is a complete command/instruction to be executed. Consists of one ore more expressions.
Statements tell _Java what to do_

## Rules & Mechanics:
- Must end with a "`;`"
- Statements are executed from **top-to-bottom** unless control-flow logic changes it
- Can contain expressions
- Can call methods
- Can declare/initalize variables
- Live inside **methods, blocks, or loops**
- Whitespace does not affect statement execution

## Why is this important
Statements are the building blocks of all Java programs! The allow your code to:
- perform actions
- make decisions
- store values
- repeat tasks
- call methods
- control program flow

Every Java program is built from statements. Even our simple System.out.println("Hello World"); from
our HelloWorld.java file is a statement and without it, nothing would have printed.

## Examples
### 1. Declaration Statements:
Introduce a variable to the program   
int age;   
double price;  
char grade

### 2. Initialization Statments:
Assign a value to a variable   
age = 25;  
price = 10.99;  
grade = 'A';

### 3. Declaration + Initialization Statements
Most common   
int score = 100;  
boolean isActive = true;

### 4. Expressions Statements:
These produce a value and end with a semicolon.   
x = x + 1;  
count++;  
System.out.println("Hello World");

### 5. Method Call Statements
These Statments call a method to perform an action.  
System.out.println("Java is fun");  
$\uparrow$ is the main statment inside my HelloWorld program.

## 6. Control Flow Statments:
These are used to change the flow from normal top-to-bottom to something else.  
- # TBD

## Premium example of example in HelloWorld.java
My first program `HelloWorld.java` contains a method call statement.  
System.out.println("Hello Word");  
This is a complete instruction:
- call the Java built-in `println` method
- pass the String literal `"Hello World"` as an argument
- print the String literal to the console

## Common Mistakes
- Forgetting the `;` at the end of a statement
- Using expressions without completeing them as statements
- Confusing Expressions with statements
- Putting statments outside of methods
- Using assignment (`=`) instead of comparison (`==`) inside statements

## Summary:
Statments are complete instructions that Java executes.  
They form the backbone of every Java programs.  
They can be found in:
- declarations
- initializations
- expressions
- methods calls
- control flow

## Side-Notes
- A statement contain multiple statements
- A statement con contain multiple expressions
- Statements inside methods run in order unless control flow changes it
