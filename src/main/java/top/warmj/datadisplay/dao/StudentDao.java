package top.warmj.datadisplay.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.warmj.datadisplay.domain.StudentDO;

import java.util.List;

/**
 * 学生信息列表
 * dao层
 *
 * @author WarMj
 * @date 2018-05-16
 */
@Mapper
@Repository
public interface StudentDao {
  /**
   * @return
   */
  List<StudentDO> listStudent();

}
