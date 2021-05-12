/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.JobManagementSystem.Controller;

import com.example.JobManagementSystem.Model.Job;
import com.example.JobManagementSystem.Model.Department;
import com.example.JobManagementSystem.Repository.JobRepository;
import com.example.JobManagementSystem.Repository.DepartmentRepository;

import java.util.List;
import java.util.Optional;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Shiva Rama Krishna Vodnala
 */
@Controller
@EnableAutoConfiguration
public class JMScontroller {

    ModelAndView mv = new ModelAndView();

    @Autowired
    DepartmentRepository depRepo;

    @Autowired
    JobRepository jobRepo;

    @RequestMapping("/addEmpDining")
    public ModelAndView department() {
        //Add data into dining table and update the table;
        mv.setViewName("dining");
        return mv;
    }

    @RequestMapping("/")
    public ModelAndView home() {
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("departments")
    public ModelAndView departments() {
        mv.setViewName("departments");
        return mv;
    }

    @RequestMapping("dining")
    public ModelAndView dining() {
        mv.setViewName("campusDining");
        return mv;
    }
}
