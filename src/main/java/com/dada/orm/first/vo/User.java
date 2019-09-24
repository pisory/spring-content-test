package com.dada.orm.first.vo;

import com.dada.orm.first.jpa.Column;
import com.dada.orm.first.jpa.Table;
import lombok.*;

/**
 * Bean实体类
 * @author zhoudahua
 * @date 2019/5/27
 * @description
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
