package com.org.pojo;

public class Husband {
    private String name;
    private Wife wife;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
