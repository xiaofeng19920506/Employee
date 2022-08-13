package com.example.employee;

import javafx.beans.property.SimpleStringProperty;

public class MemberModal {
    SimpleStringProperty Name;
    SimpleStringProperty Jobtitle;
    SimpleStringProperty Gender;
    SimpleStringProperty Phone;
    SimpleStringProperty ID;

    public MemberModal(String name, String jobtitle, String gender, String phone, String ID) {
        this.Name = new SimpleStringProperty(name);
        this.Jobtitle =  new SimpleStringProperty(jobtitle);
        this.Gender = new SimpleStringProperty(gender);
        this.Phone = new SimpleStringProperty(phone);
        this.ID = new SimpleStringProperty(ID);
    }

    public SimpleStringProperty nameProperty() {
        return Name;
    }

    public SimpleStringProperty jobtitleProperty() {
        return Jobtitle;
    }

    public SimpleStringProperty genderProperty() {
        return Gender;
    }

    public SimpleStringProperty phoneProperty() {
        return Phone;
    }

    public SimpleStringProperty IDProperty() {
        return ID;
    }



    public String toString() {
        return "";
    }

}
