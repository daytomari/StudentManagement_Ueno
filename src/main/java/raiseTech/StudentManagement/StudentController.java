/*package raiseTech.StudentManagement;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raiseTech.StudentManagement.service.StudentService;
import raiseTech.StudentManagement.service.Student_Courses;


@RestController
public class StudentController {

  private StudentService service;

  @Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }

  @GetMapping("/StudentList")
  public <Student> List<Student> getStudentList() {
    return service.searchStudentList();

  }

  @GetMapping("/StudentCourseList")
  public List<Student_Courses> getStudentCourseList() {
    return service.searchStudentCourseList();

  }

}*/

