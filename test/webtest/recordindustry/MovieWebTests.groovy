package recordindustry



class MovieWebTests extends grails.util.WebTest {

    // Unlike unit tests, functional tests are sometimes sequence dependent.
    // Methods starting with 'test' will be run automatically in alphabetical order.
    // If you require a specific sequence, prefix the method name (following 'test') with a sequence
    // e.g. test001XclassNameXListNewDelete

   void test001XMovieXNew() {
	webtest('Checkear que se puede entrar al alta de pelicula solo estando logueado'){
            invoke '/movie/create'
	    verifyInputField(name:'email',formName:'loginForm', value:'')
	}
    }

}
