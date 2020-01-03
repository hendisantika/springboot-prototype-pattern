package com.hendisantika.springbootprototypepattern.prototype;

import com.hendisantika.springbootprototypepattern.model.AbstractEmployee;
import com.hendisantika.springbootprototypepattern.model.Role;
import org.springframework.context.annotation.Description;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-prototype-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/01/20
 * Time: 05.29
 */
@Description(value = "Project Manager prototype.")
public class ProjectManager extends AbstractEmployee {

    private String fullName;
    private Role role;

    public ProjectManager(String fullName, Role role) {
        this.fullName = fullName;
        this.role = role;
    }

    @Override
    public AbstractEmployee cloneObject() {
        return new ProjectManager(fullName, role);
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "fullName='" + fullName + '\'' +
                ", role=" + role +
                '}';
    }
}