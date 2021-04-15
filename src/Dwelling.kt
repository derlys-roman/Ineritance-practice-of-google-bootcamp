abstract class Dwelling(private var residents: Int) {
    /**
     * The val capacity is to declare how mush people
     * can living in the house
     */
    abstract val capacity: Int

    /**
     * The val buildingMaterial is to declare what the
     * material will be construct the house
     */
    abstract val buildingMaterial: String

    /**
     * The function hasRoom() is to see if there is
     * space in the house
     */
    fun hasRoom(): Boolean{
        return residents < capacity
    }

    /**
     * The function floorArea is to calculate an area
     * in the house
     */
    abstract fun floorArea(): Double

    /**
     * The function getRoom() is to add +1 people in the
     * variable residents
     */
    fun getRoom() {
        if (capacity > residents) {
            residents++
            println("You got a room!")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }
}