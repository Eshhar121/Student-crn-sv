package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import edu.icet.service.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    final StudentService service;

    @GetMapping
    public Map getStudent(){
        return service.getStudent();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id){
        service.deleteStudentById(id);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @GetMapping("/find-by-name/{name}")
    public List<Student> findByName(@PathVariable String name){
        return service.findByName(name);
    }
}
