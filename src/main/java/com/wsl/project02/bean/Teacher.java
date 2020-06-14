package com.wsl.project02.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@ConfigurationProperties(prefix = "teacher")
public class Teacher {

    private Integer id;
    private String name;
    private Address address;
    private List<Cls> clsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Cls> getClsList() {
        return clsList;
    }

    public void setClsList(List<Cls> clsList) {
        this.clsList = clsList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", clsList=" + clsList +
                '}';
    }
}
