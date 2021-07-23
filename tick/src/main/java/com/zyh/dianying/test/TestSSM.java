package com.zyh.dianying.test;

import com.zyh.dianying.domain.Film;
import com.zyh.dianying.service.FilmService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSSM {
    @Test
    public void test() {
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
        FilmService service = (FilmService) ac.getBean("filmService");
        service.selectAll();
    }
}
