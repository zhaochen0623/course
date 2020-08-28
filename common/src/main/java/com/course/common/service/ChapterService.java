package com.course.common.service;

import com.course.common.dto.ChapterDto;
import com.course.common.dto.PageDto;
import com.course.common.entity.Chapter;
import com.course.common.entity.ChapterExample;

import java.util.List;

/**
 * @ClassName ChapterService
 * @Author ASUS
 * @Date 2020-08-27 19:21
 * @Version 1.0
 **/
public interface ChapterService {
    public void list(PageDto pageDto);

}
