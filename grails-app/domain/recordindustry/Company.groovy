package recordindustry

class Company {
    String name
    String description
    String cuit
    String address
    String homepage 
    static constraints = {
        name(blank: false)
	description(blank: false, maxSize:1000)
  	cuit(blank: false, matches: /^\d{2}\-\d{8}\-\d{1}$/, unique: true)
	address(blank: false, maxSize:100)
	homepage(url: true)
    }
}
