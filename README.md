# Java Learning Repository

A collection of Java practice programs, exercises, and small projects, organized by topic. Several of the programs are based on exercises from the textbooks below.

## Reference Textbooks

- [Introduction to Programming Using Java](https://math.hws.edu/javanotes/): the main textbook covering Java fundamentals, objects, and data structures.
- [Introduction to Programming Using Java: Swing](https://math.hws.edu/javanotes-swing/): the companion volume on graphical user interfaces with Swing.

## Folder Overview

| Folder | Contents |
|---|---|
| `GameplayBasics/` | Basic game logic: `ArrayExercises`, `Cell`, `Hello`, `HelloTest` (JUnit tests), `Main`, `Player`, `ReadingInputTillZero` |
| `name_in_stars/` | `Name.java`, which prints a name made of stars along with a dice roll |
| `sorting_algorithms/` | `Main.java`, bubble sort and selection sort on user input |
| `quick_sort/` | `Main.java`, quick sort with the Lomuto partition scheme |
| `Helloworld/` | `Helloworld.java`, enum, string, and formatting examples |
| `heap/` | `MinHeap.java`, a min-heap with insert, delete, search, and heap sort |
| `greatest_common_divisor/` | `Main.java`, GCD using the Euclidean algorithm |
| `Helloworld/` | Miscellaneous files, listed below |

## Files in `Helloworld/`

- `BaseConversion2.java`: base conversion
- `GUI2.java` and `GUI3.kt`: the same "Hello World" window with an Exit button in Java and Kotlin
- `TextIO.java` and `TextIO.class`: a text input helper library
- `change.java`, `greeting.java`, `GuessingGamesubroutine.java`, `gui.java`, `math_game_reduction_to_1.java`, `num_eggs.java`, `readfile.java`, `Simple_Calculator.java`: standalone exercises
- `Checkerboard.java`, `CyclicAndOscillatingMotionDemo.java`, `MovingRects.java`, `SimpleGraphicsStarter.java`: Swing graphics demos
- `Main_1.java`: base 2 to base 10 converter with a Swing interface
- `.class` files: compiled versions of some of the programs above

## Getting Started

1. Install a Java Development Kit (JDK 17 or newer is recommended).
2. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```
3. Compile and run a program from the command line, for example:
   ```bash
   cd hello_world
   javac Helloworld.java
   java Helloworld
   ```

Programs that use `TextIO` need `TextIO.java` in the same folder, or on the classpath.

## Running the Tests

The JUnit tests in `GameplayBasics/` require JUnit 5. Compile the sources together with the JUnit jar, then run `HelloTest`.

