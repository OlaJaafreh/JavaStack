<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

    
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Ninja Gold</title>
        <link rel="stylesheet" type="text/css" href="/css/style.css">
        

    </head>
    <body>
       
            
            <div class="earnGold">
                <label for="YourGold">Your Gold:</label>
                <span id="YourGold"><c:out value="${Yourgold}"/></span>
                <form method="post" action="/reset"> 
                 <button type="submit" name="reset" value="farm">Reset</button>
				</form>            
            </div>
            
            
             <form method="post" action="/FindGold"> 
             <div class="sqGold">
                <div class="farm">
                    <h1>Farm</h1>
                    <h3>(earns 10-20 gold)</h3>
                    <button type="submit" name="FCHQ" value="farm">Find Gold!</button>
                </div>
                
    
                <div class="Cave">
                    <h1>Cave</h1>
                    <h3>(earns 5-10 gold)</h3>
                    <button type="submit" name="FCHQ" value="cave">Find Gold!</button>
                </div>
                
                
                <div class="House">
                    <h1>House</h1>
                    <h3>(earns 2-5 gold)</h3>
                    <button type="submit" name="FCHQ" value="house">Find Gold!</button>
                </div>
               
    
                <div class="Quest">
                    <h1>Quest</h1>
                    <h3>(earns/takes 0-50 gold)</h3>
                    <button type="submit" name="FCHQ" value="quest">Find Gold!</button>
                </div>
               
            </div>
             </form>
            
            
        
    
        <div class="tail">
            <label for="ActivitiesTextArea">Activities</label> <br>
            
            <div id="ActivitiesTextArea" >
            
            <%-- <p> <c:out value="${activities}"/>  </p>
            <br> --%>
            
            
            <c:forEach var="activity" items="${activities}">
    <c:choose>
        <c:when test="${fn:contains(activity, 'earned')}">
            <p class="green"><c:out value="${activity}"/></p>
        </c:when>
        <c:otherwise>
            <p class="red"><c:out value="${activity}"/></p>
        </c:otherwise>
    </c:choose>
    <br>
</c:forEach>
            
            
                
                
            </div>
            
        </div>
    </body>
    </html>
    