package com.insightfullogic.java8.examples.chapter8.command;

import java.util.ArrayList;
import java.util.List;

// BEGIN Macro
public class Macro {

    private final List<Action> actions;

    public Macro() {
        actions = new ArrayList<>();
    }

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }

    public static void main(String[] args) {
        Editor e = new Editor() {
            @Override
            public void save() {

            }

            @Override
            public void open() {

            }

            @Override
            public void close() {

            }
        };
        Macro m = new Macro();
        m.record(e::close);
    }

}
// END Macro
