public class HanoiIter {
    public static void main(String[] args) {
        int n = 3; // number of disks
        tower(n, 'A', 'C', 'B'); // call the function with rods A (source), C (destination), B (helper)
    }

    static void tower(int n, char from, char to, char aux) {
        int moves = (int)Math.pow(2, n) - 1; // total moves needed is 2^n - 1
        if (n % 2 == 0) { // if number of disks is even
            char tmp = to; // swap destination and helper
            to = aux;
            aux = tmp;
        }
        for (int i = 1; i <= moves; i++) { // loop through all moves
            if (i % 3 == 1) { // first type of move
                System.out.println("move something between " + from + " and " + to); // print move
            } else if (i % 3 == 2) { // second type of move
                System.out.println("move something between " + from + " and " + aux); // print move
            } else { // third type of move
                System.out.println("move something between " + aux + " and " + to); // print move
            }
        }
    }
}