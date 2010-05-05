class SecurityFilters {
    def filters = {
        loginCheck(controller:'company|movie', action:'*') {
            before = {
                log.debug "controller: ${params.controller}"
                if (params.controller == null) { 
                    redirect(controller:'user', action:'login')
  		    return true 
                } else if(!session.user && !actionName.equals('login')) { 
                    redirect(controller:'user', action:'login') 
                    return false 
                } 
            }
        } 
    } 
}   
