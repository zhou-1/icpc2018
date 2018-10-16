Simon Tatham's Portable Puzzle Collection includes a puzzle called "Unequal". In this puzzle you fill in a 5x5 square using the numbers 1 to 5 subject to two rules: You can't repeat a number in a column or row and you have to make the given inequalities true. The initial square has some inequalities located between adjacent cells and perhaps some numeric values in place. For instance:

In this puzzle, the first row, second column could possibly be 1, 4, or 5, but not 2 or 3, since they already occur in the row. Similarly, fourth row, first column can only be 1 or 2, since it must be less than 3.
INPUT: The input consists of 9 lines of 9 characters each. The odd-numbered rows each correspond to one row of entries in the puzzle. These lines consists of 9 characters, every other one of which is either a blank entry, denoted by the underscore character, or a digit. These characters are then separated by spaces, <, or >. Between each pair of even-numbered rows, there will be 9 characters consisting of space, v, or ^ indicating any inequalities between entries in adjacent rows. For instance, the puzzle pictured above would appear as the input:

3 _ _ _ 2
    ^    
_<_ _ _ _
    ^    
_ _ _ _ _
    v    
_<3 _ _ _
         
_ _>_ _ _
OUTPUT: Your program should print out the solution in the same format with underscores replaced by appropriate digits.

Sample Input 1:
_ _ _<_ 2
         
3 _ _ _ _
^ v     v
_ _ _<_ _
         
_>_ _ _<_
        ^
_>_ _<_ _
Sample Output 1:

1 3 4<5 2
         
3 5 1 2 4
^ v     v
5 4 2<3 1
         
4>2 5 1<3
        ^
2>1 3<4 5
Sample Input 2:
_ _ _>_ _
        v
_<_ _ _ _
    v    
_ _ _>_ _
        V
2 _ _ _ _
^   ^    
_ _ _ _ 5
Sample Output 2:

1 3 5>4 2
        v
3<5 4 2 1
    v    
5 2 3>1 4
        V
2 4 1 5 3
^   ^    
4 1 2 3 5
ALTERNATE PROBLEM: If you find the inequalities above to be overwhelming, you might try the simpler puzzle of completing a latin square (i.e. no repeats in rows or columns). Sample inputs in this case might be something like:
4 _ _ _ _
         
5 4 _ _ 2
         
_ _ 5 _ _
         
1 _ _ 2 4
         
_ _ _ _ 1
_ _ 1 2 _
         
2 1 3 4 _
         
_ _ _ _ _
         
_ _ _ 1 _
         
1 _ 2 3 _
In fact, since we don't have any inequalities to show, we could even simplify the input to 5 rows of 5 characters each:
4____
54__2
__5__
1__24
____1
__12_
2134_
_____
___1_
1_23_
if you find that easier to process.


http://www.mscs.mu.edu/~mikes/icpc/unequal.html
