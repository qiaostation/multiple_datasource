package cc.qiaoo.multiple_datasource.dao.db_one.mapper;

import cc.qiaoo.multiple_datasource.BaseTest;
import cc.qiaoo.multiple_datasource.dao.db_one.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qiaoo on 2016/9/18.
 */
public class UserMapperTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        User user = new User();
        user.setName("lqq");
        user.setPwd("123456");
        userMapper.insert(user);
    }
}