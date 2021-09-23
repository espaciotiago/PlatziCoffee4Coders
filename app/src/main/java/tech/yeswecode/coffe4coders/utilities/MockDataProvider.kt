package tech.yeswecode.coffe4coders.utilities

import tech.yeswecode.coffe4coders.models.Product

class MockDataProvider {
    companion object {
        fun listOfProducts(): List<Product> {
            return listOf(
                Product(
                    0,
                    "Café de Colombia",
                    "Nuestro esfuerzo y trabajo conjunto representa el sueño de amor por las montañas de nuestro país.",
                    "Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae. Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae.",
                    35.0,
                    "USD",
                    "COL"
                ),
                Product(
                    1,
                    "Café de Costa Rica",
                    "Nuestro esfuerzo y trabajo conjunto representa el sueño de amor por las montañas de nuestro país.",
                    "Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae. Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae.",
                    40.0,
                    "USD",
                    "CRI"
                ),
                Product(
                    2,
                    "Café de Nicaragua",
                    "Nuestro esfuerzo y trabajo conjunto representa el sueño de amor por las montañas de nuestro país.",
                    "Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae. Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae.",
                    45.0,
                    "USD",
                    "NIC"
                ),
                Product(
                    3,
                    "Café de Brasil",
                    "Nuestro esfuerzo y trabajo conjunto representa el sueño de amor por las montañas de nuestro país.",
                    "Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae. Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae.",
                    50.0,
                    "USD",
                    "BRA"
                ),
            )
        }

        fun getProductBy(id: Int): Product? {
            val list = MockDataProvider.listOfProducts()
            val product = list.find { it.id == id }
            return product
        }

        fun listOfCities(): List<String> {
            return listOf(
                "Ciudad de México, México",
                "La Habana, Cuba",
                "Cancún, México",
                "Medellín, Colombia",
                "Buenos Aires, Argentina",
                "Sao Paulo, Brasil",
                "Lima, Perú",
                "Montevideo, Uruguay",
                "Ciudad de Panamá, Panamá"
            )
        }
    }
}