package recordindustry

class Person {
    String firstName
    String lastName
    static hasMany = [entities:LegalEntity]
    
    static constraints = {
        cuit(blank: false, matches: /^\d{2}\-\d{8}\-\d{1}$/, unique: true)
    }
}
