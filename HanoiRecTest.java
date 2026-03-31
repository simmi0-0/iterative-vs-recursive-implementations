public class HanoiRecTest {
    static long counter = 0; // keep track of moves

    public static void main(String[] args) {
        for (int n = 1; n <= 30; n++) { // test from 1 to 30 disks
            counter = 0; // reset counter
            try {
                hanoi(n, 'A', 'C', 'B'); // run recursive function
                System.out.println("n = " + n + " finished with " + counter + " moves"); // summary line
            } catch (StackOverflowError e) {
                System.out.println("Stack overflow at n = " + n); // show where recursion fails
                break; // stop testing
            }
        }
    }

    static void hanoi(int n, char from, char to, char temp) {
        if (n == 1) {
            counter++; // count move instead of printing
        } else {
            hanoi(n-1, from, temp, to);
            counter++;
            hanoi(n-1, temp, to, from);
        }
    }
}