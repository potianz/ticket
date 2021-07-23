package com.zyh.dianying.dao;

import com.zyh.dianying.domain.Film;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.List;

@Repository
public interface FilmDao {
    List<Film> selectAll();
}
