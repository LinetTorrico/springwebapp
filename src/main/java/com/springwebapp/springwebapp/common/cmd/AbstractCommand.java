package com.springwebapp.springwebapp.common.cmd;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Autor: Linet Torrico
 */

public abstract class AbstractCommand implements Command {
    @Autowired
    private CommandExecutorService service;

    @Override
    public void execute() {
        service.execute(this);
    }

    protected abstract void run();

}
