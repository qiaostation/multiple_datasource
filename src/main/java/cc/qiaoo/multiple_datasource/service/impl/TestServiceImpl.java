package cc.qiaoo.multiple_datasource.service.impl;

import cc.qiaoo.multiple_datasource.dao.db_one.entity.User;
import cc.qiaoo.multiple_datasource.dao.db_one.mapper.UserMapper;
import cc.qiaoo.multiple_datasource.dao.db_two.entity.Goods;
import cc.qiaoo.multiple_datasource.dao.db_two.mapper.GoodsMapper;
import cc.qiaoo.multiple_datasource.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by qiaoo on 2016/9/18.
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public void test() {
        User user = new User();
        user.setName("lqq");
        user.setPwd("123456");
        userMapper.insert(user);

        Goods goods = new Goods();
        goods.setGoodId("G001");
        goods.setGoodName("flower");
        goods.setCreatedDate(new Date());
        goodsMapper.insert(goods);
    }
}
