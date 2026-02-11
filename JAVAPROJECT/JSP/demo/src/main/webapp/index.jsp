<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <title>Jakarta EE 11 Test</title>
    </head>

    <body>
        <h1>Jakarta EE 11 & JSP 4.0 가동 확인</h1>
        <p>서버 실행 시간: <%= new java.util.Date() %>
        </p>
        <p>Java 런타임: <%= Runtime.version() %>
        </p>
        <p>사용 중인 서버: <%= application.getServerInfo() %>
        </p>
        <p>서블릿 버전: <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %>
        </p>
    </body>

    </html>