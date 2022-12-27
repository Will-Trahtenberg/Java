package com.company;

public class Main {

    public static void main(String[] args) {
    com.company.Phone phone = new com.company.Phone();
        phone.number = 12;
        phone.model = "iPhone";
        phone.weight = 500.50;
        System.out.print("Phone: " + phone.model +'\n'+"number "+ phone.number +'\n'+"weight "+phone.weight+'\n');
        com.company.Phone.receiveCall();
        com.company.Phone.getNumber();

    }
}
