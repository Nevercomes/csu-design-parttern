package org.csu.dp.experiment2.exp11;

import org.csu.dp.common.XmlUtil;
import org.csu.dp.experiment2.exp4.AbstractFacade;

/**
 * Created by sun on 2019/12/27
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Photo photo = new Photo();
        Filter filter;
        String configPath = "./config/config.xml";
        String filterName = XmlUtil.getText(XmlUtil.parseXml(configPath), "filter");
        filter = (Filter) Class.forName(filterName).newInstance();
        photo.setFilter(filter);
        photo.addFilter();
    }

}
