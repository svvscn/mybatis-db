package uoou.db.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uoou.db.user.dao.UserDao;
import uoou.db.user.entity.UserEntity;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public void delId(Integer id){
         userDao.delId(id);
    }

    @Override
    public void save(UserEntity userEntity) {
          userEntity.setCreateTime(new Date());
          userDao.save(userEntity);
    }
}
