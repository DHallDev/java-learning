## Operators
Operators are special symbols that perform actions on values or variables. These handy little things  
allow Java to do math, compare values, assign data, and control logic  
Operators work with **operands** (these are the values being operated on) and produce a **result**.

## Rules & Mechanics:
- Act on one or more operands
- Follow **precedence** (order of evaluation)
- Can be combined inside Expressions
- Some only work on **numeric** data types
- Some only work on **boolean** data types
- Sometimes appear inside statements

## Why is this important
They allow my program to:
- perform calculation
- compare values
-  make decisions
- update variables
- control logic
- build expressions

As you can see they are used CONSTANTLY in Java, making them foundational concept to learn

## Examples
### 1. Assignment Operator
Used to assign values to variables.  
int age = 25;  
Operator: `=`

### 2. Math Operators
| Operator | Meaning | Example | Result |
| --- | --- | --- | --- |
| ``+`` | addition | ``5 ``+ ``3`` | 8 |
| ``-`` | subtraction | ``10 ``- ``4`` | 6 |
| ``*`` | multiplication | ``6 ``* ``2`` | 12 |
| ``/`` | division | ``10 ``/ ``3`` | 3 (integer division) |
| ``%`` | remainder (modulus) | ``10 ``% ``3`` | 1 |

#### Example:
int result = 10 % 3;

### 3. Unary Operators
| Operator | Meaning | Example |
| --- | --- | --- |
| ``+`` | unary plus | ``+x`` |
| ``-`` | unary minus | ``-x`` |
| ``++`` | increment | ``x++`` or ``++x`` |
| ``--`` | decrement | ``x--`` or ``--x`` |

#### Example:
count++;

### 4. Comparison (Relational) Operators:
| Operator | Meaning | Example | Result |
| --- | --- | --- | --- |
| ``==`` | equal to | ``5 ``== ``5`` | true |
| ``!=`` | not equal | ``5 ``!= ``3`` | true |
| ``>`` | greater than | ``10 ``> ``5`` | true |
| ``<`` | less than | ``3 ``< ``1`` | false |
| ``>=`` | greater or equal | ``5 ``>= ``5`` | true |
| ``<=`` | less or equal | ``4 ``<= ``2`` | false |

### 5. Logical Operators
| Operator | Meaning   | Example         |
|---------|-----------|-----------------|
| ``&&``  | logical AND | `true && false` |
| ` \|\|` | logical OR | `true \|\| false` |
| ``!``   | logical NOT | `!true`         |

#### Example:
if (age > 18 && isStudent) {  
&emsp;System.out.println("Discount applied");  
}

### 6. String Concatenation Operator
The `+` operator behaves a bit differently with Stings.  
String fullName = firstName + " " + lastName;  
$\uparrow$: If you want to know why this happens read `strings.md`.

### 7. Ternary Operator (Conditional Operator)
The ternary operator is a special operator that acts like a compact if-then-else statement.  
#### Structure:
condition ? valueIfTrue : valueIfFalse
#### Example:
 
String makeOfCar = "Volkswagen";  
boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;  

$\uparrow$ found in `Hello.java` file

## Operator Precendence
Just like math, Java evaluates some operators before others (think PEMDAS).  
Here is just a couple we know so far and their order...   
1. Parentheses `()`
2. Unary operators (`++`, `--`, `-`)
3. Multiplication / Division / Modulo (`*`, `/`, `%`)
4. Addition / Subtraction (`+`, `-`)
5. Comparison operators (`==`, `!=`, `>`, `<`, `<=`, `>=`)
6. Logical operators (`&&`, `||`)
7. Assignement (`=`)

For the full unadulterated list, see: `https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html`


## Common Mistakes
- Using `=` instead of `==` in comparisons
- Forgetting integer division truncates decimals
- Using logical operators with non-boolean values
- Forgetting operator precedence (**this is a big one**)
- Assuming `%` returns a percentage
- Confusing `+` for math when used on Strings

## Summary
Operators perform actions on values and variables. With these Java can now:
- calculate
- compare
- compare
- assign
- combine
- evaluate logic

## Side Notes
- `%` is extremely useful for even/odd checks
- `==` compares values for primitives but **references** for objects
- `++x` increments before use; `x++` increments after use.
- Division with integers always truncates
- String concatenation creates new objects (reference: `string.md`)
