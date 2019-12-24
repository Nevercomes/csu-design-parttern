package org.csu.dp.experiment2.exp1;

/**
 * Created by sun on 2019/12/24
 */
public class Member extends AbstractMember {

    public void share() {
        System.out.println("share to member " + this.name);
    }

    public void add(AbstractMember abstractMember) {
        System.out.println("member has not method of add");
    }

    public void remove(AbstractMember abstractMember) {
        System.out.println("member has not method of remove");
    }

    public AbstractMember getMember(int i) {
        System.out.println("member has not method of remove");
        return null;
    }
}
