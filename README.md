# Tower of Hanoi: Iterative vs Recursive

## Problem
Tower of Hanoi is a puzzle where you move disks from one rod to another, following rules:
1. Only one disk can be moved at a time.
2. A disk can only be placed on top of a larger disk.
3. All disks start on one rod and must end on another.

## Implementations
- **Recursive**: Uses function calls to break the problem into smaller parts.
- **Iterative**: Uses loops and logic to simulate moves without recursion.

## Code Files
- `HanoiRec.java` → Recursive solution
- `HanoiIter.java` → Iterative solution
- `HanoiRecTest.java` → Tests recursion limits
- `HanoiIterTest.java` → Tests iteration limits

## Results
- Recursive version works fine for small `n`, but crashes with **StackOverflowError** around 20–25 disks.
- Iterative version can handle bigger `n`, but the number of moves grows too fast (billions of moves).

### Screenshots
1. **Recursive Test Output**  
<img width="1108" height="991" alt="image" src="https://github.com/user-attachments/assets/a677c1ef-a789-4ba4-9f69-0ac0bbbea856" />

2. **Iterative Test Output**  
<img width="1132" height="850" alt="image" src="https://github.com/user-attachments/assets/b5a465fc-5a6f-4303-8e15-dc93083fbde2" />

## Conclusion
- Maximum input your recursive code can handle is ~20 disks before crashing.
- Maximum input your iterative code can handle is ~25–30 disks
