<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<title>Insert title here</title>
<script>
function getAllList() {
	$.getJSON("/replies/all/" + bno, function(data){
		//console.log(data.length);
		//alert(data.length);
		
		var str = "";
		console.log(data.length);
		
		$(data).each(
			function() {
				str += "<li data-rno='" + this.rno + "' clas'replyLi'>"
					+ this.rno + ":" + this.replytext
					+ "</li";
					
			}		
		);
		$("#replies").html(str);
	});
}
</script>
</head>
<body>
	<h2>Ajax Test Page</h2>
	
	<ul id="replies">
	</ul>
</body>
</html>