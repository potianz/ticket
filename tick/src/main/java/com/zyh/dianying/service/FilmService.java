package com.zyh.dianying.service;

import com.zyh.dianying.dao.FilmDao;
import com.zyh.dianying.domain.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    @Autowired
    private FilmDao filmDao;
    public List<Film> selectAll()
    {
        List<Film> films = filmDao.selectAll();
        System.out.println(films);
        return films;
    }
}
