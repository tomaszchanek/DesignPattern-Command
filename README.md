# Command Design Pattern

## Definition

Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

![img_1.png](img_1.png)

## Example
### Simple text editor

This is a simple text editor with use of Swing. The main goal is to implement feature to work with well
known functions like ctrl-c ctrl-v or ctrl-z. We can achieve this via Command pattern.

Command pattern base on Command abstract class with some implemented common functionality (like keeping previous state of text for ctrl-Z).
Classes inheriting Command superclass adds to main functionality like copy, cut or paste text. All of them also contains previous state.
By keeping the history of previous command we can link back and restore states from the past. Really nice example.

![img.png](img.png)

![img_2.png](img_2.png)

## Other

- Example is from awesome website [Refactoring Guru](https://refactoring.guru)
- There is another example attached from Hyperskill (Stock broker & Intelligent home)
