package com.dada.orm.second.session;

public interface Session {
    <T> int save(T model);
}
