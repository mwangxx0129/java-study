package com.xinxin.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Originator: Setting state to " + state);
    }

    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {

        this.state = memento.getSavedState();
        System.out.println("Originator: Restore Memento to" + this.state);
    }

}
