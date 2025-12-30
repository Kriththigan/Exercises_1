public class Calculator {
    int x = 10;
    int y = 20;

    public static void main(String[] args){
        Calculator calc = new Calculator();
        int sum = calc.x + calc.y;
        System.out.println(sum);
    }
}
