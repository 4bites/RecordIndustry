package recordindustry

class LegalEntity {
    String name
    static hasMany = [persons:Person]
    static belongsTo = Person

    static constraints = {
    }
}
