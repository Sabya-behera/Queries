package com.example.demo13.Model;


import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "mob_no")
    private long mobNO;
    private String job;

    public User() {
    }

    public User(int id, String name, long mobNO, String job) {
        this.id = id;
        this.name = name;
        this.mobNO = mobNO;
        this.job = job;
    }

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

    public long getMobNO() {
        return mobNO;
    }

    public void setMobNO(long mobNO) {
        this.mobNO = mobNO;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobNO=" + mobNO +
                ", job='" + job + '\'' +
                '}';
    }
}
