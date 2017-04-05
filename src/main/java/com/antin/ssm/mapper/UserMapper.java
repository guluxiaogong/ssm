package com.antin.ssm.mapper;

import com.antin.ssm.model.UserModel;

import java.util.List;

/**
 * Created by win7 on 2017/4/4.
 */
public interface UserMapper {
    /**
     * 查入一条记录
     *
     * @param userModel
     */

    void insert(UserModel userModel);

    /**
     * 删除一条记录
     *
     * @param id 主键
     */
    void deleteById(Integer id);

    /**
     * 更新一条记录
     *
     * @param userModel
     */
    void update(UserModel userModel);

    /**
     * 查询一条记录
     *
     * @param id 主键
     * @return
     */
    UserModel selectById(Integer id);

    /**
     * 查询所有
     *
     * @return
     */

    List<UserModel> selectAll();

}
