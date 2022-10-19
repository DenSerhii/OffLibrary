package com.company;

public class EmailAddress {
    private String email; //електронний адрес
    private String someData; //дод. інформація про користувача

    public EmailAddress(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getSomeData() {
        return someData;
    }

    public void setSomeData(String someData) {
        this.someData = someData;
    }


}
