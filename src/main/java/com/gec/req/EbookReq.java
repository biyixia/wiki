package com.gec.req;

import lombok.Data;

/**
 * @author dbc
 * @create 2023-01-10 19:23
 */
@Data
public class EbookReq {
    private int id;
    private String name;         //名称
    private long  category1_id;  //分类1
    private long category2_id;  //分类2
    private String  description;//描述
}
