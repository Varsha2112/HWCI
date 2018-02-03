<%-- 
    Document   : login
    Created on : 6 Oct, 2017, 6:33:48 PM
    Author     : Deepak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/login.css">
        <style>
            #rect{
              height: 200px;
              width: 48%;
              background-color: pink;
              margin: 10px;
              float:left;
                 }
            

        </style>
    </head>
    <body>
        <header>
            <img id="logo1" src="logo/logo_1.png">
<!--            <h1>Healthy Wealthy Clean India</h1>
            <h3>Swatch Bharat Started With a Change in Your Habit Stop Littering </h3-->
<div id="log">
    <h1>Healthy Wealthy Clean India</h1>
    <h3>Swaatch Bharat Started With a Change in Your Habit Stop Littering </h3>
</div>
<img id="logo2" src="logo/logo2.png">

        </header>
        <div id="head">
            
            <div id="head1">
            <ul>
                <a href="homejsp.jsp"><li>Home</li></a>
                 <a href="#"><li>About</li></a>
                  <a href="contectus.jsp"><li>Contact Us</li></a>
                   <a href="#"><li>Admin</li></a>
                   <a href="login.jsp"><li>Login</li></a>
               
            </ul>    
                
                
            </div>
        </div>
        <div id="main">
            <img id="img1" src="img/baner1.PNG">   
            <h2>LOGIN OR REGISTER </h2>
            <div id="leck">
                <span><b>LOGIN</b></span><b>FORM</b>
                <img id="line" src="logo/line2.png">
                <form>
                    <span class="sp1">Enter User Name : </span><input type="text" placeholder="User Name"><br>
                    <span class="sp1">Enter Password : </span><input tyoe="password" placeholder="Password"><br>
                    <input style="border:none;margin-left: 150px; width: 200px" type="submit" value="Login">
                </form>
            </div>
            <div id="right">
                 <span><b>REGISTER</b></span><b>FORM</b>
                <img id="line" src="logo/line2.png">
                <form>
                    <span class="sp1">Enter User Name : </span><input type="text" placeholder="User Name"><br>
                    <span class="sp1">Enter Email : </span><input tyoe="email" placeholder="example@gmail.com"><br>
                    <span class="sp1">Enter Password : </span><input tupe="password" placeholder="Password"><br>
                    <span class="sp1">Enter Re-Password : </span><input tupe="password" placeholder="Re-Password"><br>
                    <input style="border:none;margin-left: 150px; width: 200px" type="submit" value="Register">
                </form>
 
                
            </div>
        </div>
         <footer>
               <div id="fot1">
          <h5>Navigation</h5>
            <ol>
                
                <a href="#top"><li>Home</li></a>
                <a href="#"><li>About</li></a>
                <a href="contectus.jsp"><li>Contact</li></a>
                <a href="login.jsp"><li>Login</li></a>
            </ol>
          </div>
            <div id="fot2">
              <h6>Healthy Wealthy Clean India</h6>
               <p id="pet1">Swatch Bharat Mission is Way of to clean the all around<br> india
                in the form of Healthy India because people of india<br>  is don't infected by any diseases</p>
                <img id="img4" src="logo/Swatch-Bharat.png">
            </div>
        </footer>
        <div id="sub_fut">
            <marquee scrollamount="4" >
              <spam id='ped'>Mission Swatch Bharat aspired to realize Gandhi Ji's dream of a Clean India through Jan Bhagidari. Together we can make a big difference.&nbsp;&starf;&nbsp;&copy;&nbsp;Copyright 2017-18 HTML CSS All Rights Reserved</spam>
          </marquee>
        </div>
    </body>
</html>
