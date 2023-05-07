package dev.hashnode.kuldeepsidhu;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int first = 10;
        int second = 20;
        int result = calculator.add(first, second);
        System.out.println(String.format("Addition of %d and %d is %d", first, second, result));
    }
}