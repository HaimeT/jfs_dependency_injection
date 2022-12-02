package com.example.jfs_dependency_injection;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    public Student(Long id, String name, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }
    public void setId(long id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setDob(LocalDate dob)
    {
        this.dob = dob;
    }

    public long setId()
    {
        return id;
    }
    public String getName()
    {
       return name;
    }
    public String getEmail()
    {
       return email;
    }
    public LocalDate getDob() {
        return dob;
    }
}
