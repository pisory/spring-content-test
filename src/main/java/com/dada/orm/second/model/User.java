package com.dada.orm.second.model;

import com.dada.orm.first.jpa.Table;
import com.dada.orm.second.jpa.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("t_bas_user")
public class User {

    private Integer id;

    @Column("t_name")
    private String name;

    @Column("t_sex")
    private String sex;

    @Column("t_age")
    private Integer age;

    @Column("t_phone")
    private String phone;

}
