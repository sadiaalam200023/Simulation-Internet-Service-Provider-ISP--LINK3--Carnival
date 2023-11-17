/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProtikBarua;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public abstract class User implements Serializable {
    protected int id;
    protected String name, gender, email, userType;
    protected LocalDate datehOfBirth;
    protected long contactNo;

    public User(int id, String name, String gender, String email, String userType, LocalDate datehOfBirth, long contactNo) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.userType = userType;
        this.datehOfBirth = datehOfBirth;
        this.contactNo = contactNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public LocalDate getDatehOfBirth() {
        return datehOfBirth;
    }

    public void setDatehOfBirth(LocalDate datehOfBirth) {
        this.datehOfBirth = datehOfBirth;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
    
    public void loginToTheDashboard(){
        
    }
    
    public void changePassword(){
        
    }
    
    protected final int totalClient(){
        
        return 0;
    }


    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", userType=" + userType + ", datehOfBirth=" + datehOfBirth + ", contactNo=" + contactNo + '}';
    }
    
}
