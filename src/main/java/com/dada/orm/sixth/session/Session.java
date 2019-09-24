package com.dada.orm.sixth.session;

public interface Session {
    <T> int save(T model);
}
