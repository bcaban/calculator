package com.calculator;

public class Calculator {
    int a;
    int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addAtoB() {
        return a + b;
    }

    public int subtractBFromA() {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {

        Calculator calculator = new Calculator(6, 4);

        int resultOfAdd = calculator.addAtoB();
        int resultOfSubtract = calculator.subtractBFromA();

        System.out.println("Addition result = " + resultOfAdd + "\n" + "Subtraction result = " + resultOfSubtract);

    }
}
