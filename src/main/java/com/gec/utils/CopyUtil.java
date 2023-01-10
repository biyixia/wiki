package com.gec.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author dbc
 * @create 2023-01-10 19:32
 */
public class CopyUtil {
    @SuppressWarnings("all")
    public static <T> T copy(Object fromBean, Class<T> clz)
            throws InstantiationException, IllegalAccessException {
        if (fromBean == null || clz == null) {
            return null;
        }
        T result = clz.newInstance();
        BeanUtils.copyProperties(fromBean, result);
        return result;
    }

    public static <T> List<T> copyList(Collection<?> fromBeans,Class<T> cls)
            throws InstantiationException, IllegalAccessException {
            if (CollectionUtils.isEmpty(fromBeans) || null == cls) {
                return null;
            }
            List<T> list = new ArrayList<>();
            for (Object fromBean : fromBeans) {
                T t = copy(fromBean, cls);
                if (t != null) {
                    list.add(t);
                }
            }
            return list;
        }
}
