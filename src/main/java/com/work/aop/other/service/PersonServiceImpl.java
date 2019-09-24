package com.work.aop.other.service;

import com.work.aop.other.dao.PersonDao;

/**
 * @author zhoudahua
 * @date 2019/7/3
 * @description
 */
public class PersonServiceImpl implements PersonService {
    private PersonDao persaonDao;

    @Override
    public void savePerson() {
        this.persaonDao.savePerson();
    }

    @Override
    public void updatePerson() {
        this.persaonDao.savePerson();
    }

    public PersonDao getPersaonDao() {
        return persaonDao;
    }

    public void setPersaonDao(PersonDao persaonDao) {
        this.persaonDao = persaonDao;
    }
}
