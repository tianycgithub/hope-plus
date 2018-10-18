package com.hope.beans;

import com.hope.mybatis.pojo.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program:hope-plus
 * @author:aodeng
 * @blog:低调小熊猫(https://aodeng.cc)
 * @微信公众号:低调小熊猫
 * @create:2018-10-16 11:04
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class SysUserRole extends CommonEntity{
    /**---------------数据对象---------------**/
    /**用户id**/
    private String userId;
    /**角色id**/
    private String roleId;

}