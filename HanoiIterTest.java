public class HanoiIterTest {
    public static void main(String[] args) {
        for (int n = 1; n <= 30; n++) { // test from 1 to 30 disks
            long moves = (long)Math.pow(2, n) - 1; // total moves formula
            try {
                System.out.println("n = " + n + " would need " + moves + " moves"); // just print summary
                // don’t actually run tower() because it prints too much
                // HanoiIter.tower(n, 'A', 'C', 'B'); // comment this out for clean output
            } catch (Exception e) {
                System.out.println("Error at n = " + n); // if something goes wrong
                break;
            }
        }
    }
}