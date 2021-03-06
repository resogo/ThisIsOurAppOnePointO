package com.example.thisisourapponepointo;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class User extends RealmObject {

    @PrimaryKey
    private String email;
    private String firstName;
    private String lastName;
    private String major;
    private byte[] QRcode;
    private int attendance;
    boolean isEBoard = false;

    public void setEBoard(boolean EBoard) {
        isEBoard = EBoard;
    }

    public boolean isEBoard() {
        return isEBoard;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte[] getQRcode() {
        return QRcode;
    }

    public void setQRcode(byte[] QRcode) {
        this.QRcode = QRcode;
    }
}
