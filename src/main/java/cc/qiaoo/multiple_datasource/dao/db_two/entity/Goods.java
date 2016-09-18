package cc.qiaoo.multiple_datasource.dao.db_two.entity;

import java.util.Date;

public class Goods {
    /**
     * 
     * Column goods.id
     */
    private Integer id;

    /**
     * 
     * Column goods.good_id
     */
    private String goodId;

    /**
     * 
     * Column goods.good_name
     */
    private String goodName;

    /**
     * 
     * Column goods.created_date
     */
    private Date createdDate;

    /**
     * 
     * Column goods.modified_date
     */
    private Date modifiedDate;

    /**
     * 获取 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 
     */
    public String getGoodId() {
        return goodId;
    }

    /**
     * 设置 
     */
    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    /**
     * 获取 
     */
    public String getGoodName() {
        return goodName;
    }

    /**
     * 设置 
     */
    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    /**
     * 获取 
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置 
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 获取 
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 设置 
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}