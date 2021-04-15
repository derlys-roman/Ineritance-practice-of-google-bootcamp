fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    val roundHut = RoundHut(3, 10.0)
    val roundTower = RoundTower(4, 10.0, 2)

    with(squareCabin) {
        println("\n================ \nSquare Cabin")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has Room? ${hasRoom()}")
        getRoom()
        println("Floor area:%.2f".format(floorArea()))
    }

    with(roundHut) {
        println("\n================ \nSquare Cabin")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has Room? ${hasRoom()}")
        getRoom()
        println("Floor area:%.2f".format(floorArea()))
        println("Carpet size: ${calculateMaxCarpetSize()}")
    }

    with(roundTower) {
        println("\n================ \nSquare Cabin")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has Room? ${hasRoom()}")
        getRoom()
        println("Floor area:%.2f".format(floorArea()))
        println("Carpet size: ${calculateMaxCarpetSize()}")
    }

}