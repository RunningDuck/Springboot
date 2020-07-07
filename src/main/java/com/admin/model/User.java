package com.admin.model;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user")
public class User {

    /**
     * @id 标识主键
     * @KeySql(useGeneratedKeys = true) 主键自动递增
     * @Table 映射的数据库表名
     * @Data 可省略getter和setter的书写
     */
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    private String userName;

    private String password;

    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
