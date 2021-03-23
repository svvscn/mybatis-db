package uoou.db.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uoou.db.user.entity.UserEntity;
import uoou.db.user.service.UserService;

import java.util.List;
import java.util.Map;

@Controller

@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

@ResponseBody
@RequestMapping("/getAll")
public List<UserEntity> getAll(Map map){
        return userService.getAll(map);
}


@RequestMapping("/delId")
    public String delId(Integer id) {
        userService.delId(id);
        return "redirect:/index.html";
}

@ResponseBody
@RequestMapping("/save")
    public String save(@RequestBody UserEntity userEntity){
    userService.save(userEntity);
    return "添加成功";
}

}
