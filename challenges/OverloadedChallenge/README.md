# Overloaded Method Challenge

## Goal:

Create 2 methods both named getDurationString. Both will take their respective parameters and display the time in hours with the remaining minutes and seconds.

## Requirements:

### 1. getDurationString(`int` seconds)

- Validation check:
  - seconds < 0 &rarr; Print "Invalid value. Seconds can't be negative: " (show seconds)
- Return Type: String
- Use Overloaded Method

### 2. getDurationString(`int` minutes, `int` seconds)

- Validation check:
  - minutes < 0 &rarr; Print "Invalid value. Minutes can't be negative: " (show minutes)
  - seconds < 0 OR seconds > 59 &rarr; Print "Invalid value, Seconds must be between 0 and 59: " (show seconds)
- Return Type: String
    - `XXh YYm ZZs`
        - `XX` = Hours
        - `YY` = Minutes
        - `ZZ` = Seconds

### Approach:

- Added validation check at the top of each method body.
- Calculated total minutes and the seconds that would be left over after converting from the seconds parameter in the first `getDurationString`.
- Invoked the overloaded method passing the minutes and remaining seconds as parameters.
- Calculated total hours and the minutes that would be left over after converting from the minutes parameter in the second `getDurationString`.
- appended those results to the template and return them.


## Notes

- Kept getting total number of minutes when I actually needed the minutes after converting them to hours.
- Same problem with seconds, needed seconds after converting them to minutes.
- By passing the remaining seconds we ensure that the first method can only provide seconds between 0 and 59.

