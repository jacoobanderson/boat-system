package assignment4;

import java.util.ArrayList;

public class Member {
    private String name;
    private String email;
    private String uniqueId;
    private ArrayList <Boat> boats;

    public Member() {
    }

    public Member(String name, String email) {
        setName(name);
        setEmail(email);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
