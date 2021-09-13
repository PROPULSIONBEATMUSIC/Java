package com.company;

public class Main {
    public static void main(String[] args) {
        Person Cat_1 = new Person();
        Cat_1.name = "Cat_1";
        Cat_1.weight = 10;
        Cat_1.age = 5;
        Cat_1.stage = "alive";
        Cat_1.fullness = 50;
        Cat_1.consumed = 0;
        Cat_1.count = 1;
        Cat_1.feed();
        Cat_1.consumed();
        Cat_1.displayInfo();

        Person Cat_2 = new Person();
        Cat_2.name = "Cat_2";
        Cat_2.weight = 22;
        Cat_2.age = 6;
        Cat_2.stage = "alive";
        Cat_2.fullness = 50;
        Cat_2.consumed = 0;
        Cat_2.count = 1;
        Cat_2.feed();
        Cat_2.consumed();
        Cat_2.displayInfo();

        Person Cat_3 = new Person();
        Cat_3.name = "Cat_3";
        Cat_3.weight = 7;
        Cat_3.age = 3;
        Cat_3.stage = "alive";
        Cat_3.fullness = 50;
        Cat_3.consumed = 0;
        Cat_3.count = 1;
        Cat_3.consumed();
        Cat_3.kill();
        Cat_3.displayInfo();

        Person Cat_4 = new Person();
        Cat_4.name = "Cat_4";
        Cat_4.weight = 8;
        Cat_4.age = 6;
        Cat_4.stage = "alive";
        Cat_4.fullness = 50;
        Cat_4.consumed = 0;
        Cat_4.count = 1;
        Cat_4.super_feed();
        Cat_4.consumed();
        Cat_4.pee();
        Cat_4.pee();
        Cat_4.pee();
        Cat_4.displayInfo();

        Person Cat_5 = new Person();
        Cat_5.name = "Cat_5";
        Cat_5.weight = 3;
        Cat_5.age = 2;
        Cat_5.stage = "alive";
        Cat_5.fullness = 50;
        Cat_5.consumed = 0;
        Cat_5.count = 1;
        Cat_5.consumed();
        Cat_5.pee();
        Cat_5.displayInfo();

    }
}

class Person {
    String name;
    int weight;
    int age;
    String stage;
    int fullness;
    int consumed;
    int count;

    void feed() {
        this.weight = weight + (weight/2);
        this.fullness += 50;
        if (fullness > 100 && weight >= 10) {
            System.out.printf(" (overfed!) ");
        }
    }
    void super_feed() {
        this.weight = weight += 150 ;
        this.fullness += 150;
        if (fullness >= 100 && weight >= 10) {
            System.out.printf(" (overfed!) ");
        }
    }
    void consumed(){
        this.consumed = (consumed += fullness);
        System.out.printf(" consumed: " + consumed + " ");
    }
    void pee(){
        this.weight = (weight -= (weight/10));
        System.out.printf("(Weight of this creature was decreased by 10 %%) " + "\n");
    }
    void kill() {
        this.stage = "DEAD! ";
        this.fullness = 0;
        this.count -= 1; 
    }
    void displayInfo() {
        System.out.printf("Name: " + name + " weight: " + weight + " age: " + age + " stage: " + stage + " fullness: "
        + fullness + " %% " + "count: " + count + "\n");
    }
}