package developer.jorayev.school;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school){
        service.saveSchool(school);
    }


    @GetMapping("/all")
    public ResponseEntity<List<School>> findAllStudents(){
        return ResponseEntity.ok(service.findAllSchool());
    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllStudents(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(service.findSchoolsWithStudents(schoolId));
    }
}
