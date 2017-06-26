package ii_collections

fun example7() {
    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }

    result == mapOf(1 to listOf("a", "b"), 2 to listOf("ba", "ad"), 3 to listOf("ccc"))
}

fun Shop.groupCustomersByCity(): Map<City, List<Customer>> {
    // TODO: More Kotlin-esque way of doing this...
    // Return a map of the customers living in each city
    var customersByCity = HashMap<City, MutableList<Customer>>()
    for (customer in customers) {
        if(customersByCity.containsKey(customer.city)) {
            customersByCity[customer.city]?.add(customer)
        } else {
            customersByCity.put(customer.city, mutableListOf(customer))
        }
    }

    return customersByCity
}
