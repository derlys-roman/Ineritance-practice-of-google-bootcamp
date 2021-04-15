class RoundTower(residents: Int, radius: Double, val floors: Int = 2) : RoundHut(residents, radius) {
    /**
     * The val capacity is to declare how mush people
     * can living in the house
     */
    override val capacity: Int
        get() = 4 * floors

    /**
     * The val buildingMaterial is to declare what the
     * material will be construct the house
     */
    override val buildingMaterial: String
        get() = "Stone"


    /**
     * The function floorArea is to calculate an area
     * in the house
     */
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}