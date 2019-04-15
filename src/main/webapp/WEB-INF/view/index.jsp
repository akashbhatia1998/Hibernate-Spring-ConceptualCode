<%--
  Created by IntelliJ IDEA.
  User: affordplan
  Date: 5/4/19
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>sob e</title>
</head>
<body>
   <form action = "addAlien" method="post">
       <h3> Add Data</h3>
       <p>aid</p><br>
       <input type="text" name="aid">
       <p>aname</p><br>
       <input type="text" name="aname">
       <p>phone</p><br>
       <input type="text" name="phone">
       <input type = "submit" value = "submit">
   </form>
   <hr>
   <form action = "getAliens" method="get">
       <h3>All data</h3>
       <input type = "submit" value = "submit">
   </form>

   <hr>

   <form action = "getAlien" method="get">
       <h3>Get aid</h3><br>
       <input type="text" name="aid">
       <input type = "submit" value = "submit">
   </form>
   <hr>

   <form action = "Delete" method="get">
       <h3>Delete aid</h3><br>
       <input type="text" name="aid">
       <input type = "submit" value = "submit">
   </form>
   <hr>


   <form action = "Update" method="get">
       <h3>Update Phone no</h3><br>
       <p>aid</p>
       <input type="text" name="aid"><br>
       <p> Alter phn no.</p>
       <input type="text" name="phn_no">
       <input type = "submit" value = "submit">
   </form>
   <hr>
</body>
</html>
