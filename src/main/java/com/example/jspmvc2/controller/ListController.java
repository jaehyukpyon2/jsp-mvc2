package com.example.jspmvc2.controller;

import com.example.jspmvc2.dao.MVCBoardDAO;
import com.example.jspmvc2.dto.MVCBoardDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ListController", value = "/mvcboard/list.do")
public class ListController extends HttpServlet {

    //private MVCBoardDAO dao = new MVCBoardDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MVCBoardDAO dao = new MVCBoardDAO();
        Map<String, Object> map = new HashMap<>();
        String searchField = request.getParameter("searchField");
        String searchWord = request.getParameter("searchWord");
        if (searchWord != null && !searchWord.equals("")) {
            map.put("searchField", searchField);
            map.put("searchWord", searchWord);
        }
        int totalCount = dao.selectCount(map);
        List<MVCBoardDTO> boardLists = dao.selectListPage(map);
        request.setAttribute("totalCount", totalCount);
        request.setAttribute("boardLists", boardLists);
        request.setAttribute("map", map);
        request.getRequestDispatcher("/14MVCBoard/List.jsp").forward(request, response);
    }
}
