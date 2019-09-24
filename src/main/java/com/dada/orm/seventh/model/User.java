package com.dada.orm.seventh.model;

import com.dada.orm.seventh.jpa.Column;
import com.dada.orm.seventh.jpa.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author zhoudahua
 * @date 2019/6/16
 * @description
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table("t_sys_user")
public class User {

    @Column("t_user_name")
    private String name;

    @Column("t_user_password")
    private String password;

    @Column("t_user_sex")
    private String sex;

    @Column("t_user_age")
    private Integer age;
}
