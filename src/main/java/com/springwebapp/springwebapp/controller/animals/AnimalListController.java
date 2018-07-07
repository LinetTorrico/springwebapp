package com.springwebapp.springwebapp.controller.animals;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @autor : Linet Torrico
 * @API: is required to declare an API resource.
 */

@Api(
    tags = AnimalAbstractController.TAG_NAME,
    description = AnimalAbstractController.DESCRIPTION

)
@RestController
@RequestScope

public class AnimalListController extends AnimalAbstractController {
    //@Autowired
   // private AnimalLisCmd cmd;
}
