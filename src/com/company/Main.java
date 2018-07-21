package com.company;

public class Main {



 public static void main(String[] args) {
    // write your code here
    //trisha trisha = new trisha();
    //  nipa nipa = new nipa();
    //tanji tanji = new tanji();

    //  trisha.sleep();
    //  trisha.works();

    // nipa.sleep();
    // nipa.works();

    // tanji.sleep();
    //  tanji.works();

    human nipa = new nipa();
    human onu = new human() {
        @Override
        void works() {
            System.out.println("clean");
        }
    };
    nipa.sleep();
    nipa.works();
    onu.sleep();
    onu.works();
}
}