package com.eyepoppy;

public class User {
    //Fields (attributes)
    public String name;//this.name refer to this name field

    public User(String name, int age){
        this.name = name;
    }

    //Methods
    public void sayHello(){
        System.out.println("-Hi, my name is " + name);
    }

}
