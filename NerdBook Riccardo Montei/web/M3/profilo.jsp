<%-- 
    Document   : profilo
    Created on : 4-mag-2017, 11.49.33
    Author     : Pc
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>

<html>
    <head>
        <title>Profilo: NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Riccardo Montei 65273">
        <meta name="keywords" content="nerdbook profilo user ">    
    
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <div id="header">
          
            <div id="title">
                <h1>Nerdbook</h1>
            </div>
            <div id="navbar">
                <ul class="list1">
                    <li><a href="login.html" class="bar"><em>Login</em></a></li>
                    <li><a href="descrizione.html" id="des" class="bar"><em>Descrizione</em></a></li> 
                    <li id="logout"><a href="login.html" id="log" class="bar"><em>Logout</em></a>
                </ul>
            </div>
        </div>
        
        <div id="pagebody" >
            <jsp:include page="sidebar.jsp"/>
            <div id="content">
            <h3>Dati utente</h3>
            <form action="#" method="post">
                <div id="nomeut">
                    <label class="profilelabel" for="nome">Nome</label>
                    <input type="text" name="nome" id="nome" class="box"/>
                </div>
                <div id="cognomeut">
                    <label class="profilelabel" for="cognome">Cognome</label>
                    <input type="text" name="cognome" id="cognome" class="box"/>
                </div>
                <div id="urlimmagineprofilo">
                    <label class="profilelabel" for="url">Url profile immage</label>
                    <input class="box" type="url" name="url" id="url" />
                </div>
                <div id="frasepres">
                    <label class="profilelabel" for="frase">Presentazione</label>
                    <textarea rows="4" cols="20" name="frase" id="frase" class="box"></textarea>
                </div>
                <div id="datanascita">
                    <label class="profilelabel" for="data">Nato il:</label>
                    <input type="text" name="data" id="data" class="box"/>
                </div>
                <div id="passutente">
                    <label class="profilelabel" for="pswd">Password</label>
                    <input type="password" name="pswd" id="pswd" class="box" />
                </div>
                <div id="confpassutente">
                    <label class="profilelabel" for="cpswd">Conferma Password</label>
                    <input type="password" name="cpswd" class="box" />
                </div>
                <div id="submit">
                    <button id="pbutton" type="submit"><b>Conferma</b></button>
                </div>   
            </form>
            </div>
        </div>
    </body>
</html>


