package raiseTech.StudentManagement.Data;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

  public class studentsCourses {

    private String id;
    private String studentsId;
    private String courseName;
    private LocalDateTime courseStartDt;
    private LocalDateTime courseEndDt;

}
