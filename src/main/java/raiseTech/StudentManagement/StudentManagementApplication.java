package raiseTech.StudentManagement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raiseTech.StudentManagement.Data.StudentRepository;
import raiseTech.StudentManagement.Data.student_Courses;

@SpringBootApplication
@RestController
/*public class StudentManagementApplication {

	@Autowired
	private StudentRepository repository;


	public static void main(String[] args) {
		//localhost:8080
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@GetMapping("/studentList")
	public List<student> getStudentList() {
		return repository.search();

	}

	}*/




	//エンジニアスタンダード10回、第７回演習課題（studentの情報を出力してみましょう)
	/*@GetMapping("/list")
	public String getStudent() {
		student student = repository.studentList();
		return student.getName() + " " + student.getAge() + "歳";
	}


}*/
	//エンジニアスタンダード第18回、第10回演習課題（student_coursesを出力してみましょう）
	public class StudentManagementApplication {

		@Autowired
		private StudentRepository repository;


		public static void main(String[] args) {
			//localhost:8080
			SpringApplication.run(StudentManagementApplication.class, args);
		}

		@GetMapping("/student_courses")
		public List<student_Courses> getStudent_courses() {
			return repository.seek();
		}
	}
