package com.yyn.abstric;

public class Triangle extends Sharp{
    private double a;
    private double b;
    private double c;
    public Triangle(String color,double a,double b,double c){
        super(color);
        this.setSide(a,b,c);
    }

    private void setSide(double a, double b, double c) {
        if (a >= b + c || b >= a+c || c >=a+b){
            System.out.println("两边之和需要大于第三边!");
            return;
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    //计算周长
    public double calPerimter() {
        return a + b + c;
    }

    @Override
    public String getType() {
        return "三角形!";
    }

    public void sys(){
        //aaa
        System.out.println("11");
    }


    public static void main(String[] args) {
        Sharp s1 = new Triangle("黑色",3,4,5);
        System.out.println(s1.getType());
        System.out.println(s1.calPerimter());
    }
}
