package com.jad;

import java.util.ArrayList;

public class Foo {

    private final ArrayList<Baz> bazs;
    private final ArrayList<Grault> graults;
    private Bar bar;
    private Qux qux;
    private Corge corge;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.graults = new ArrayList<>();
        this.qux = new Qux();
    }

    public Bar getBar() {
        return this.bar;
    }

    public ArrayList<Baz> getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
        corge.setFoo(this);
    }

    public ArrayList<Grault> getGraults() {
        return this.graults;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }
}
