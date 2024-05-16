package com.org.pojo;

import java.util.*;

public class User {
    private String name;
    private String password;
    private Integer id;
    private String[] hobby;
    private Map<String, Object> phones;

    // 属性类 本质上是一个map集合
    private Properties properties;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", hobby=" + Arrays.toString(hobby) +
                ", phones=" + phones +
                ", properties=" + properties +
                ", people=" + Arrays.toString(people) +
                ", names=" + names +
                ", address=" + address +
                ", userClass=" + userClass +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, Object> getPhones() {
        return phones;
    }

    public void setPhones(Map<String, Object> phones) {
        this.phones = phones;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    private Person[] people;
    private List<String> names;
    private Set<String> address;

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    private UserClass userClass;

    public UserClass getUserClass() {
        return userClass;
    }

    public void setUserClass(UserClass userClass) {
        this.userClass = userClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
