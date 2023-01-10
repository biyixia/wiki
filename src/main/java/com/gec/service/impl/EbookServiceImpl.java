package com.gec.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.javabean.Ebook;
import com.gec.mapper.EbookMapper;
import com.gec.service.EbookService;
import org.springframework.stereotype.Service;

/**
 * @author dbc
 * @create 2023-01-08 17:29
 */
@Service
public class EbookServiceImpl extends ServiceImpl<EbookMapper, Ebook> implements EbookService {
}
