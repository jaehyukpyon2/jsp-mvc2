package com.example.jspmvc2.dao;

import com.example.jspmvc2.mybatis.factory.MyBatisSessionFactory;
import com.example.jspmvc2.mybatis.mapper.MVCBoardMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

public class MVCBoardDAO {

    public int selectCount(Map<String, Object> map) {
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
        MVCBoardMapper mapper = sqlSession.getMapper(MVCBoardMapper.class);
        int result = mapper.selectCount(map);
        return result;
    }
}
