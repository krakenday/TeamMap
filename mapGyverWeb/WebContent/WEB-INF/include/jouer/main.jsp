<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<div class="container">
	<form method="post" target="<%= request.getContextPath() %>/../jouer/main"> 
		<div class="row">
      
	   		<div class="col-lg-3 col-md-4 col-xs-6 thumb">
	        	<a class="thumbnail" href="http://localhost:8080/mapGyverWeb/assets/img/jouer1.jpg">
	            	<img class="img-thumbnail"
	                	src="http://localhost:8080/mapGyverWeb/assets/img/jouer1.jpg"
	                    alt="Another alt text">
	            </a>
	            	<input type="radio" name="optradio" checked>
	    	</div>
	    	
	    	<div class="col-lg-3 col-md-4 col-xs-6 thumb">
	        	<a class="thumbnail" href="http://localhost:8080/mapGyverWeb/assets/img/jouer1.jpg">
	            	<img class="img-thumbnail"
	                	src="http://localhost:8080/mapGyverWeb/assets/img/jouer1.jpg"
	                    alt="Another alt text">
	            </a>
	            	<input type="radio" name="optradio">
	    	</div>
		</div>
		<div><button type="submit" class="btn btn-secondary btn-lg float-right">Voter</button></div>
	</form>  
</div>