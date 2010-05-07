   <g:form name="loginForm" action="handleLogin" method="post">
      <g:textField name="email" />  
      <g:textField name="password" /> 
      <g:hiddenField name="redirect" value="${params.redirect}" /> 
      <g:actionSubmit value="Login" action="handleLogin" />  
   </g:form>  
   <g:if test="${flash.message}">
      <div class="flash">${message}</div>
   </g:if>  	
