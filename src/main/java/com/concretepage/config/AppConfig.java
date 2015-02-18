package com.concretepage.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Goodarzi on 12/18/14.
 */
@Configuration
@ComponentScan("com.concretepage")
@EnableWebMvc
@Import(HibernateConfiguration.class)
//@ImportResource("classpath:persistContext.xml")
public class AppConfig {
}
