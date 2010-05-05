import recordindustry.*

class BootStrap {

    def init = { servletContext ->
        new User(email:'jiseruk', password:'toten').save()    
    }
    def destroy = {
    }
} 
