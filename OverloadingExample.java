package com.selenium.practice;

public class OverloadingExample {

    public void display(int num) {
        System.out.println("Integer number: " + num);
    }

    public void display(double num) {
        System.out.println("Double number: " + num);
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        example.display(10);        // Calls display(int num)
        example.display(10.5);      // Calls display(double num)
    }
}
