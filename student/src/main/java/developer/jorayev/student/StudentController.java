package developer.jorayev.student;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Student student){
        service.saveStudent(student);
    }


    @GetMapping("/all")
    public ResponseEntity<List<Student>> findAllStudents(){
        return ResponseEntity.ok(service.findAllStudent());
    }

    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<Student>> findAllStudents(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(service.findAllStudentBySchools(schoolId));
    }

}
