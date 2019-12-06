<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fm"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
  <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td colspan="100">商品信息展示页面</td>
			</tr>
			<tr>
				<td colspan="4">
					<form action="list" method="post">
						价格范围:<input type="text" name="lowPrice" value="${con.lowPrice}"> - <input type="text" name="heightPrice" value="${con.heightPrice}">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						百分比:<input type="text" name="lowSales" value="${con.lowSales}"> - <input type="text" name="heightSales" value="${con.heightSales}">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						排序:<select name="orderName" style="width: 100px">
							<option value="">-- 请选择  --</option>
							<option value="sales" ${con.orderName == "sales"?'selected':''}>百分比</option>
							<option value="price" ${con.orderName == "price"?'selected':''}>价格</option>
						</select>&nbsp;&nbsp;&nbsp;
						<select name="orderMethod" style="width: 100px">
							<option value="">-- 请选择  --</option>
							<option value="asc" ${con.orderMethod == "asc"?'selected':''}>升序</option>
							<option value="desc" ${con.orderMethod == "desc"?'selected':''}>降序</option>
						</select>
						
						<input type="submit" value="查询">
					</form>
				</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>编号</td>
				<td>名称</td>
				<td>价格</td>
				<td>已售百分比</td>
			</tr>
			<c:forEach items="${info.list}" var="l" varStatus="count">
				<tr>
					<td>${count.count }</td>
					<td>${l.gname }</td>
					<td>${l.price }</td>
					<td>${l.sales }</td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="100">
					<a href="list?pageNum=1">首页</a>
					<a href="list?pageNum=${info.prePage }">上一页</a>
					<a href="list?pageNum=${info.nextPage }">下一页</a>
					<a href="list?pageNum=${info.pages }">尾页</a>
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>