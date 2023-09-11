public class ScoreChecker {
    public static void main(String[] args) {
        testCheckScore(2.15);
        testCheckScore(50);
        testCheckScore(95.02);
        testCheckScore(100.01);
    }

    public static void checkScore(double score) {
        if (score > 0 && score <= 50.00) {
            System.out.println("Average score");
        } else if (score > 50.00 && score <= 100.00) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }

    public static void testCheckScore(double score) {
        System.out.println("Checking score: " + score);
        try {
            checkScore(score);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

