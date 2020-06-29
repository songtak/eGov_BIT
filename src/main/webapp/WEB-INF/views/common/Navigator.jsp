<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


  <Topnav>
      <div id="topnav" style="font-size: 24px; color: black; overflow: hidden; background-color: #00ff00;">
      
        <span id="a" style="display: block; color: black; text-align: center; padding: 14px 16px; text-decoration: none; float:left"> FIND </span>
        <span id="b" style="display: block; color: black; text-align: center; padding: 14px 16px; text-decoration: none; float:left"> LET'S GO FLOATING </span>
        <span id="login" style="display: block; color: black; text-align: center; padding: 14px 16px; text-decoration: none; float:right">SIGN IN</span>
        <button id="a_join" style="display: block; color: black; text-align: center; padding: 14px 16px; text-decoration: none; float:right">SIGN UP</button>
    </div>
  </Topnav>
  
<script>
$('#a_join').click(function() {
	location.href = `${context}/sign/join`
})

</script>



