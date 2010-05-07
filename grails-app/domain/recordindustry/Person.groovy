package recordindustry

class Person {
    String name
    static hasMany = [entities:LegalEntity]

    static constraints = {
    }
}
