<%-- 
    Document   : bacheca
    Created on : 4-mag-2017, 11.54.37
    Author     : Pc
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Bacheca: NerdBook</title>
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
                    <li><a href="login.html" class="bar"><em>Login</em></a></li>
                    <li><a href="descrizione.html" id="des" class="bar"><em>Descrizione</em></a></li>
                    <li id="logout"><a href="login.html" id="log" class="bar" ><em>Logout</em></a>
                </ul>
            </div>
        </div>
        <div id="pagebody">
            <jsp:include page="sidebar.jsp"/>
            <div id="content">
                <h3>Bacheca</h3>
            <div id="post1" class="post">
                <div id="immagineprofilo1" class="pimg" >
                    <img title="fotoprofilo" alt="Foto di Pina" src="https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQR3iYzJSusQLe-kXSE79ZLaOJgc7AVtE-aupLklWIf6DR5XxwG" width="40" height="40">
                </div>
                <div id="nomeutente1"  class="pname">
                    <b>Pina Silvestra</b>
                </div>
                <div id="postbody1" class="pbody">
                    <p>Ciao ragazzi, mi sono appena iscritta a NerdBook.
                        Non vedo l'ora di trovare il nerd giusto per me!</p>
                </div>
            </div>
            <div id="post2" class="post">
                <div id="immagineprofilo2" class="pimg">
                    <img  title="fotoprofilo" alt="Foto di Mario Gioia"
                     src="https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcROkMqP46yYiBrRi6WtohGuQZMAf99LbmfE5aeKUT9OgG3G8ILYEQ" width="40" height="40">
                </div>
                <div id="nomeutente2"  class="pname">
                    <b>Mario Gioia</b>
                </div>
                <div id="postbody2" class="pbody">
                    <p>Vi allego questa pic stra divertente!</p>
                    <img id="postimmage" title="Allegato" alt="Allegato"
                    src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ25KlytT5BWd-JSHBVKs9RB0VlzpPD0h5L59dGmupomN_RfDVfaw" width="120" height="120">
                </div>
            </div>
            <div id="post3" class="post">
                <div id="immagineprofilo3" class="pimg">
                    <img title="fotoprofilo" alt="Foto di Alfonso Signorile"
                     src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSeosYPEZ0_-WAh6lwW3c-iJNlz_OdPLpW8-Rf758Qv-bkp70_nQ" width="40" height="40">
                </div>
                <div id="nomeutente3" class="pname" >
                    <b>Alfonso Signorile</b>
                </div>
                <div id="postbody3" class="pbody">
                    <p>Domani al Lucca Comics ci sarò anche io,
                       Non perdetevi il mio bellissimo cosplay!
                       Vi allego l'evento.</p>
                    <a href="http://www.justnerd.it/2016/11/03/lucca-comics-games-2017-svelate-le-date-ufficiali-della-prossima-edizione/">
                        http://www.justnerd.it/2016/11/03/lucca-comics-games-2017-svelate-le-date-ufficiali-della-prossima-edizione/
                    </a>
                </div>
            </div>
        
            </div>
        </div>
    </body>
</html>