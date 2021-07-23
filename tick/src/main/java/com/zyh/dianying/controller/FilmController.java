package com.zyh.dianying.controller;

import com.zyh.dianying.domain.Film;
import com.zyh.dianying.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;

    @ResponseBody
    @RequestMapping("selectall")
    public List<Film> selectAll(){
        return filmService.selectAll();
    }

}
