/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeassignment;
import java.io.*;

/**
 *
 * @author annip
 */
class Employee implements Serializable {
    private int id;
    private String name;
    private double salary;
    // private int age;
    private String address;
    static int count;

    public Employee(){
        this.name = null;
        this.salary = 0.0;
        // this.age = 0;
        this.address = null;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    // public int getAge(){
    //     return this.age;
    // }

    public String getAddress(){
        return this.address;
    }

    public Employee(String name, double salary, String address){
        this.name = name;
        this.salary = salary;
        // this.age = age;
        this.address = address;
        this.id = ++count;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    // public void setAge(int age){
    //     this.age = age;
    // }
    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return "Id: " + this.id + "\nName: " + this.name  +  "\nSalary: " + this.salary + "\nAddress: "+ this.address;
    }
}