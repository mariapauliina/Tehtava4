<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="nayta.jsp" method="post">
Hakusana: <input type="text" name="Hakusana"><input type="submit"value="hae"><br>


<table id ="listaus">


<script scr="scripts/main.js"></script>
	<thead>
	<tr>
	<th>asiakas_id</th>
	<th>etunimi</th>
	<th>sukunimi</th>
	<th>puhelin</th>
	<th>sposti</th>
	</thead>
	<tbody id = "tbody">
	</tbody>
	</tr>
</table>
<span id= "ilmo"></span>
<script>

			haeAsiakkaat();
		
</script>
</body>
</html>