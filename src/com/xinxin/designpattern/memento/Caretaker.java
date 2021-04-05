package com.xinxin.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    public static void main(String[] args) {
        List<Memento> mementoList = new ArrayList<>();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        mementoList.add(originator.saveToMemento());
        originator.setState("State3");
        mementoList.add(originator.saveToMemento());
        originator.setState("State4");

        // rollback state to one fo state in mementoList
        originator.restoreFromMemento(mementoList.get(1));
    }

}
