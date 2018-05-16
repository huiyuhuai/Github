package top.warmj.datadisplay.services.impl;

import top.warmj.datadisplay.dao.StudentDao;
import top.warmj.datadisplay.domain.StudentDO;
import top.warmj.datadisplay.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentDao studentDao;

  /**
   *
   * @return
   */
  @Override
  public List<StudentDO> listStudent() {
    return studentDao.listStudent();
  }
}
