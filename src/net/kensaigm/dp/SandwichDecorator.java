package net.kensaigm.dp;

public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    @Override
    public String make() {
        return null;
    }

    public SandwichDecorator(Sandwich customSandwich){
        this.customSandwich = customSandwich;
    }
}
