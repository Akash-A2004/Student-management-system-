package com.student.management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.Entity.StudentEntity;
import com.student.management.Service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private StudentService stu;

// PostMapping-create new data
    @PostMapping
    public StudentEntity addStudent(@RequestBody StudentEntity user){
        return stu.addDetails(user);
    }
// GetMapping-All-view students data all
    @GetMapping("/all")
    public List<StudentEntity> getAll(){
        return stu.getDetailsAll();
    }
// GetMapping-Id-Specific student data 
    @GetMapping("/{id}")
    public StudentEntity getById(@PathVariable long id){
        return stu.getEmployeeById(id);
    }
//PutMapping-update student data by id   
    @PutMapping("/{id}")
    public StudentEntity updateStudent(@PathVariable long id,@RequestBody StudentEntity user){
        return stu.updateStudentId(id,user);
    }
//DeleteMapping-delete student data by id   
    @DeleteMapping("/{id}")
    public String deleteStuById(@PathVariable long id){
     return stu.deleteStudentById(id);
    }
}
