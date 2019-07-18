package startech.calendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import startech.calendar.persistence.Student;
import startech.calendar.service.StudentService;

import java.util.List;

@RestController
@RequestMapping(path = "student/")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping(path = "all-students", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping(path = "get-by-id", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Student getStudentById(@RequestParam("id") final Long id) {
        return service.getStudentById(id);
    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void createStudent(@RequestBody List<Student> student) {
        service.save(student);
    }


}
