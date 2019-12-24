package org.csu.dp.experiment2.exp1;

/**
 * Created by sun on 2019/12/24
 */
public abstract class AbstractMember {

    protected String name;

    public abstract void share();

    public abstract void add(AbstractMember abstractMember);

    public abstract void remove(AbstractMember abstractMember);

    public abstract AbstractMember getMember(int i);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
