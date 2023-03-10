package com.gec.resp;

import lombok.Data;

/**
 * @author dbc
 * @create 2023-01-10 19:32
 */
@Data
public class EbookResp {
    private int id;
    private String name;         //名称
    private long  category1_id;  //分类1
    private long category2_id;  //分类2
    private String  description;//描述
    private String cover ;     //封面
    private int doc_count;     //文档数
    private int view_count;    //阅读数
    private int vote_count;    //点赞数
}
