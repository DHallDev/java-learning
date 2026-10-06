# Switch Statements In Java

A basic control-flow structure that selects one path of execution based on the value of a single expression.

## Rules & Mechanics
- Evaluates **one expression** once
- Compares that single expression against **specific values**
- `break` keyword is used to prevent fall-through
- `default` is ran when no case matches (like an `else`)
- Works with these data types:
  - `byte`
  - `short`
  - `char`
  - `int`
  - `String`
  - `enum` &rarr; to go into greater detail at a later date
- Modern switch expressions (Java 14+) allows me to return values directly (like how we'd done with methods)
- Cases must be constant values (no ranges, no boolean)

## Why Is This Important
- Simplifies long `else-if` chains
- Makes branching logic easier to read
- Group related cases together
- Reduce repeated comparisons
- Improves clarity when checking values
- Supports modern, cleaner syntax with arrow expressions
Switch statements basically helps cut out on seeing `if (x == value)` everywhere

## Structure Of A Switch Statement

### Traditional Switch
This is the traditional switch statement, before Java 14

    int switchValue = 3;

    switch (switchValue) {
      case 1:
        System.out.println("Value was 1");
      break;
      case 2:
        System.out.println("Value was 2");
      break;
      default:
        System.out.println("Was not 1 or 2");
      break;
    }

You can chain cases like this:

    int switchValue = 3;

    switch (switchValue) {
      case 1:
        System.out.println("Value was 1");
      break;
      case 2:
        System.out.println("Value was 2");
      break;
      case 3: case 4: case 5:
        System.out.println("Was a 3, a 4, or a 5");
        System.out.println("Actually it was a " + switchValue);
        break;
      default:
        System.out.println("Was not 1, 2, 3, 4, or a5");
      break;
    }

### Enhanced Switch
After Java 14, the `switch` statement has been modified to help prevent fall-through. Any corporation
that any Java version 14 or after can have their `switch` statements written in this way.

    int points = switch (grade) {
        case 'A' -> 5;
        case 'B' -> 4;
        case 'C' -> 3;
        case 'D' -> 0;
    };

## Common Mistakes
- Forgetting the `break` keyword, causing unintended fall-through
- Using switch for **ranges**
- Not including a `default` case
- Using complex boolean logic inside case labels
- Switching on types not supported (e.g., `boolean`, `float`, `double`)

## Summary
Switch statements provide a clean way to compare one value against multiple discrete options. They improve readability, reduce repetitive comparisons.
By understanding the `switch` statement, I can avoid super complex `else-if` chains.

## Notes
- If you want the `traditional switch` in an expression, you must first wrap it in a method that returns the value.


    public static String getQuarter(String month) {
      switch (month) {
        case "JANUARY": case "FEBRUARY": case "MARCH":
          return "1st";
        case "APRIL": case "MAY": case "JUNE":
          return "2nd";
        case "JULY": case "AUGUST": case "SEPTEMBER":
          return "3rd";
        case "OCTOBER": case "NOVEMBER": case "DECEMBER":
          return "4th";
        default:
          return "INVALID MONTH";
      }
    }

- If you want to do something before other code in `switch expression` you must put them in `{}`. But you should not use
`return` if you do this. Instead, you would use the `yield` keyword. This example is using a `enhanced switch`


    public static String getQuarter(String month) {
      return switch (month) {
        case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
        case "APRIL", "MAY", "JUNE" -> "2nd";
        case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
        case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
        default -> {
          String badResponse = month + " is bad";
          yield badResponse;
        }
      };
    }