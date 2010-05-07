package recordindustry

class Movie {
    Company producer
    Company distributor
    Integer code
    String title
    Date avantPremiere 
    static constraints = {
	code(unique:true,nullable:false, max:999999)
	title(blank:false, minSize:1, maxSize:255)
	avantPremiere(nullable:true,min:new Date())
    }
}
