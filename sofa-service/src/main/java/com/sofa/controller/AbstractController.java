package com.sofa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractController {
    private static final Logger logger = LoggerFactory.getLogger(AbstractController.class);

    public static final boolean isDebugEnabled = logger.isDebugEnabled();

}
