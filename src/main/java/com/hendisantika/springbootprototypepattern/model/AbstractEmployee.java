package com.hendisantika.springbootprototypepattern.model;

import org.springframework.context.annotation.Description;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-prototype-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/01/20
 * Time: 05.26
 */
@Description(value = "Abstract Employee...")
public abstract class AbstractEmployee {

    private String fullName;
    private Role role;

    public abstract AbstractEmployee cloneObject();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}