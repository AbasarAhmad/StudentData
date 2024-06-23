package com.Sheikh.JPAdemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // it tells that it can be created as table
@Table(name = "User_info") // IT's means table name will beUser_info , not User
public class User {// Table name will be User
    @Id  // It tells that rollNo is a primary key
            @Column(name = "id") // here i have change the column name as id  from rollNo , its depened upon me
    int rollNo;

    String name;

    int age;
    String mobNo;

    public User()
    {

    }
    public User(int rollNo, String name, int age, String mobNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}