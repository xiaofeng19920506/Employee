package com.example.employee;

public class MemberModal {
    String Name;
    String Jobtitle;
    String Gender;
    String Phone;
    String ID;

    public MemberModal(String name, String jobtitle, String gender, String phone, String ID) {
        this.Name = name;
        this.Jobtitle = jobtitle;
        this.Gender = gender;
        this.Phone = phone;
        this.ID = ID;
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

    public String toString() {
        return "";
    }

}
