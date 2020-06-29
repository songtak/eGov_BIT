<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



  <div id="back" style="background: black;">

        <div class="container">
            <label style="font-size:23px; color:#ffffff">ID</label>
            <input style="width: 100%; padding: 12px 20px; margin: 0px 0px 19px 0px; display: inline-block;
        					border: 1px solid #00ff00; box-sizing: border-box;" type="password" type="id" placeholder="ENTER ID" required>

            <label style="font-size:23px; color:#ffffff">PASSWORD</label>
            <input style="width: 100%; padding: 12px 20px; margin: 0px 0px 19px 0px; display: inline-block;
        					border: 1px solid #00ff00; box-sizing: border-box;" type="password"  placeholder="ENTER PASSWORD" required>

           <label style="font-size:23px; color:#ffffff">NAME</label>
            <input style="width: 100%; padding: 12px 20px; margin: 0px 0px 19px 0px; display: inline-block;
        					border: 1px solid #00ff00; box-sizing: border-box;" type="name" placeholder="ENTER NAME" required>


            <label style="font-size:23px; color:#ffffff">PHONENUMBER</label>
            <input  style="width: 100%; padding: 12px 20px; margin: 0px 0px 19px 0px; display: inline-block;
        					border: 1px solid #00ff00; box-sizing: border-box;" type="phonenumber"  @keyup.enter="phonenumber"  v-model="phoneNumber" placeholder="ENTER PHONENUMBER" required>

            <label style="font-size:23px; color:#ffffff">BIRTH</label>
            <input  style="width: 100%; padding: 12px 20px; margin: 0px 0px 19px 0px; display: inline-block;
        					border: 1px solid #00ff00; box-sizing: border-box;" type="birth" placeholder="ENTER BIRTH" required>


            <label style="font-size:23px; color:#ffffff;">SEX</label>
            <input  style="width: 100%; padding: 12px 20px; margin: 0px 0px 19px 0px; display: inline-block;
        					border: 1px solid #00ff00; box-sizing: border-box;" type="sex" placeholder="ENTER SEX" required>


            <button id="join_btn"  @click="join" style="font-size:27px; margin:40px 0px 0px 0px; background-color: #00ff00; color: black;" type="submit">SIGN UP</button>

        </div>
        <div class="container" style="background-color:black" >
           <button type="button" style="background-color: #00ff00; color: black;" class="cancelbtn">CANCEL</button>
        </div>

</div>




</div>

  </div>

</body>
</html>

<script>
$('#mainimg').click(function(){
	alert("<%=application.getContextPath()%>")
	location.href = "<%=application.getContextPath()%>/"
})
</script>