package org.csu.dp.experiment1.exp11.obj;

import org.csu.dp.experiment1.exp11.Encrypt;
import org.csu.dp.experiment1.exp11.MineEncrypt;

/**
 * Created by sun on 2019/12/3
 */
public class MineEncryptAdapter implements Encrypt {

    private MineEncrypt mineEncrypt;

    public MineEncryptAdapter(MineEncrypt mineEncrypt) {
        this.mineEncrypt = mineEncrypt;
    }

    public void encrypt(String data) {
        mineEncrypt.doEncrypt(data);
    }
}
