package raiseTech.StudentManagement.domain;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import raiseTech.StudentManagement.data.Student;
import raiseTech.StudentManagement.data.StudentsCourses;

@Getter
@Setter
public class StudentDetail {

  private Student student;
  private List<StudentsCourses> studentsCourses;





}
