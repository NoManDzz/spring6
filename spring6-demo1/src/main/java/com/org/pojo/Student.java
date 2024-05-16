package com.org.pojo;

import java.util.Date;

public class Student {
    private Date date;

    @Override
    public String toString() {
        return "Student{" +
                "date=" + date +
                '}';
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
