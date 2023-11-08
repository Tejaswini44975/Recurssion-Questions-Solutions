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





