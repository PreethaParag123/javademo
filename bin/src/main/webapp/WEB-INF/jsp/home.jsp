<html>
<body id ="body"> 

</body>
<script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
<script> 
 function ListEmployees()
 {
 $.ajax({
		type : "GET",
		url : "/a/b"
	}).done(function(respjson) {
		respjson.forEach(function(emp) {
		$("body").append(emp.emp_name).append("<br>");
		});
	});
	}
 ListEmployees();
</script>
</html>