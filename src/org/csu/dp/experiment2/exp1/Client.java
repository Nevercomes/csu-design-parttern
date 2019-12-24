package org.csu.dp.experiment2.exp1;

/**
 * Created by sun on 2019/12/24
 */
public class Client {

    public static void main(String[] args) {
        AbstractMember member1 = new Member();
        AbstractMember member2 = new Member();
        AbstractMember member3 = new Member();

        member1.setName("Mike");
        member2.setName("Lisa");
        member3.setName("Dave");

        AbstractMember group1 = new Group();
        AbstractMember group2 = new Group();

        group1.setName("people");
        group2.setName("friends");

        group2.add(member1);
        group2.add(member2);
        group1.add(member3);
        group1.add(group2);

        group1.share();
        group2.share();
        member1.share();

    }

}
