<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<title>Insert title here</title>
<script>
var bno = 3;

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

$(window).load(function(){
	getAllList();
	
	$('#replyAddBtn').click(function(){
		var replyer = $('#newReplyWriter').val();
		var replytext = $('#newReplyText').val();
		
		$.ajax({
			type : 'POST',
			url : '/replies',
			headers : {
				'Content-Type' : 'application/json',
				'X-HTTP-Method-Override' : 'POST'
			},
			dataType : 'text',
			data : JSON.stringify({
				bno : bno,
				replyer : replyer,
				replytext : replytext
			}),
			success : function(result) {
				if(result == 'SUCCESS') {
					alert('등록 되었습니다.');
					getAllList();
				}
			}
		});
	});
});
</script>
</head>
<body>
	<h2>Ajax Test Page</h2>
	
	<div>
		<div>
			REPLYER <input type='text' name='replyer' id='newReplyWriter'>
		</div>
		<div>
			REPLYER TEXT <input type='text' name='replytext' id='newReplyText'>
		</div>
		<button id='replyAddBtn'>ADD REPLY</button>
	</div>
	
	<ul id="replies">
	</ul>
	
</body>
</html>