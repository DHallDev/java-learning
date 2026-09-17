# Method Challenge

## Goal
Create two methods to calculate and display a player's high score position.

## Requirements

### 1. displayHighScorePosition
- Parameters: player's name, player's position
- Prints: "<name> managed to get into position <position> on the high score lists."

### 2. calculateHighScorePosition
- Parameter: player's score
- Returns a position (1-4) based on score:
  - Score >= 1000 -> 1
  - Score >= 500 -> 2
  - Score >= 100 -> 3
  - Otherwise -> 4

## Test Values
Use the following scores:
- 1,500
- 1,000
- 500
- 100
- 25