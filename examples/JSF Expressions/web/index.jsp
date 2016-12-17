<%-- 
    Document   : index
    Created on : 17-nov-2016, 12:33:49
    Author     : alego
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP (Expresiones)</title>
        </head>
        <body>
            <% /* Scriptlet */
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            %>
            <h1>
                <center>
                    <%= /* Expression */ df.format(java.util.Calendar.getInstance().getTime()) %>  
                </center>
            </h1>
        </body>
    </html>
</f:view>
