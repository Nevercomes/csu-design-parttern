package org.csu.dp.experiment2.exp3;

/**
 * Created by sun on 2019/12/24
 */
public class OneClickBackup {

    private MessageManager messageManager = new MessageManager();
    private PhoneBookManager phoneBookManager = new PhoneBookManager();
    private AlbumManager albumManager = new AlbumManager();

    public void backup() {
        messageManager.manage();
        phoneBookManager.manage();
        albumManager.manage();
    }

}
