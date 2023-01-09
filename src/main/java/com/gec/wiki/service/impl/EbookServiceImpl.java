package com.gec.wiki.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.wiki.javabean.Ebook;
import com.gec.wiki.mapper.EbookMapper;
import com.gec.wiki.service.EbookService;
import org.springframework.stereotype.Service;

/**
 * @author dbc
 * @create 2023-01-08 17:29
 */
@Service
public class EbookServiceImpl extends ServiceImpl<EbookMapper, Ebook> implements EbookService {
}
