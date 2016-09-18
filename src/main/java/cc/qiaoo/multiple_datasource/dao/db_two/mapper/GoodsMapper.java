package cc.qiaoo.multiple_datasource.dao.db_two.mapper;

import cc.qiaoo.multiple_datasource.dao.db_two.entity.Goods;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}