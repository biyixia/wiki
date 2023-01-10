package com.gec.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gec.javabean.Ebook;
import com.gec.req.EbookReq;
import com.gec.resp.CommonResp;
import com.gec.resp.EbookResp;
import com.gec.service.EbookService;
import com.gec.utils.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
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

    @GetMapping("/getEbookByEbookReq")
    public CommonResp getEbookByEbookReq(EbookReq req) throws InstantiationException, IllegalAccessException {
        List<Ebook> list;
        System.out.println("req=" + req);
        if (!ObjectUtils.isEmpty(req.getName())){
            QueryWrapper<Ebook> wrapper = new QueryWrapper<>();
            wrapper.like("name",req.getName());
            list = ebookService.list(wrapper);
        }else {
            list = ebookService.list();
        }
        List<EbookResp> ebookResps = CopyUtil.copyList(list, EbookResp.class);
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        resp.setContent(ebookResps);
        return resp;
    }
}
