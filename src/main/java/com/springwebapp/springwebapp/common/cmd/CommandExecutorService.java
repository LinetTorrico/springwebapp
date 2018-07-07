package com.springwebapp.springwebapp.common.cmd;


import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
class CommandExecutorService {

    public void execute(AbstractCommand command) {
        command.run();
    }
}


