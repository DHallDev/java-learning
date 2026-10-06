# Overloaded Method Challenge

## Goal
Create 2 methods both named getDurationString. Both will take their respective parameters and display
the time in hours with the remaining minutes and seconds.

## Requirements

### 1. `getDurationString`
- 1 Parameter: seconds
- Validation: seconds needs to be >= 0
  - Print message if invalid data passed
- `return` a String
    - `XXh YYm ZZs`
      - `XX` = Hours
      - `YY` = Minutes
      - `ZZ` = Seconds

### 2. convertToCentimeters
- 2 Parameters: int minutes, int seconds
- Validation: minutes needs to be >= 0, seconds needs to be between 0 and 59
  - Print message if invalid data passed
- `return` a String
    - `XXh YYm ZZs`
        - `XX` = Hours
        - `YY` = Minutes
        - `ZZ` = Seconds
- Must call the first method

## Test Values
- Test inches: 68in
- Test Feet & Inches: 5ft, 8in

## Notes
- This challenge helped reinforce the helpfulness of using code to help cut down on code duplication.
- I originally had the guard clauses set up in an `else-if` chain. While this code works as intended,
I think it's better served to have them as separate `if` statements, just like Tim has in his solution
video. I think the reasoning behind this is because these are not mutual checks (seconds does not need
minutes to be positive to be under 0 or over 59). I also believe this will tie into logging errors in
