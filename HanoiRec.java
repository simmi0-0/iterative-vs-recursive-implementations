public class HanoiRec {
    public static void main(String[] args) {
        int n = 3; // number of disks we want to move
        hanoi(n, 'A', 'C', 'B'); // call the function with rods A (source), C (destination), B (helper)
    }

    static void hanoi(int n, char from, char to, char temp) {
        if (n == 1) { // if only one disk left
            System.out.println("move disk " + n + " from " + from + " to " + to); // just move it directly
        } else { 
            hanoi(n-1, from, temp, to); // move n-1 disks from source to helper rod
            System.out.println("move disk " + n + " from " + from + " to " + to); // move the biggest disk to destination
            hanoi(n-1, temp, to, from); // move the n-1 disks from helper to destination
        }
    }
}