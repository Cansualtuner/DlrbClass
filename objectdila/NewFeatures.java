package org.javaturk.oopj.objectdila;

import java.util.ArrayList;
import java.util.List;

public class NewFeatures {

    public void static main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new  User(1,"Aleyna"));
        users.add(new  User(2,"Ahmet"));
        users.add(new  User(3,"Cansu"));
        users.add(new  User(4,"Zehra"));
        users.add(new  User(5,"İrem"));
        users.add(new  User(6,"Erdem"));
        users.add(new  User(7,"ALi"));
        users.stream().forEach(user -> System.out.println(user.toString()));

    }
class User{
        public int id;
        public String name;

        public User(int id, String name){
            this.id = id;
            this.name = name;
        }
        public String toString(){
            return "User [id=" + id + ",name="+ name +"]";

        }
        public void talk(){
            System.out.println("Hi I am" +this.name);

        }
    }
}

