import kotlin.math.PI
import kotlin.math.sqrt

open class RoundHut(residents: Int, val radius: Double): Dwelling(residents) {
    /**
     * The val capacity is to declare how mush people
     * can living in the house
     */
    override val capacity: Int
        get() = 4

    /**
     * The val buildingMaterial is to declare what the
     * material will be construct the house
     */
    override val buildingMaterial: String
        get() = "Straw"

    /**
     * The function floorArea is to calculate an area
     * in the house
     */
    override fun floorArea(): Double {
        return PI * radius * radius
    }

    /**
     * The function calculateMaxCarpetSize() is to calculate
     * a max size of carpet is settable in the floor
     */
    fun calculateMaxCarpetSize(): Double {
        val diameter = 2 * radius
        return sqrt(diameter * diameter / 2)
    }
}