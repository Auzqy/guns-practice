package com.stylefeng.guns.rest.persistence.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 房屋管理表
 * </p>
 *
 * @author au
 * @since 2020-02-11
 */
@TableName("au_tbl_house")
public class House extends Model<House> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("house_user")
    private String houseUser;
    @TableField("house_address")
    private String houseAddress;
    @TableField("house_time")
    private Date houseTime;
    @TableField("house_desc")
    private String houseDesc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouseUser() {
        return houseUser;
    }

    public void setHouseUser(String houseUser) {
        this.houseUser = houseUser;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public Date getHouseTime() {
        return houseTime;
    }

    public void setHouseTime(Date houseTime) {
        this.houseTime = houseTime;
    }

    public String getHouseDesc() {
        return houseDesc;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "House{" +
        "id=" + id +
        ", houseUser=" + houseUser +
        ", houseAddress=" + houseAddress +
        ", houseTime=" + houseTime +
        ", houseDesc=" + houseDesc +
        "}";
    }
}
