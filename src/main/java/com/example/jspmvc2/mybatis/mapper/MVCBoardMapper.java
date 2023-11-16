package com.example.jspmvc2.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MVCBoardMapper {

    int selectCount(Map<String, Object> map);
}
