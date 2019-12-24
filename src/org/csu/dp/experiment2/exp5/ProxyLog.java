package org.csu.dp.experiment2.exp5;

import java.util.Date;

/**
 * Created by sun on 2019/12/24
 */
public class ProxyLog implements AbstractBusiness {

    private RealBusiness realBusiness = new RealBusiness();

    public void doBusiness() {
        preMethod();
        try {
            realBusiness.doBusiness();
            post();
        } catch (Exception e) {
            fail();
        }

    }

    private void preMethod() {
        System.out.println("doBusiness has been called on " + new Date());
    }

    private void post() {
        System.out.println("doBusiness called successfully");
    }
    private void fail() {
        System.out.println("doBusiness called failed");
    }

}
