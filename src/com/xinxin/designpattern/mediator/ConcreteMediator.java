package com.xinxin.designpattern.mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator{
    Map<String, Colleague> colleagueMap;
    Map<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        }
    }

    @Override
    public void getMsg(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine)colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((TV)colleagueMap.get(interMap.get("TV"))).startTv();
            } else if (stateChange == 1) {
                ((TV)colleagueMap.get(interMap.get("TV"))).startTv();
            }

        }  else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            //...
        }
    }

    @Override
    public void sndMsg(int stateChange) {

    }

}
