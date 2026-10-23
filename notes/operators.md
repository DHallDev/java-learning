# Operators
Operators are special symbols in Java that perform specific operations on one, two, or three **operands** (any object/value being manipulated by an operator) and produce a 
**result**.

---

## Rules & Mechanics:
- Act on one or more operands
- Follow **precedence** (order of evaluation)
- Can be combined inside Expressions
- Some only work on **numeric** data types
- Some only work on **boolean** data types
- Sometimes appear inside statements

---

## Why is this important
They allow my program to:
- perform calculation
- compare values 
- make decisions
- update variables
- control logic
- build expressions

---

## Different Types Of Operators

### 1. Math Operators
| Operator | Meaning                  | Example                               | Result               |
|----------|--------------------------|---------------------------------------|----------------------|
| `+`      | addition / concatenation | `5 + 3` / `String name = Johnson" + 8 | 8 / Johnson8         |
| `-`      | subtraction              | `10 - 4`                              | 6                    |
| `*`      | multiplication           | `6 * 2`                               | 12                   |
| `/`      | division                 | `10 / 3`                              | 3 (integer division) |
| `%`      | remainder (modulus)      | `10 % 3`                              | 1                    |

Concatenation explained in more detail in `strings.md`

### 2. Unary Operators
| Operator | Meaning     | Example        |
|----------|-------------|----------------|
| `+`      | unary plus  | `+x`           |
| `-`      | unary minus | `-x`           |
| `++`     | increment   | `x++` or `++x` |
| `--`     | decrement   | `x--` or `--x` |

### 3. Comparison (Relational) Operators:
| Operator | Meaning          | Example  | Result |
|----------|------------------|----------|--------|
| `==`     | equal to         | `5 == 5` | true   |
| `!=``    | not equal        | `5 != 3` | true   |
| `>`      | greater than     | `10 > 5` | true   |
| `<`      | less than        | `3 < 1`  | false  |
| `>=`     | greater or equal | `5 >= 5` | true   |
| `<=`     | less or equal    | `4 <= 2` | false  |

### 4. Logical Operators
| Operator | Meaning     | Example           |
|----------|-------------|-------------------|
| `&&`     | logical AND | `true && false`   |
| `\|\|`   | logical OR  | `true \|\| false` |
| `!`      | logical NOT | `!true`           |

### 5. Assignment Operator
`=` assigns a value

        int result = 3;

This is assigning the value `3` to the variable `result`.

### 6. Ternary Operator (Conditional Operator)
The **ternary** operator is a shortcut to assigning one of two values to a variable, depending on a condition. Often seen as a shortcut of the **if-then-else** statement (see `if-conditionals.md`).

#### Structure:
condition ? valueIfTrue : valueIfFalse
 
    String makeOfCar = "Volkswagen";
    boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;  

found in `Hello.java` file

---

## Operator Precedence
Just like math, Java evaluates some operators before others (think PEMDAS).Here is just a couple we know so far and their order...   
1. Parentheses `()`
2. Unary operators (`++`, `--`, `-`)
3. Multiplication / Division / Modulo (`*`, `/`, `%`)
4. Addition / Subtraction (`+`, `-`)
5. Comparison operators (`==`, `!=`, `>`, `<`, `<=`, `>=`)
6. Logical operators (`&&`, `||`)
7. Assignment (`=`)

For the full unadulterated list, see: `https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html`

---

## Common Mistakes
- Using `=` instead of `==` in comparisons
- Forgetting integer division truncates decimals
- Using logical operators with non-boolean values
- Forgetting operator precedence (**this is a big one**)
- Assuming `%` returns a percentage
- Confusing `+` for math when used on Strings

---

## Summary
Operators perform actions on values and variables. With these Java can now:
- calculate
- compare
- compare
- assign
- combine
- evaluate logic

## Side Notes
- `==` compares values for primitives but **references** for objects
- the `%` returns the remaining value from a division operation (Ask yourself how many times does the right operand fit inside the left. Then whatever is leftover is the result).
- `++x` increments before use; `x++` increments after use.
- Division with integers always truncates
- When using the compound assignment operator, it hides a potential "lossy conversion" error.
  - x -= y == x = (data type of x) (x -y): an implicit cast is used when using this operator
- String concatenation creates new objects (reference: `string.md`)
