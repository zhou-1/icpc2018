Drilling Down
(This is a simplified version of a problem from the 2016 World Finals.) The International Crude Petroleum Consortium (ICPC) is attempting to find the best spots to drill for oil. In general, there may be more than one oil deposit below a certain point on the land, so they'd like to find a spot to drill that will intersect as many oil deposits as possible.
To simplify its analysis, the ICPC considers only the 2-dimensional case, where oil deposits are modeled as horizontal line segments parallel to the earth's surface. The consortium's geologists have determined the locations of the oil deposits in a given oil field and this information will be provided to you.

           V
           V                   (100,20)                    (190, 20)
   (30,30) V      (60,30)         ===============================
       ====V==========
           V           
   (30,50) V(40,50)    (70,50)         (130,50)
       ====V==            =================
(0,70)     V               (80,70)
===========V==================
           V
Your program should determine the largest number of deposits that can be hit by one well. A well is considered to "hit" a deposit if it intersects it, even at the endpoint of the deposit.
INPUT: The first line of input contains a single integer n (1 ≤ n ≤ 1000) which is the number of oil deposits. This is followed by n lines each containing three integers, x1, x2, and depth describing an oil deposit from (x1,depth) to (x2,depth). These will satisfy -105 ≤ x1 < x2 ≤ 105 and 0 ≤ depth ≤ 1000. No two deposits intersect in any way (not even a shared endpoint). 
OUTPUT: The largest number of deposits that can be hit by one well.

Sample Input 1:
5
100 190 20
30 60 30
70 130 50
30 40 50
0 80 70
Sample Output 1:

3
Sample Input 2:
4
0 50 30
-100 0 20
-100 0 40
0 50 50
Sample Output 2:

4
EXTRA CHALLENGE: If you'd like a slightly harder problem, let the amount of oil in each deposit be the length of the line segment. In each case, determine the most oil you can extract with a single well. In the example shown above (Sample 1), the indicated well (hitting 3 deposits) would extract 30 + 10 + 80 = 120 units of oil. On the other hand, a well hitting the two deposits on the right would extract 90 + 60 = 150 units.

http://www.mscs.mu.edu/~mikes/icpc/drilling.html  
