public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean TFizz = (i - 3) / 3 * 3 == (i - 3);
            boolean FBuzz = (i - 5) / 5 * 5 == (i - 5);

            if (TFizz && FBuzz) {
                System.out.println("FizzBuzz");
            } else if (TFizz) {
                System.out.println("Fizz");
            } else if (FBuzz) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
