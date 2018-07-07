package com.springwebapp.springwebapp.controller.animals;

import com.springwebapp.springwebapp.common.utils.Constants;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @autor: Linet Torrico
 *
 */

@RequestMapping(value = AnimalAbstractController.PATH)
public class AnimalAbstractController {

    public static final String PATH = Constants.WEB_BASE_PATH+ "/animals";
    public static final String TAG_NAME = "Animals";
    public static final String DESCRIPTION = "Operaciones Disponibles para Animales" ;
}
