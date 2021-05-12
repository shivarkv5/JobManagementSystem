/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.JobManagementSystem.Repository;

import com.example.JobManagementSystem.Model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shiva Rama Krishna Vodnala
 */

@Repository
public interface DepartmentRepository  extends CrudRepository<Department, Object>{
    
}
