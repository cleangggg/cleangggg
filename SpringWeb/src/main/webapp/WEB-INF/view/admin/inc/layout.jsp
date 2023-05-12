<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>

<head>
<meta charset="UTF-8">
<title>공지사항목록${test}</title>

<link href="/css/customer/layout.css" type="text/css" rel="stylesheet" />
<style>
#visual .content-container {
	height: inherit;
	display: flex;
	align-items: center;
	background: url("../../images/customer/visual.png") no-repeat center;
}
</style>
</head>

<body>
	<!-- header 부분 -->
	<tiles:insertAttribute name="header" />


	<!-- --------------------------- <visual> --------------------------------------- -->
	<!-- visual 부분 -->
	<tiles:insertAttribute name="visual" />

	<!-- --------------------------- <body> --------------------------------------- -->
	<div id="main">
		<div class="content-container clearfix">

			<!-- --------------------------- aside --------------------------------------- -->
			<!-- aside 부분 -->

			<tiles:insertAttribute name="aside" />

			<!-- --------------------------- main --------------------------------------- -->


<<<<<<< HEAD
			<tiles:insertAttribute name="body" />




=======
			<tiles:insertAttribute name="main" />
		
		
			
>>>>>>> 8678eaea59cd9956a8662fe3c3edb577a53c96eb
		</div>
	</div>

	<!-- ------------------- <footer> --------------------------------------- -->

	<tiles:insertAttribute name="footer" />



</body>

</html>