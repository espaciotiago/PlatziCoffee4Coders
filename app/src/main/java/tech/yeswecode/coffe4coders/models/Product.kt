package tech.yeswecode.coffe4coders.models

class Product constructor(id: Int,
                          name: String,
                          summary: String,
                          description: String,
                          price: Double,
                          currency: String,
                          countryISO: String){
    val id = id
    val name = name
    val summary = summary
    val description = description
    val price = price
    val currency = currency
    val countryIso = countryISO
}