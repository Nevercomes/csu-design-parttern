package org.csu.dp.exp11.claaz;

import org.csu.dp.exp11.Encrypt;
import org.csu.dp.exp11.MineEncrypt;

/**
 * Created by sun on 2019/12/3
 */
public class MineEncryptAdapter extends MineEncrypt implements Encrypt {
    public void encrypt(String data) {
        super.doEncrypt(data);
    }
}
