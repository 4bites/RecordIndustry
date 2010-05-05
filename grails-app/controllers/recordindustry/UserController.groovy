package recordindustry

class UserController {
    def scaffold = true	
    def login = { }
    def handleLogin = {
	if(request.get) render(view:"login")
	else {
            def user = User.findByEmail(params.email)
            if(user){  
	        if(user.password == params.password) {
	            log.debug 'Usuario $user.email valido'
	            session.user = user
                    redirect(controller:'company')
	        } else {
		    log.debug 'Password de ${params.email} invalida'
	            render(view:'login', model:[message:"Password incorrect"])
	        }
            } else {
	        log.debug 'Usuario ${params.email} invalido'
	        render(view:'login', model:[message:"User not found"])
	    }
        }
    }
}
