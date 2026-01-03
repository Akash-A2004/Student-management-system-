
package com.example.NewProject.Service;

import java.util.List;
import java.util.Optional;

import com.example.NewProject.Model.StudentModel;

public interface StudentsInterface {

    Optional<StudentModel> getbyid(int id);
    
    String deleteById(int id);

    String deleteall();

    List<StudentModel> getAllData();

    String save(StudentModel student);



    StudentModel getById(int id);



    

    


   

}

