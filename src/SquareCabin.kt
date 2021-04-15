class SquareCabin(var residents: Int, val length: Double): Dwelling(residents) {
    /**
     * The val capacity is to declare how mush people
     * can living in the house
     */
    override val capacity: Int
        get() = 6

    /**
     * The val buildingMaterial is to declare what the
     * material will be construct the house
     */
    override val buildingMaterial: String
        get() = "Wood"

    /**
     * The function floorArea is to calculate an area
     * in the house
     */
    override fun floorArea(): Double {
        return length * length
    }
}