package com.dada.orm.third.model;

import com.dada.orm.first.jpa.Table;
import com.dada.orm.third.jpa.Column;
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
@Table("t_bas_person")
public class Person {

    private Integer id;

    @Column("t_person_name")
    private String personName;

    @Column("t_pass_word")
    private String passWord;

    @Column("t_role")
    private String role;
}
