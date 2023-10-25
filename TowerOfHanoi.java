public class Hanoi {

    public static void main(String[] args) {
        int n = 2;
        int from = 1, to = 3, aux = 2;

        Hanoi hanoi = new Hanoi();
        long moves = hanoi.toh(n, from, to, aux);
        System.out.println("Total moves: " + moves);
    }

    public long toh(int N, int from, int to, int aux) {
        return tohUtil(N, from, to, aux);
    }

    private long tohUtil(int N, int from, int to, int aux) {
        if (N == 1) {
            System.out.println("Moving disc 1 from " + from + " to " + to);
            return 1; // One move is performed
        }

        long moves = 0;
        moves += tohUtil(N - 1, from, aux, to);
        System.out.println("Moving disc " + N + " from " + from + " to " + to);
        moves += 1; // Move for the current disc
        moves += tohUtil(N - 1, aux, to, from);

        return moves;
    }
}
Now, the toh method returns the total number of moves, and you can print that value in the main method. This way, you still get the count of moves as a long while printing each move during the Tower of Hanoi simulation.




User
Tower Of Hanoi
MediumAccuracy: 35.23%Submissions: 125K+Points: 4
Short on funds for the festive season? Register for Hackathon and win cash rewards!  

banner
The tower of Hanoi is a famous puzzle where we have three rods and N disks. The objective of the puzzle is to move the entire stack to another rod. You are given the number of discs N. Initially, these discs are in the rod 1. You need to print all the steps of discs movement so that all the discs reach the 3rd rod. Also, you need to find the total moves.
Note: The discs are arranged such that the top disc is numbered 1 and the bottom-most disc is numbered N. Also, all the discs have different sizes and a bigger disc cannot be put on the top of a smaller disc. Refer the provided link to get a better clarity about the puzzle.

Example 1:

Input:
N = 2
Output:
move disk 1 from rod 1 to rod 2
move disk 2 from rod 1 to rod 3
move disk 1 from rod 2 to rod 3
3
Explanation: For N=2 , steps will be
as follows in the example and total
3 steps will be taken.
Example 2:

Input:
N = 3
Output:
move disk 1 from rod 1 to rod 3
move disk 2 from rod 1 to rod 2
move disk 1 from rod 3 to rod 2
move disk 3 from rod 1 to rod 3
move disk 1 from rod 2 to rod 1
move disk 2 from rod 2 to rod 3
move disk 1 from rod 1 to rod 3
7
Explanation: For N=3 , steps will be
as follows in the example and total
7 steps will be taken.
Your Task:
You don't need to read input . You only need to complete the function toh() that takes following parameters: N (number of discs), from (The rod number from which we move the disc), to (The rod number to which we move the disc), aux (The rod that is used as an auxiliary rod) and prints the required moves inside function body (See the example for the format of the output) as well as return the count of total moves made. The total number of moves are printed by the driver code.
Please take care of the case of the letters.

Expected Time Complexity: O(2N).
Expected Auxiliary Space: O(N).

Constraints:
0 <= N <= 16 class Hanoi {

    public long toh(int N, int from, int to, int aux) { please give the code in above approach of c++4
ChatGPT
Certainly! Here's the C++ code for the Tower of Hanoi problem based on the given approach:

cpp
Copy code
#include<iostream>
using namespace std;

class Hanoi {
public:
    long toh(int N, int from, int to, int aux) {
        long moves = 0;
        moves = tohUtil(N, from, to, aux);
        return moves;
    }

private:
    long tohUtil(int N, int from, int to, int aux) {
        if (N == 1) {
            cout << "move disk 1 from rod " << from << " to rod " << to << endl;
            return 1;  // One move is performed
        }

        long moves = 0;
        moves += tohUtil(N - 1, from, aux, to);
        cout << "move disk " << N << " from rod " << from << " to rod " << to << endl;
        moves += 1;  // Move for the current disc
        moves += tohUtil(N - 1, aux, to, from);

        return moves;
    }
};

int main() {
    int n = 3; // Replace with the desired number of discs
    int from = 1, to = 3, aux = 2;

    Hanoi hanoi;
    long totalMoves = hanoi.toh(n, from, to, aux);
    cout << "Total moves: " << totalMoves << endl;

    return 0;
}
This code uses a class-based approach to encapsulate the Tower of Hanoi logic, and the toh method returns the total number of moves. The main function demonstrates how to use the class and prints the total moves.





