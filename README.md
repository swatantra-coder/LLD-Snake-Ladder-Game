# LLD-Snake-Ladder-Game

# Dice Game with Snakes and Ladders

This repository contains a simple implementation of a dice game with snakes and ladders using Java.

## Project Structure

- `src/Dice.java`: Contains the `Dice` class which simulates rolling a specified number of dice.
- `src/Cell.java`: Contains the `Cell` class which represents a cell on the game board. Each cell may contain a `Jump` (snake or ladder).
- `src/Board.java`: Contains the `Board` class which initializes the game board and adds snakes and ladders to it.
- `src/Jump.java`: Contains the `Jump` class which represents a snake or ladder with a start and end position.
- `src/Game.java`: Contains the `Game` class which manages the game flow and player interactions.
- `src/Player.java`: Contains the `Player` class which represents a player in the game.

## Classes

### Dice

Simulates rolling a specified number of dice.

#### Methods

- `Dice(int diceCount)`: Constructor to initialize the number of dice.
- `int rollDice()`: Rolls the dice and returns the total sum.

### Cell

Represents a cell on the game board.

#### Attributes

- `Jump jump`: Represents a snake or ladder on the cell.

### Board

Initializes the game board and adds snakes and ladders.

#### Methods

- `Board(int size, int snake, int ladder)`: Constructor to initialize the board with a specified size, number of snakes, and number of ladders.
- `void initializeBoard(int size)`: Initializes the board with empty cells.
- `void addSnakeAndLadder(int snake, int ladder, Cell[][] cells)`: Adds snakes and ladders to the board.
- `Cell getCell(int playerPosition)`: Returns the cell at a given player position.

### Jump

Represents a snake or ladder with a start and end position.

#### Attributes

- `int start`: The starting position of the snake or ladder.
- `int end`: The ending position of the snake or ladder.

### Game

Manages the game flow and player interactions.

#### Methods

- `Game(Board board, List<Player> players)`: Constructor to initialize the game with a board and players.
- `void start()`: Starts the game and manages player turns.

### Player

Represents a player in the game.

#### Attributes

- `String name`: The name of the player.
- `int position`: The current position of the player on the board.

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Compile and run the main class (not provided in the excerpts).

## Requirements

- Java 8 or higher
- IntelliJ IDEA 2022.2.2 or higher

## License

This project is licensed under the MIT License.

## UML Diagram

```plaintext
+----------------+       +----------------+       +----------------+
|     Player     |       |      Dice      |       |      Jump      |
+----------------+       +----------------+       +----------------+
| - name: String |       | - diceCount: int|      | - start: int   |
| - position: int|       +----------------+       | - end: int     |
+----------------+       | + rollDice(): int|     +----------------+
| + getName(): String|   +----------------+       | + getStart(): int|
| + getPosition(): int|                          | + getEnd(): int  |
| + setPosition(int): void|                      +----------------+
+----------------+       +----------------+       +----------------+
        |                        |                        |
        |                        |                        |
        |                        |                        |
        v                        v                        v
+----------------+       +----------------+       +----------------+
|      Cell      |       |     Board      |       |     Game       |
+----------------+       +----------------+       +----------------+
| - jump: Jump   |       | - size: int    |       | - board: Board |
+----------------+       | - cells: Cell[][]|     | - players: List<Player>|
| + getJump(): Jump|     +----------------+       +----------------+
+----------------+       | + initializeBoard(int): void| + start(): void|
                        | + addSnakeAndLadder(int, int, Cell[][]): void|
                        | + getCell(int): Cell| 
                        +----------------+


```
![image](https://github.com/user-attachments/assets/75ff5b09-f045-4669-a1d7-ee2656c200be)

