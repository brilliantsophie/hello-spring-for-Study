package hello.servlet.web.frontcontroller.v2.controller;

import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v2.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberFormControllerV2 implements ControllerV2 {

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        MyView myView = new MyView("/WEB-INF/views/new-form.jsp");
//        return myView;
        // ctrl + alt + n = 한 줄로 합쳐줌
        return new MyView("/WEB-INF/views/new-form.jsp");
    }
}
