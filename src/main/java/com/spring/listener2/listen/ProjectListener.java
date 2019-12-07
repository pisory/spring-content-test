package com.spring.listener2.listen;

import com.spring.listener2.event.ProjectEvent;
import org.springframework.context.ApplicationListener;

/**
 * 事件监听器类，实现ApplicationListener，传入一个泛型类，
 * 如果不传，需要手动判断是否是你需要的事件类型
 * @author dada
 * @date 2019/11/17
 * @description
 */
public class ProjectListener implements ApplicationListener<ProjectEvent> {

    // 触发点，这里才是真正触发的时候，要做的事情在这里做
    @Override
    public void onApplicationEvent(ProjectEvent event) {
        String s = event.doSomething();
        System.out.println(s);
    }
}
