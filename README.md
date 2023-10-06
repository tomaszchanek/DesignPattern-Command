# Command Design Pattern

## Definition

Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

## Example

Apart from other Hyperskill examples, the main one is all about famous ctrl-C, ctrl-V. A bit of Swing desktop graphics.

Command pattern base on Command abstract class with some implemented common functionality (like keeping previous state of text for ctrl-Z).
Classes inheriting Command superclass adds to main functionality like copy, cut or paste text. All of them also contains previous state.
By keeping the history of previous command we can link back and restore states from the past. Really nice example.

Diagram to show the structure:
![img.png](img.png)