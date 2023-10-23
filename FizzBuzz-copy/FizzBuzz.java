public class FizzBuzz
{
    public void run() {
         for(int i = 0; i <= 100; i = i + 3, i = i + 2) {
             System.out.println(i + "This code is working");
             System.out.println((i+1) + "This code is also working");
             System.out.println((i+2) + "This code also ALSO works");
    }
}
public static void main(String[] args)
{
    FizzBuzz hw = new FizzBuzz();
    hw.run();
}
}
