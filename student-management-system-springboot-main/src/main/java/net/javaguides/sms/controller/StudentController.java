package net.javaguides.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;
	
	//@Autowired
	//private StudentRepository repo;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		
		
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		
		//repo.save(model);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setPolicy(student.getPolicy());
		existingStudent.setCompany(student.getCompany());
		existingStudent.setInflation(student.getInflation());
		existingStudent.setRerate_2010(student.getRerate_2010());
		existingStudent.setRerate_2013(student.getRerate_2013());
		existingStudent.setRerate_2013_supp(student.getRerate_2013());
		existingStudent.setRerate_2016(student.getRerate_2016());
		existingStudent.setRerate_2016_supp(student.getRerate_2016_supp());
		existingStudent.setRerate_2019(student.getRerate_2019());
		existingStudent.setRerate_2019_supp(student.getRerate_2019_supp());
		existingStudent.setDra_eligible(student.getDra_eligible());
		
		
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		
		//return repo.save(model);
		return "redirect:/students";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	
	
	
}
