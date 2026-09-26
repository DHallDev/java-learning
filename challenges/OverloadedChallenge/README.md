# Overloaded Method Challenge

## Goal
Create 2 methods both named getDurationString. Both will take their respective parameters and display
the time in hours with the remaining minutes and seconds.

## Requirements

### 1. `getDurationString`
- 1 Parameter: seconds
- Validation: seonds needs to be >= 0
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
This challenge helped reinforce the helpfullness of using code to help cut down on code duplication.