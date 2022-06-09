package com.per.gnake.mapper;

import com.per.gnake.bean.Teacher;
import com.per.gnake.bean.Vo.Score;

import java.util.List;

public interface TeacherMapper {
    String queryTeaPassowrd(String tno);

    int getSingeTea(String tno);

    Teacher queryTeacher(String tno);

    Teacher queryTeacherByName(String tname);

    List<Score> queryTeacherNeedInputScore(String tno);
}
