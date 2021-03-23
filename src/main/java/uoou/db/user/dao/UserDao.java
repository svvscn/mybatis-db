package uoou.db.user.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import uoou.db.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
List<UserEntity> getAll(@Param("content") Map map);
  void delId(Integer id);
  void save(UserEntity userEntity);
}