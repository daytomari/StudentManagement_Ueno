package raiseTech.StudentManagement.service;

import java.util.List;
import raiseTech.StudentManagement.Data.Student;
import raiseTech.StudentManagement.Data.studentsCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raiseTech.StudentManagement.Data.StudentRepository;

@Service
public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;

  }

  public List<Student> seachStudentList() {
    return repository.search();
  }

  public List<studentsCourses> searchStudentCourseList(){
    return repository.searchStudentsCourses();

  }
}

