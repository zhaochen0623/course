package com.course.business.controller;

import com.course.common.dto.ChapterDto;
import com.course.common.dto.PageDto;
import com.course.common.dto.ResponseDto;
import com.course.common.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName ChapterController
 * @Author ASUS
 * @Date 2020-08-27 19:39
 * @Version 1.0
 **/
@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    private static final Logger LOG = LoggerFactory.getLogger(ChapterController.class);

    @Autowired
    private ChapterService chapterService;

    /**
     * 列表查询
     * @param pageDto
     * @return
     */
    @RequestMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto){
        LOG.info("PageDto:{}"+pageDto);
        ResponseDto responseDto=new ResponseDto();
        chapterService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     *添加
     * @param chapterDto
     * @return
     */
    @RequestMapping("/add")
    public ResponseDto add(@RequestBody ChapterDto chapterDto){
        ResponseDto responseDto=new ResponseDto();
        LOG.info("ChapterDto:{}"+chapterDto);
        chapterService.add(chapterDto);
        responseDto.setContent(chapterDto);
        return responseDto;
    }

}
