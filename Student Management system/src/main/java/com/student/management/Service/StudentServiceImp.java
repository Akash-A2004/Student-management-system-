package com.student.management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.Entity.StudentEntity;
import com.student.management.Exception.ResourceRnException;
import com.student.management.Repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentRepository repo;

    @Override
    //Post
    public StudentEntity addDetails(StudentEntity student) {
    if(student.getName()==null || student.getEmail()==null || student.getAge()<=0 ||student.getCourse()==null){
    throw new ResourceRnException("Name,Email,and Address cannot be empty or Should be Enter Age than Zero");}
    return repo.save(student);
      }

    @Override
    //GetMapping-All
    public List<StudentEntity> getDetailsAll() {
    return repo.findAll();
    }

    @Override
    //GetMapping-Id
    public StudentEntity getEmployeeById(long id) {
    return repo.findById(id).orElseThrow(()-> new ResourceRnException("Id not found with this ID: "+id));
    }
    
    @Override
    //PutMapping-Id
    public StudentEntity updateStudentId(long id,StudentEntity student) {
    StudentEntity obj1=repo.findById(id).orElseThrow(()-> new ResourceRnException("Id not found with this ID: "+id));

      if(student.getName() !=null){
        obj1.setName(student.getName());
      }
      if(student.getEmail() !=null){
        obj1.setEmail(student.getEmail());
      }
      if(student.getCourse() !=null){
        obj1.setCourse(student.getCourse());
      }
      if(student.getAge() !=0){
        obj1.setAge(student.getAge());
      }
      return repo.save(obj1);
    }

    @Override
    //DeleteMapping-Id
    public String deleteStudentById(long id) {
    repo.findById(id).orElseThrow(()-> new ResourceRnException("Id not found with this ID: "+id));
    repo.deleteById(id);
    return "Id deleted successfully ";
    }



}
