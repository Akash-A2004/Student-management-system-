package com.example.NewProject.Service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.NewProject.Model.StudentModel;
import com.example.NewProject.Repository.StudentRepository;

@Service
public class StudentServiceimpl implements  StudentsInterface {
    @Autowired
    private StudentRepository repo;

    @Override
    public Optional<StudentModel> getbyid(int id) {
    try {
        Optional<StudentModel> opt = repo.findById(id);
        if (opt.isPresent()) {
            return opt;                
        }else{
            return Optional.empty();
        }
         } catch (Exception e) {
         return Optional.empty();        
         }
}
    @Override
    public String deleteById(int id ){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return "Student Id " + id + "Deleted Successfully ";
        } else{
            return "Student Id "  +  id   +  "Not Founded!";
        }
}
    @Override
    public String deleteall(){
        repo.deleteAll();
        return"All Data Deleted Successfully";
}
    @Override
    public List<StudentModel> getAllData() {
    List<StudentModel> alldata = repo.findAll();
    if (alldata.isEmpty()) {
        throw new RuntimeException("Database is Empty");
    }
    return alldata;
}
     @Override
    public String save(StudentModel student) {
        repo.save(student);
        return "Student saved successfully";
    }

    @Override
    public StudentModel getById(int id) {
        Optional<StudentModel> student =repo.findById(id);
        return student.orElse(null);
    }
 
        
    }