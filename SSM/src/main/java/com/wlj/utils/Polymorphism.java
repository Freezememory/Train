package com.wlj.utils;

public class Polymorphism {
    public static  void  main(String [] args){
        Cat  c = new Cat("xiaohuang","blue");
        Dog  d = new Dog("xioahei","black");
        Lady l1 = new Lady("xiaowang",c);
        Lady l2 = new Lady("xiaoli",d);
        l1.MyPetEnjoy();
        l2.MyPetEnjoy();

    }


}


class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }
    public  void enjoy(){
        System.out.println("voice...");
    }
}


class Cat extends  Animal{
    private  String eyeColor;
    Cat(String n,String c){
        super(n);
        eyeColor =c;
    }

    @Override
    public void enjoy() {
        System.out.println("Cat' voice...");
    }
}

class Dog extends  Animal{
    private  String  furColor;
    Dog(String n, String c){
        super(n);
        furColor =c;
    }
    public void enjoy(){
        System.out.println("Dog' voice....");
    }
}

class  Lady{
    private String name;
    private Animal pet;
    Lady(String name,Animal pet){
        this.name = name;
        this.pet = pet;
    }

    public void MyPetEnjoy() {
     pet.enjoy();
    }
}
