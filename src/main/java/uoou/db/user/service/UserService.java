package uoou.db.user.service;

import uoou.db.user.entity.UserEntity;

import java.util.List;
import java.util.Map;


public interface UserService {
    List<UserEntity> getAll(Map map);
    void delId( Integer id);
    void save(UserEntity userEntity);

}

