package com.example.contactmanagerdemo.models;

public class Contact {
    public String id;
    public String name;
    public String email;
    public String mobile;
    public String contactPerson;

    public Contact(String id, String name, String email, String mobile, String contactPerson) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.contactPerson = contactPerson;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
}
