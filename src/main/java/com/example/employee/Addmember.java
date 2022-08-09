package com.example.employee;

public class Addmember {
    String Name;
    String Jobtitle;
    String Gender;
    String Phone;
    String ID;

    public Addmember(String name, String jobtitle, String gender, String phone, String ID) {
        Name = new String(name);
        Jobtitle = new String(jobtitle);
        Gender = new String(gender);
        Phone = new String(phone);
        this.ID = new String(ID);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJobtitle() {
        return Jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        Jobtitle = jobtitle;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
