package ii_collections

import ii_collections.data.customers
import ii_collections.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class _13_Introduction {
    @Test fun testSetOfCustomers() {
        println(customers.values.toSet())
        assertEquals(customers.values.toSet(), shop.getSetOfCustomers())
    }
}
