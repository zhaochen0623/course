package com.course.common.service;

import com.course.common.dto.ChapterDto;
import com.course.common.entity.Chapter;
import com.course.common.entity.ChapterExample;
import com.course.common.mapper.ChapterMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ChapterServiceImpl
 * @Author ASUS
 * @Date 2020-08-27 19:21
 * @Version 1.0
 **/
@Service
public class ChapterServiceImpl implements ChapterService {

    @Autowired
    private ChapterMapper chapterMapper;


    @Override
    public List<ChapterDto> selectByExample() {
        PageHelper.startPage(1,1);
        ChapterExample chapterExample = new ChapterExample();
//        chapterExample.createCriteria().andIdEqualTo("");
//        chapterExample.setOrderByClause("id desc");
//
        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);
        List<ChapterDto> chapterDtos = new ArrayList<ChapterDto>();
        for (int i = 0,l=chapterList.size(); i < l;  i++){
            Chapter chapter=chapterList.get(i);
            ChapterDto chapterDto=new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            chapterDtos.add(chapterDto);
        }
        return chapterDtos;
    }
}
