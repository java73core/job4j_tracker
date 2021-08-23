package ru.job4j.tracker;

public class ExitAction implements UserAction{

    private Output out = null;
    public  ExitAction() {}

    public ExitAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Exit ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;

    }
}
