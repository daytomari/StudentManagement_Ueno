package raiseTech.StudentManagement.domain;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import raiseTech.StudentManagement.Data.Student;
import raiseTech.StudentManagement.Data.studentsCourses;

@Getter
@Setter
public class StudentDetail {

  private Student student;
  private List<studentsCourses> studentsCourses;

}
