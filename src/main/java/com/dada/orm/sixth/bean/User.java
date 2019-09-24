package com.dada.orm.sixth.bean;

import com.dada.orm.sixth.jpa.Column;
import com.dada.orm.sixth.jpa.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author zhoudahua
 * @date 2019/5/29
 * @description
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("t_bas_user")
public class User {
    private Integer id;

    @Column("t_user_name")
    private String name;

    @Column("t_user_age")
    private Integer age;

    @Column("t_user_sex")
    private String sex;
}
