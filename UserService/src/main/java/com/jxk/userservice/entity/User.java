package com.jxk.userservice.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty("userId")
    private Long id;

    @ApiModelProperty("用户姓名")
    private String name;
    @ApiModelProperty("用户年龄")
    private Integer age;
    @ApiModelProperty("用户邮件")
    private String email;
    @ApiModelProperty("用户修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;
    @ApiModelProperty("用户创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;
}

