# Quilting Bee     
Quilting Bee
Write a program which reads quilting squares and a design pattern and prints out the resulting quilt. Quilting squares are 5x5 character arrays labeled by digits 1, 2, ... A design pattern consists of a rectangular array of digits, each row describing a row of squares in the final quilt.
The input file begins with an integer number s of squares (1 <= s <= 9) followed by the square patterns with one blank row after each (as shown below). Then follow several design patterns each beginning with a row of 2 integers, rows and cols, indicating the number of rows and columns in the design. This is followed by that number of rows containing cols digits as shown below. The end of the input is indicated by a design size of 0 0. There are no blank lines between the patterns.

Your program should output the quilts numbered as shown below.

Sample Input:
4
..O..
.O...
O...O
...O.
..O..

..O..
...O.
O...O
.O...
..O..

77777
----7
777-7
--7-7
7-7-7

L-L-L
L-L--
L-LLL
L----
LLLLL

2 3
1 2 2
2 1 1
4 4
3 4 3 4
4 3 4 3
4 3 4 3
3 4 3 4
0 0
Sample Output:

Quilt #1
..O....O....O..
.O......O....O.
O...OO...OO...O
...O..O....O...
..O....O....O..
..O....O....O..
...O..O....O...
O...OO...OO...O
.O......O....O.
..O....O....O..

Quilt #2
77777L-L-L77777L-L-L
----7L-L------7L-L--
777-7L-LLL777-7L-LLL
--7-7L------7-7L----
7-7-7LLLLL7-7-7LLLLL
L-L-L77777L-L-L77777
L-L------7L-L------7
L-LLL777-7L-LLL777-7
L------7-7L------7-7
LLLLL7-7-7LLLLL7-7-7
L-L-L77777L-L-L77777
L-L------7L-L------7
L-LLL777-7L-LLL777-7
L------7-7L------7-7
LLLLL7-7-7LLLLL7-7-7
77777L-L-L77777L-L-L
----7L-L------7L-L--
777-7L-LLL777-7L-LLL
--7-7L------7-7L----
7-7-7LLLLL7-7-7LLLLL


http://www.mscs.mu.edu/~mikes/icpc/quilt.html       
