package net.kensaigm.dp;

public class DressingDecorator extends SandwichDecorator {


    public String make() {
        return customSandwich.make() + addDressing();
    }

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    private String addDressing() {
        return " + mustard";
    }
}
