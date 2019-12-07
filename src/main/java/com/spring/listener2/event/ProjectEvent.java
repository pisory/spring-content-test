package com.spring.listener2.event;

import com.spring.listener2.model.Project;
import org.springframework.context.ApplicationEvent;

/**
 * 事件类，继承ApplicationEvent
 * @author dada
 * @date 2019/11/17
 * @description
 */
public class ProjectEvent extends ApplicationEvent {

    private Project project;

    public ProjectEvent(Object source, Project project) {
        super(source);
        this.project = project;
    }

    public String doSomething() {
        // 触发后，要做的事情。例如要准备插入一些项目审批数据到数据库
        // 这里是描述做的事情，真正要做是在Listener里面做的
        return project.toString();
    }
}
