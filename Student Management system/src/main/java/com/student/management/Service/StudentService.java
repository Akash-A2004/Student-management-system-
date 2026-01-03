package com.student.management.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.management.Entity.StudentEntity;

@Service
public interface StudentService {
//Post
    public StudentEntity addDetails(StudentEntity student);
//Get-All    
    public List<StudentEntity> getDetailsAll();
//Get-Id
    public StudentEntity getEmployeeById(long id);
//Update-Id
    public StudentEntity updateStudentId(long id,StudentEntity student);
//delete-Id
    public String deleteStudentById(long id);

}
