package com.jad;

import java.util.ArrayList;

public class Foo {

    private final ArrayList<Baz> bazs;
    private final ArrayList<Grault> graults;
    private final Bar bar;
    private final Qux qux;
    private Corge corge;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.graults = new ArrayList<>();
        this.qux = new Qux();
        this.corge = new Corge(this);
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
        if (this.corge != null) {
            this.corge.setFoo(null);
        }
        this.corge = corge;
        if (this.corge.getFoo() != this) {
            this.corge.setFoo(this);
        }
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
