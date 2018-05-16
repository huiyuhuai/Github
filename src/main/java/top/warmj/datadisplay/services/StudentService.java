package top.warmj.datadisplay.services;

import top.warmj.datadisplay.domain.StudentDO;

import java.util.List;

/**
 * 学生信息列表
 * service层
 *
 * @author WarMj
 * @date 2018-05-16
 */
public interface StudentService {
  List<StudentDO> listStudent();
}
