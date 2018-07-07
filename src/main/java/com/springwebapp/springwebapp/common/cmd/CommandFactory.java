package com.springwebapp.springwebapp.common.cmd;


import org.springframework.context.ApplicationContext;

/**
 * Factory to instance others commands
 * @author Linet Torrico
 */
public class CommandFactory {

    private ApplicationContext context;

    public <T extends AbstractCommand> T createInstance(Class<T> clazz) {
        return context.getBean(clazz);
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }
}

