package cc.qiaoo.multiple_datasource.dao.db_two.mapper;

import cc.qiaoo.multiple_datasource.BaseTest;
import cc.qiaoo.multiple_datasource.dao.db_two.entity.Goods;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by qiaoo on 2016/9/18.
 */
public class GoodsMapperTest extends BaseTest {

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void testInsert() throws Exception {
        Goods goods = new Goods();
        goods.setGoodId("G001");
        goods.setGoodName("flower");
        goods.setCreatedDate(new Date());
        goodsMapper.insert(goods);
    }
}