package com.spring.listener2.controller;

import com.spring.listener2.event.ProjectEvent;
import com.spring.listener2.model.Project;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author dada
 * @date 2019/11/17
 * @description
 */
@Component
public class ProjectController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Project insertProject() {
        Project project = new Project();
        project.setName("项目1");
        project.setTime("2019/11/17");
        insertApproveDataToDB(project);
        return project;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("启动成功");
        this.applicationContext = applicationContext;
    }

    public void insertApproveDataToDB(Project project) {
        ProjectEvent projectEvent = new ProjectEvent(this, project);
        applicationContext.publishEvent(projectEvent);
    }
}
