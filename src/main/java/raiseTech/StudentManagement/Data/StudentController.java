package raiseTech.StudentManagement.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import raiseTech.StudentManagement.Data.Student;
import raiseTech.StudentManagement.Data.studentsCourses;
import raiseTech.StudentManagement.controller.StudentConverter;
import raiseTech.StudentManagement.domain.StudentDetail;
import raiseTech.StudentManagement.service.StudentService;

@Controller
public class StudentController {

  private StudentService service;
  private StudentConverter converter;


  @Autowired
  public StudentController(StudentService service, StudentConverter converter) {
    this.service = service;
    this.converter = converter;
  }

  @GetMapping("/studentList")
  public String getStudentList(Model model) {
    List<Student> students = service.seachStudentList();
    List<studentsCourses> studentsCourses = service.searchStudentCourseList();

    model.addAttribute("studentList", converter.convertStudentDetails(students, studentsCourses));
    return "studentList";
  }


  @GetMapping("/studentCoursesList")
  public List<studentsCourses> getStudentsCourseList() {
    return service.searchStudentCourseList();
  }
  @GetMapping("/newStudent")
  public String newStudent(Model model){
    model.addAttribute("studentDetail",new StudentDetail());
    return "registerStudent";
  }

  @PostMapping("/registerStudent")
  public String registerStudent(@ModelAttribute StudentDetail studentDetail, BindingResult result) {
    if(result.hasErrors()){
      return "registerStudent";
    }
    System.out.println(studentDetail.getStudent().getName() + "さんが新規受講生として登録されました");
    return "redirect:/studentList";
  }

}
