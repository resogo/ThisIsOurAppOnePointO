package com.example.thisisourapponepointo;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class EboardInfo extends RealmObject {

    @PrimaryKey
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
