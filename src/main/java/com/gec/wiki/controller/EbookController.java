package com.gec.wiki.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gec.wiki.javabean.Ebook;
import com.gec.wiki.resp.CommonResp;
import com.gec.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dbc
 * @create 2023-01-08 17:33
 */
@RestController
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @GetMapping("/getEbooks")
    public CommonResp getEbooks(){
        List<Ebook> list = ebookService.list();
        for (Ebook ebook : list) {
            System.out.println(ebook.toString());
        }
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/getEbookByName")
    public CommonResp getEbookByName(String name){
        QueryWrapper<Ebook> wrapper = new QueryWrapper<>();
        wrapper.like("name",name);
        List<Ebook> list = ebookService.list(wrapper);
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        resp.setContent(list);
        return resp;
    }
}
