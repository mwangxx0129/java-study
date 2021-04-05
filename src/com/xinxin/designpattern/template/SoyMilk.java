package com.xinxin.designpattern.template;

public abstract class SoyMilk {
    boolean hasCondiments;

    public final void make() {
        select();
        if (wantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    public void select() {
        System.out.println("step 1: choose fresh soy bean");
    }

    public boolean wantCondiments() {
        return true;
    }

    public abstract void addCondiments();

    public void soak() {
        System.out.println("step 3: soy bean and condiments soak, need 3 hours");
    }

    public void beat() {
        System.out.println("step 4: put all into blender ...");
    }


}
