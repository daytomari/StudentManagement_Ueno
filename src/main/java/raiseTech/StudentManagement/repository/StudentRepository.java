package raiseTech.StudentManagement.repository;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import raiseTech.StudentManagement.data.Student;
import raiseTech.StudentManagement.data.StudentsCourses;


@Mapper
public interface StudentRepository{

  @Select("SELECT * FROM students")
  List<Student> search();

  @Select("SELECT * FROM students WHERE id = #{id}")
  Student searchStudent(String id);

  @Select("SELECT * FROM students_courses")
  List<StudentsCourses> searchStudentsCoursesList();

  @Select("SELECT * FROM students_courses WHERE students_id #{studentId]")
  List<StudentsCourses> searchStudentsCourses(String studentId);

  @Insert("INSERT INTO students(name,kana_name,nickname,email,area,age,sex,remark,is_deleted)"+" VALUES(#{name},#{kanaName},#{nickname},#{email},#{area},#{age},#{sex},#{remark},false)")

  @Options(useGeneratedKeys = true,keyProperty ="id")
  void registerStudent(Student student);

  @Insert("INSERT INTO students_courses(students_id,course_name,course_start_dt, course_end_dt )"+" VALUES(#{studentId},#{courseName},#{courseStartAt},#{courseEndAt})")
  @Options(useGeneratedKeys = true, keyProperty = "id")
  void registerStudentsCourses(StudentsCourses studentsCourses);


  @Update("UPDATE students SET(name = #{name},kana_name= #{kanaName},nickname= #{nickname},email= #{email},area = #{area}" +
      ",age = #{age},sex = #{sex},remark = #{remark},is_deleted = #{is_deleted} WHERE id = #{id}")
  void updateStudent(Student student);


  @Update("UPDATE students_courses SET (course_name = #{courseName}) WHERE = #{id}")

  void updateStudentsCourses(StudentsCourses studentsCourses);



  //エンジニアスタンダード10回、第７回演習課題
  /*@Select("SELECT * FROM student")
  student studentList();*/

  //エンジニアスタンダード18回、第10回演習課題
  @Select("SELECT * FROM student_Courses")
  List<StudentsCourses> seek();

  @Select("SELECT * FROM students_Courses")
  List<StudentsCourses> searchStudentCourses();



}









