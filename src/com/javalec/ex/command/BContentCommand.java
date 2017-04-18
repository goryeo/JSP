package com.javalec.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.dao.BDao;
import com.javalec.ex.dto.BDto;

public class BContentCommand implements BCommand {
    public void execute(HttpServletRequest request, HttpServletResponse response)
    {
        String bId = request.getParameter("Bid");
        BDao dao = new BDao();
        BDto dto = dao.contentView(bId);
        
        request.setAttribute("content_view", dto);
    }
}
