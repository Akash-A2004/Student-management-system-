package com.example.NewProject.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NewProject.Model.StudentModel;
@Repository

public interface StudentRepository extends JpaRepository<StudentModel, Integer>{




    
}