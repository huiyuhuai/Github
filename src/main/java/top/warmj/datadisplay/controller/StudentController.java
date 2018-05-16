package top.warmj.datadisplay.controller;

import top.warmj.datadisplay.domain.StudentDO;
import top.warmj.datadisplay.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 学生信息列表
 * controller层
 *
 * @author WarMj
 * @date 2018-05-16
 */
@Controller
@RequestMapping("student")
public class StudentController {

  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;

  }

  /**
   * @return
   */
  @GetMapping("listStudent")
  @ResponseBody
  public List<StudentDO> listStudent() {
    return studentService.listStudent();
  }

}
