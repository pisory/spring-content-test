package com.spring.autowired.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dada
 * @date 2019/10/9
 * @description
 */
@Component
public class StudentService {

    private TeacherService teacherService;

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
