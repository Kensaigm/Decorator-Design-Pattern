package net.kensaigm.dp;

public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new ProteinDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
