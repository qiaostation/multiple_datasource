package cc.qiaoo.multiple_datasource.dao.db_one.mapper;

import cc.qiaoo.multiple_datasource.dao.db_one.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}