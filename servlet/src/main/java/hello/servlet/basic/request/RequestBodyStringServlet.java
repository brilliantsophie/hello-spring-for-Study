package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletInputStream inputStream = request.getInputStream();  // 이렇게 하면 메세지 바디의 내용을 바이트코드로 바로 얻을 수 있음. 스트링으로 바꿔야 함.
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);// 바이트 문자 서로 바꿀 때 어떤 인코딩인지 알려줘야 함.

        System.out.println("messageBody = " + messageBody);

        response.getWriter().write("ok");
    }
}
