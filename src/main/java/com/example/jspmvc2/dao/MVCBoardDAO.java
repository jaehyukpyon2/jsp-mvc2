package com.example.jspmvc2.dao;

import com.example.jspmvc2.dto.MVCBoardDTO;
import com.example.jspmvc2.mybatis.factory.MyBatisSessionFactory;
import com.example.jspmvc2.mybatis.mapper.MVCBoardMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class MVCBoardDAO {

    public int selectCount(Map<String, Object> map) {
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
        MVCBoardMapper mapper = sqlSession.getMapper(MVCBoardMapper.class);
        int result = mapper.selectCount(map);
        sqlSession.close();
        return result;
    }

    public List<MVCBoardDTO> selectListPage(Map<String, Object> map) {
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
        MVCBoardMapper mapper = sqlSession.getMapper(MVCBoardMapper.class);
        List<MVCBoardDTO> result = mapper.selectListPage(map);
        sqlSession.close();
        return result;
    }

    public int insertWrite(MVCBoardDTO dto) {
        SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
        MVCBoardMapper mapper = sqlSession.getMapper(MVCBoardMapper.class);
        int result = mapper.insertWrite(dto);
        if (result == 1) {
            sqlSession.commit();
            System.out.println("새로운 mvcboard 저장 성공");
        } else {
            System.out.println("새로운 mvcboard 저장 실패");
        }
        sqlSession.close();
        return result;
    }
}
