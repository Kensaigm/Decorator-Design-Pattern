package net.kensaigm.dp;

public class ProteinDecorator extends SandwichDecorator {

    public String make() {
        return customSandwich.make() + addProtein();
    }

    public ProteinDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    private String addProtein() {
        return " + turkey";
    }
}
