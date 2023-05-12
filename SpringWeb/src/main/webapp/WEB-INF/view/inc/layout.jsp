<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>공지사항목록${test} }</title>
	
    <link href="/css/layout.css" type="text/css" rel="stylesheet" />
    <link href="/css/index.css" type="text/css" rel="stylesheet" />
    <script>
    
    </script>
</head>

<body>
    <!-- header 부분 -->
	<tiles:insertAttribute name="header" />
 

    <!-- --------------------------- <body> --------------------------------------- -->
	  	
	<tiles:insertAttribute name="main" />


    <!-- ------------------- <footer> --------------------------------------- -->
	<tiles:insertAttribute name="footer" />
	

</body>

</html>