<%-- 
    Document   : login
    Created on : 4-mag-2017, 11.48.34
    Author     : Pc
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login: NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Riccardo Montei 65273">
        <meta name="keywords" content="nerdbook login accedi autenticazione">
        
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
         <div id="header">
            
            <div id="title">
                <h1>Nerdbook</h1>
            </div>
             <div id="navbar">
                 <ul class="list1">
                     <li><a href="descrizione.html" class="bar"><em>Descrizione</em></a></li>
                     <li><a href="profilo.html" class="bar"><em>Profilo</em></a></li>
                     <li><a href="bacheca.html" id="des" class="bar"><em>Bacheca</em></a></li> 
                 </ul>
            </div>
        </div>
        <div id="pagebody" class="Input-form">
            <h3 id="descriptionTitle">Login</h3>
            <form id="loginform" action="#" method="post">
                
                <div id="username">
                    <label for="corto">Username</label>
                    <input type="text" name="corto" id="corto" class="box"/>
                </div>
                <div id="password">
                    <label for="pswd">Password</label>
                    <input type="password" name="pswd" id="pswd" class="box"/>
                </div>
                <div id="submit">
                    <button id="lbutton" type="submit"><b>Conferma</b></button>
                </div>        
                </form>
            </div>
    </body>
</html>

