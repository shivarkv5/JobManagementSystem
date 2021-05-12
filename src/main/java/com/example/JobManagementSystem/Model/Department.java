/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.JobManagementSystem.Model;

//import com.example.JobManagementSystem.Repository.DepartmentRepository;
import javax.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Shiva Rama Krishna Vodnala
 */
@Entity
public class Department {
    
   
    
    public int depID;
    public String depName;
    public String depLocation;
    public int empCount;
    public int wDays;
    
    @Autowired
    @Qualifier("job")
    public Job job;
    

    public int getDepID() {
        return depID;
    }

    public void setDepID(int depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepLocation() {
        return depLocation;
    }

    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }

    public int getEmpCount() {
        return empCount;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job jb) {
        this.job = jb;
    }
    
            
    public void compile(){
        System.out.println("Inside Department Class");
        
    }
            
    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }
    
    
}
