package com.demo.user.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   private static final Logger logger= LoggerFactory.getLogger(UserController.class);

    @GetMapping("/health")
    public String healthCheck(){
        logger.info("health api called info");
        logger.warn("health api called warn");
        logger.debug("health api called debug");
        logger.trace("health api called trace");
        logger.error("health api called error");
        return "application running.";
    }
}
