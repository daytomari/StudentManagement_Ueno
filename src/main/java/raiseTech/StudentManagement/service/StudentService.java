package raiseTech.StudentManagement.service;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import raiseTech.StudentManagement.Data.Student;
import raiseTech.StudentManagement.Data.StudentsCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raiseTech.StudentManagement.repository.StudentRepository;
import raiseTech.StudentManagement.domain.StudentDetail;

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

  public List<StudentsCourses> searchStudentCourseList() {
    return repository.searchStudentsCourses();

  }

  @Transactional
  public void registerStudent(StudentDetail studentDetail) {
    repository.registerStudent(studentDetail.getStudent());
    //TODO:コース情報処理も行う。
    for (StudentsCourses studentsCourses : studentDetail.getStudentsCourses()) {
      studentsCourses.setStudentId(studentDetail.getStudent().getId());
      studentsCourses.setCourseStartDt(LocalDateTime.now());
      studentsCourses.setCourseEndDt(LocalDateTime.now().plusYears(1));
      repository.registerStudentsCourses(studentsCourses);
//      repository.registerStudentsCourses(studentDetail.getStudentsCourses());
    }

  }

}






