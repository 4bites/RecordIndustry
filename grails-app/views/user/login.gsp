   <g:form name="loginForm" action="handleLogin" method="get">
      <g:textField name="email" />  
      <g:textField name="password" />  
      <g:actionSubmit value="Login" action="handleLogin" />  
   </g:form>  
   <g:if test="${flash.message}">
      <div class="flash">${message}</div>
   </g:if>  	
