package raiseTech.StudentManagement.Data;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface StudentRepository<StudentsCourses> {

  @Select("SELECT * FROM students")
  List<Student> search();

  @Select("SELECT * FROM students_courses")
  List<studentsCourses> searchStudentsCourses();



  
  //エンジニアスタンダード10回、第７回演習課題
  /*@Select("SELECT * FROM student")
  student studentList();*/

  //エンジニアスタンダード18回、第10回演習課題
  @Select("SELECT * FROM student_Courses")
  List<studentsCourses> seek();

  @Select("SELECT * FROM students_Courses")
  List<StudentsCourses> searchStudentCourses();


}









