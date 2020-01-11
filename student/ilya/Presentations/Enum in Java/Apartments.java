package new_enum.java;

public class Apartments {
    private String name;
    private Room room1 = Room.HALL;
    private Room room2 = Room.BATHROOM;
    private Room room3;

    Apartments (String name, Room r) { // в конструкторе можно инициализировать эту переменнюую
        this.name = name;
        this.room3 = r;
    }

}
enum Room {
    DINING_ROOM,
    KITCHEN,
    LIVING_ROOM,
    BEDROOM,
    BATHROOM,
    HALL,
    OFFICE;
}


