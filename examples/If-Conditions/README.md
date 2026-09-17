## Concepts Demonstrated

### Basic If-Statements
- Evaluating boolean expressions
- Running code conditionally
- Skipping code when conditions are false

### If-Else Statements
- Evaluating boolean expressions
- Running code conditionally
- Running code in `else` if `if` condition is false

### Else-If Chains
- Evaluating boolean expressions
- Running code conditionally
- Checking multiple conditions and running the code for the condition that returns true

### Logical Operators
- `&&` (AND)
- `||` (OR)
- `!` (NOT)
- Combining multiple boolean expressions inside an `if`

### Ternary Operator
- Compact conditional assignment
- `condition ? valueIfTrue : valueIfFalse`
- Used as a shorthand alternative to simple if-statements

### File Included
#### Hello.java
Contains all examples from this lesson:
- Basic if-statements
- Logical operator usage
- Ternary operators

#### Main.java
Contains:
- If-Else Statements
- Else-If Chains
- Challenge to reinforce structure of If-Else statements

#### MainChallenge.java
Contains:
- A challenge to reinforce if statements & code blocks. Without changing the above code in the file:
  - Set the existing score to 10,000
  - Set the existing levelCompleted to 8
  - Set the existing bonus to 200
  - Using the same **if** condition

### Observations After Doing The Challenge
- Since I am altering the current variables I don't need to remake new variables
  - When changing variable values I don't have to retype the data type
- My code is just a carbon copy of the code above.
- Since I changed the value, doesn't that mean that my first `finalScore` variable isn't saved once 
it reached the lower code?
- If the above bullet is true I have to be careful when changing code later on in my program since technically
the value isn't saved in memory unless I make a new variable
- After reviewing the code, it was shown that if we wanted to update the code after, we would have to
change the code in **2** places.

## Related Notes
- If-Conditionals: `notes/if-conditionals.md`
- Operators (Ternary): `notes/operators.md`
