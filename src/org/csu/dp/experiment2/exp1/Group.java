package org.csu.dp.experiment2.exp1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sun on 2019/12/24
 */
public class Group extends AbstractMember {

    private List<AbstractMember> memberList = new ArrayList<AbstractMember>();

    public void share() {
        System.out.println("share to group " + this.name);
        for (AbstractMember member : memberList) {
            member.share();
        }
    }

    public void add(AbstractMember abstractMember) {
        memberList.add(abstractMember);
    }

    public void remove(AbstractMember abstractMember) {
        memberList.remove(abstractMember);
    }

    public AbstractMember getMember(int i) {
        return memberList.get(i);
    }
}
