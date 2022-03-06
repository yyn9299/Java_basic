package com.yyn.abstric;

public abstract class Sharp {
    {
        System.out.println("执行Sharp的初始化模块..");
    }
    private String color;
    public abstract double calPerimter();
    public abstract String getType();
    public Sharp(){}
    public Sharp(String color)
    {
        System.out.println("执行Shape的构造器...");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
