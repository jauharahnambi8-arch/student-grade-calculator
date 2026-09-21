# Student Grade Calculator

A simple Java console application that asks for a student's marks in 5 subjects, calculates the total and average, and shows whether the student passed or failed.

## Group Members

1. Nambi Jauharah 25/u/15466/PS
2. Namanya Nawal  25/u/15459/EVE
3. Ssegawa Kelvin Victor 25/u/15648/PS
4. Ssekanjako Melvin     25/u/15655/EVE
5. Asiimwe Audrey        25/u/14944


## What the Program Does

1. Asks for the student's name
2. Asks for marks in 5 subjects (each must be between 0 and 100)
3. Calculates the total and average
4. Shows **PASS** (average of 50 or more) or **FAIL**
5. Gives an encouraging comment based on the average
6. Asks if you want to add another student

## Java Concepts Used

| Concept | How it is used |
|---|---|
| **While loop** | Keeps the program running for more students while the user types `yes` |
| **For loop** | Repeats 5 times to enter the mark for each subject |
| **Do-while loop** | Keeps asking for a mark until it is between 0 and 100 |
| **Ternary statement** | Decides PASS/FAIL and the comment in one line |

## How to Run

Requires the Java Development Kit (JDK) installed.

```
javac StudentGradeCalculator.java
java StudentGradeCalculator
```

## Sample Output

```
=== STUDENT GRADE CALCULATOR ===

Enter student name (one word): Juharah
Enter mark for subject 1 (0-100): 80
Enter mark for subject 2 (0-100): 70
Enter mark for subject 3 (0-100): 65
Enter mark for subject 4 (0-100): 90
Enter mark for subject 5 (0-100): 75

--- RESULT ---
Student: Jauharah
Total marks: 380 out of 500
Average: 76
Result: PASS
Excellent work!
```

## Files

- `StudentGradeCalculator.java`: the complete application
