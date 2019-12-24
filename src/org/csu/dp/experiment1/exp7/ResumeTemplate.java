package org.csu.dp.experiment1.exp7;

import java.io.Serializable;

/**
 * Created by sun on 2019/11/27
 */
public abstract class ResumeTemplate implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    protected String name = "Mike";
    protected int age = 21;
    protected String sex = "man";
    protected UserImage userImage = new UserImage("https://img.sun.com/Mike_000");

    public abstract ResumeTemplate customClone();

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public UserImage getUserImage() {
        return userImage;
    }

    public void setUserImage(UserImage userImage) {
        this.userImage = userImage;
    }
}
