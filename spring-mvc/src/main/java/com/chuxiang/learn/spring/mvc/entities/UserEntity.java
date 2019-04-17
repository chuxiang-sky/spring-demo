package com.chuxiang.learn.spring.mvc.entities;


import javax.validation.constraints.*;
import java.util.Date;

/**
 * Created by chuxiang_sky on 2019/04/16.
 */
public class UserEntity {

    @NotNull
    private long id;

    @NotNull
    @Size(min = 1,max = 128)
    private String name;

    @DecimalMax("199")
    @DecimalMin("1")
    private int age;

    @AssertTrue
    private boolean isMale;

    @Past
    private Date birthday;

    public UserEntity(@NotNull long id, @NotNull @Size(min = 1, max = 128) String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

//    @Override
//    public int hashCode() {
//        return HashCodeBuilder.reflectionHashCode(this,"id","name");
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return EqualsBuilder.reflectionEquals(this,"id","name");
//    }
}
