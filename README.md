# Lab 04 – Selection Statements II

## 1. Objective
The purpose of this lab is to familiarize students with using:
1. Nested if statements
2. Switch-case statements

## 2. Lab Learning Outcomes (LLO)
By completion of the lab, the students should be able to:
1. Apply nested if statements (constructs) to a given problem
2. Apply a switch-case statement to a given problem

## 3. Theory Review – Nested if statement and switch-case statements
- **Nested if statement:** An if statement embedded inside another if statement.  
Example:
```java
if (x >= 60) {
    if (x >= 80) {
        System.out.println("Excellent! A or B grade.");
    } else {
        System.out.println("Great! C or D grade.");
    }
} else {
    System.out.println("Try again. You've got an F.");
}
