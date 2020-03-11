package com.example.livegoods_rabbitmq_service.service;

class Dervied extends Base {


    private String name = "Java3y";


    public Dervied() {

        tellName2();

        printName2();

    }


    public void tellName2() {

        System.out.println("Dervied tell name: " + name);

    }


    public void printName2() {

        System.out.println("Dervied print name: " + name);

    }


    public static void main(String[] args) {


        new Dervied();

    }

}


class Base {


    private String name = "公众号";


    public Base() {

        tellName();

        printName();

    }


    public void tellName() {
        Object obj= new Object();

        System.out.println("Base tell name: " + name);

    }


    public void printName() {

        System.out.println("Base print name: " + name);

    }

}