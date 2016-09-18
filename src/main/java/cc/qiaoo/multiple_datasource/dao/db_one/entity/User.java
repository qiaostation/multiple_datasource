package cc.qiaoo.multiple_datasource.dao.db_one.entity;

import java.util.Date;

public class User {
    /**
     * 
     * Column user.id
     */
    private Integer id;

    /**
     * 
     * Column user.name
     */
    private String name;

    /**
     * 
     * Column user.pwd
     */
    private String pwd;

    /**
     * 
     * Column user.created_date
     */
    private Date createdDate;

    /**
     * 
     * Column user.modified_date
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
    public String getName() {
        return name;
    }

    /**
     * 设置 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置 
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
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