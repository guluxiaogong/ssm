package com.antin.ssm.antion;

import com.antin.ssm.model.UserModel;
import com.antin.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by win7 on 2017/4/4.
 */
@Controller
@RequestMapping(value = "user")
public class UserAction {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * 查入一条记录
     */
    @ResponseBody
    @RequestMapping(value = "insert", method = {RequestMethod.GET, RequestMethod.POST})
    public void insert() {
        UserModel userModel = new UserModel();
        userModel.setId(1);
        userModel.setUsername("admin");
        userModel.setPassword("admin");
        userModel.setBirthday(new Date());
        userService.insert(userModel);
    }

    /**
     * 删除一条记录
     */
    @ResponseBody
    @RequestMapping(value = "deleteById", method = {RequestMethod.GET, RequestMethod.POST})
    public void deleteById() {
        userService.deleteById(1);
    }

    /**
     * 更新一条记录
     */
    @ResponseBody
    @RequestMapping(value = "update", method = {RequestMethod.GET, RequestMethod.POST})
    public void update() {
        UserModel userModel = new UserModel();
        userModel.setId(1);
        userModel.setUsername("root");
        userModel.setPassword("root");
        userModel.setBirthday(new Date());
        userService.update(userModel);
    }

    /**
     * 查询一条记录
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selectById", method = {RequestMethod.GET, RequestMethod.POST})
    public UserModel selectById() {
        UserModel userModel = userService.selectById(1);
        return userModel;
    }

    /**
     * 查询所有
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "selectAll", method = {RequestMethod.GET, RequestMethod.POST})
    public List<UserModel> selectAll() {
        List<UserModel> list = userService.selectAll();
        return list;
    }
}
