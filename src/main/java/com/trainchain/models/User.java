package com.trainchain.models;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    private String name;
    private String email;
    private String password;
    private Integer age;
    private Double height;
    private Double weight;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Train> trains = new ArrayList<>();

    public User() {
    }

    public User(Long id, String name, String email, Integer age, Double height, Double weight, List<Train> trains) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.trains = trains;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }
}
