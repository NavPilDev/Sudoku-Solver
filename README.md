![alt text](https://github.com/NavPilDev/Sudoku-Solver/blob/main/SudokuSolverBanners/SudokuSolverBanner.jpg?raw=true)

# Overview <a name="Overview"></a>
This is a Java-Based Sudoku Solver that solves any 3x3 board. If an impossible board is inputted, the program will not compute it, and will prompt the user that it is an unsolvable board. Version 1.0.0 is text-based. This program uses recursive methods to solve the board correctly. I have included comments within the java project files to explain how it works.

# Table of Contents
* [Overview](https://github.com/NavPilDev/Sudoku-Solver/edit/main/README.md#overview-)
* [Versions](https://github.com/NavPilDev/Sudoku-Solver/edit/main/README.md#versions-)
* [Installation](https://github.com/NavPilDev/Sudoku-Solver/edit/main/README.md#installation-)
* [Using Solver](https://github.com/NavPilDev/Sudoku-Solver/edit/main/README.md#using-the-solver)
* [Updates](https://github.com/NavPilDev/Sudoku-Solver/edit/main/README.md#updates-to-come-)

# Versions <a name="Versions"></a>
### <ins>Version 1.0.0</ins> - Abhinav Pillai 12/29/2022 
This is the first version of the Sudoku Solver, and will be updated according to the plans in planned updates.



![alt text](https://github.com/NavPilDev/Sudoku-Solver/blob/main/SudokuSolverBanners/HowToUseBanner.jpg?raw=true)

# Installation <a name="Installation"></a>
There are 2 ways currently to use this program.

### Downloading the SudokuSolver.jar File and running through CMD
1. Download the Jar File(Located in the SudokuSolverVX.X.X folder)
![alt text](https://github.com/NavPilDev/Sudoku-Solver/blob/main/Images/SudokuSolverJar.png?raw=true)
2. Copy the file path of where you downloaded the jar. <br />
![alt text](https://github.com/NavPilDev/Sudoku-Solver/blob/main/Images/CopyFilePath.png?raw=true)
3. Open Command Prompt and run the following commands: <br />
```
cd <Insert Filepath from previous step here>
dir
```
What this does is that it sends the command prompt to the folder where the SudokuSolver.jar is situated using the cd command, and then displays the contents of the folder using dir.
<br />

Example: <br /> ![alt text](https://github.com/NavPilDev/Sudoku-Solver/blob/main/Images/CMDCDDIR.png?raw=true)

4. Then run the command:
```
java -jar SudokuSolver.jar
```

Example: <br /> ![alt text](https://github.com/NavPilDev/Sudoku-Solver/blob/main/Images/CMDJAVA.png?raw=true)

Enjoy :)

### Importing the project into an IDE(Project located in the SudokuSolverVX.X.X folder)
I have put the project files on github for users to import into their IDEs and experiment with/see how the solver works.

Importing the project may depend on the IDE you use so I have left some tutorials below if you need help figuring that out:

* [Eclipse](http://people.cs.uchicago.edu/~kaharris/10200/tutorials/eclipse/import.html)
* [Visual Studio](https://vaadin.com/docs/latest/guide/step-by-step/importing/vscode)

Enjoy :)

# Using the Solver
The solver will prompt you to enter in the lines one by one, entering zeroes for empty blocks/spaces. 
![alt text](https://github.com/NavPilDev/Sudoku-Solver/blob/main/Images/EnterRows.png) <br />
The solver will then output a sudoku board with the rows you inputted <br />
![alt text](https://github.com/NavPilDev/Sudoku-Solver/blob/main/Images/SudokuBoard.png) <br />
The solver will then, in the backend, solve the board, and then in the front end output the board with the solved numbers. <br />
![alt text](https://github.com/NavPilDev/Sudoku-Solver/blob/main/Images/SolvedSuccesfully.png) <br />
* If the sudoku board is not solvable, the solver will output that the sudoku board is unsolvable <br />


![alt text](https://github.com/NavPilDev/Sudoku-Solver/blob/main/SudokuSolverBanners/PlannedUpdates.jpg?raw=true)
## Updates to Come <a name="Updates"></a>
* #### Update program with JavaFx for better visual experience
* #### Make a web version that would run on my website
* #### Make the solver solve for more types of boards
