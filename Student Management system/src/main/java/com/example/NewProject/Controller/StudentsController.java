
package com.example.NewProject.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.NewProject.Model.StudentModel;
import com.example.NewProject.Repository.StudentRepository;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5173")
public class StudentsController {

    @Autowired
    private StudentRepository demo;

    @GetMapping("/{id}")
    public List<StudentModel> newdata(@PathVariable int id) {
        return (List<StudentModel>) demo.getById(id);
    }

    @GetMapping("/all")
    public List<StudentModel>getAllStudentModels(){
        return demo.findAll();
    }
    
    @PostMapping("/post")
    public String newdatas(@RequestBody StudentModel student) {
       demo.save(student);
        return"Posted Successsfully";
    }

    @DeleteMapping("/delete/{id}")
    public String datanew(@PathVariable int id ){
        demo.deleteById(id);
        return "Deleted Succesfully";
    }
}

