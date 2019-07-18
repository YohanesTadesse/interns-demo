package startech.calendar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import startech.calendar.persistence.Student;
import startech.calendar.persistence.StudentPersistence;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {
    @Autowired
    private StudentPersistence persistence;


    public List<Student> getAllStudents() {
        return persistence.findAll();
    }


    public Student getStudentById(final Long id) {
        final Optional<Student> student = persistence.findById(id);
        return student.orElse(null);
    }

    public void save(final List<Student> students) {

        students.forEach(x-> persistence.save(x));

    }
}
