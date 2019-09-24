package com.dada.spring.second.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 如果一个类实现了 implements FactoryBean
 * 那么容器中有会存在两个对象，
 * 一个叫getObject()返回的对象
 * 一个是当前对象，前面加了个&,
 *
 * 例如下面就是 daoFactoryBean(这个是getObject()返回的对象，但名字叫这个) + &daoFactoryBean(这是当前对象)
 *
 * @author zhoudahua
 * @date 2019/7/6
 * @description
 */
public class DaoFactoryBean implements FactoryBean {

    private String msg;

    public void test() {
        System.out.println("this is Dao factory bean...");
    }

    @Override
    public Object getObject() throws Exception {
        String[] strings = msg.split(",");
        TempDaoFactoryBean tempDaoFactoryBean = new TempDaoFactoryBean();
        tempDaoFactoryBean.setMsg1(strings[0]);
        tempDaoFactoryBean.setMsg2(strings[1]);
        tempDaoFactoryBean.setMsg3(strings[2]);
        return tempDaoFactoryBean;
    }

    @Override
    public Class<?> getObjectType() {
        return TempDaoFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
