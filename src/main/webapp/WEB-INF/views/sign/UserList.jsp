<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="user_list">
<table id="userlist_table">
  
  <tr>
    <th>No.</th>
    <th>ID</th>
    <th>NAME</th>
    <th>PHONE NUMBER</th>
  </tr>
<c:forEach var="sign" items="${signs}" varStatus="status">
  <tr>
    <td>`${status.count}`</td>
    <td>`${sing.userid}`</td>
    <td>`${sign.telephone}`</td>
  </tr>

    <p>${status.count} : `${name}` /></p>

</c:forEach>
</table>>


</div>
<script src="${javascript}/store/join.js"></script>
<script>


</script>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>