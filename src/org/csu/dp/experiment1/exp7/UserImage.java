package org.csu.dp.experiment1.exp7;

import java.io.Serializable;

/**
 * Created by sun on 2019/11/27
 */
public class UserImage implements Serializable {
    private String imgUrl;

    public UserImage() {
    }

    public UserImage(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
