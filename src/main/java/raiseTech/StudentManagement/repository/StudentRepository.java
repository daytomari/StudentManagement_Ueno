package raiseTech.StudentManagement.repository;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import raiseTech.StudentManagement.Data.Student;


@Mapper
public interface StudentRepository<StudentsCourses> {

  @Select("SELECT * FROM students")
  List<Student> search();

  @Select("SELECT * FROM students_courses")
  List<raiseTech.StudentManagement.Data.StudentsCourses> searchStudentsCourses();

  @Insert("INSERT INTO students(name,kana_name,nickname,email,area,age,sex,remark,is_deleted)"+" VALUES(#{name},#{kanaName},#{nickname},#{email},#{area},#{age},#{sex},#{remark},false)")

  @Options(useGeneratedKeys = true,keyProperty ="id")
  void registerStudent(Student student);

  @Insert("INSERT INTO students_courses(students_id,course_name,course_start_dt, course_end_dt )"+"VALUES(#{studentId},#{courseName},#{courseStartAt},#{courseEndAt})"
      +"VALUES(#{studentId},#{courseName},#{course_start_dt},#{course_end_dt})")
  @Options(useGeneratedKeys = true, keyProperty = "id")
  void registerStudentsCourses(StudentsCourses studentsCourses);



  
  //エンジニアスタンダード10回、第７回演習課題
  /*@Select("SELECT * FROM student")
  student studentList();*/

  //エンジニアスタンダード18回、第10回演習課題
  @Select("SELECT * FROM student_Courses")
  List<raiseTech.StudentManagement.Data.StudentsCourses> seek();

  @Select("SELECT * FROM students_Courses")
  List<StudentsCourses> searchStudentCourses();



}









