package com.example.myclasssju;

public class CustomerModel {

    //these are classes
    private int id;
    private String name;
    private int age;
    private boolean isActive;

    //construcors


    public CustomerModel(int id,String name,int age,boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.id = id;
    }
    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    //toString is nessesary for printing the contents of a class objct

    @Override
    public String toString() {
        return "CustomerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
}
