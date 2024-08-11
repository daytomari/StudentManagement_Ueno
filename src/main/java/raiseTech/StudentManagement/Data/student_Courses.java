package raiseTech.StudentManagement.Data;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/*public class student {

  private String id;
  private String name;
  private String kananame;
  private String nickname;
  private String email;
  private String area;
  private int age;
  private String sex;


}*/
  public class student_Courses{

    private String id;
    private String studentId;
    private String courseName;
    private LocalDateTime courseStartAt;
    private LocalDateTime courseEndAt;

}
