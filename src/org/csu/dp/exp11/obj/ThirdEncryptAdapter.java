package org.csu.dp.exp11.obj;

import org.csu.dp.exp11.Encrypt;
import org.csu.dp.exp11.ThirdEncrypt;

/**
 * Created by sun on 2019/12/3
 */
public class ThirdEncryptAdapter implements Encrypt {

    private ThirdEncrypt thirdEncrypt;

    public ThirdEncryptAdapter(ThirdEncrypt thirdEncrypt) {
        this.thirdEncrypt = thirdEncrypt;
    }

    public void encrypt(String data) {
        thirdEncrypt.doEncrypt(data);
    }
}
