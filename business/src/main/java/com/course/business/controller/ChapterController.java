package com.course.business.controller;

import com.course.common.dto.ChapterDto;
import com.course.common.dto.PageDto;
import com.course.common.dto.ResponseDto;
import com.course.common.entity.Chapter;
import com.course.common.exception.ValidatorException;
import com.course.common.service.ChapterService;
import com.course.common.util.CopyUtil;
import com.course.common.util.UuidUtil;
import com.course.common.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public static final String BUSINESS_NAME = "大章";
    @Autowired
    private ChapterService chapterService;

    /**
     * 列表查询
     *
     * @param pageDto
     * @return
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        LOG.info("PageDto:{}" + pageDto);
        ResponseDto responseDto = new ResponseDto();
        chapterService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 添加
     *
     * @param chapterDto
     * @return
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody ChapterDto chapterDto) {
        LOG.info("chapterDto:{}" + chapterDto);
        //保存校验
        ValidatorUtil.require(chapterDto.getName(), "名称");
        ValidatorUtil.require(chapterDto.getCourseId(), "课程ID");
        ValidatorUtil.length(chapterDto.getCourseId(), "课程ID", 1, 8);

        ResponseDto responseDto = new ResponseDto();
        chapterService.save(chapterDto);
        responseDto.setContent(chapterDto);
        return responseDto;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable String id) {
        LOG.info("id:{}", id);
        ResponseDto responseDto = new ResponseDto();
        chapterService.delete(id);
        return responseDto;
    }

}
