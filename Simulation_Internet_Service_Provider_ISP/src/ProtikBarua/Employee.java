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
public abstract class Employee extends User implements Serializable {
    protected LocalDate dateOoJoin;
    protected float salary;
    protected String department, designation;

    public Employee(LocalDate dateOoJoin, float salary, String department, String designation, int id, String name, String gender, String email, String userType, LocalDate datehOfBirth, long contactNo) {
        super(id, name, gender, email, userType, datehOfBirth, contactNo);
        this.dateOoJoin = dateOoJoin;
        this.salary = salary;
        this.department = department;
        this.designation = designation;
    }
    
    protected abstract void applyForLeave();
    
}
