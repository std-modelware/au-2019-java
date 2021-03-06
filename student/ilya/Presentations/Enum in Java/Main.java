package new_enum.java;

public class Main {
    public static void main(String[] args) {
        // объявление перечисления
        //перечисление == новый тип, поэтому можно объявить переменную:
        Room room1 = Room.KITCHEN;
        System.out.println(room1);

        //можно использовать для хранения данных в классах

        //методы enum

        Room[] rooms = Room.values();
        for (Room r : rooms) {
            System.out.print(r + " ");
        }
        System.out.println();

        //найти порядковый номер, начиная с 0
        System.out.println(Room.BEDROOM.ordinal());

        // в перечислениях можно определить конструктор, переменные и методы

        System.out.println(Room2.HALL.getNum(5));

        // для констант можно менять общие методы

        System.out.println(Room2.LIVING_ROOM.getNum(5));

    }

    enum Room {
        DINING_ROOM,
        KITCHEN,
        LIVING_ROOM,
        BEDROOM,
        BATHROOM,
        HALL,
        OFFICE
    }


    enum Room2 {
        DINING_ROOM(1),
        KITCHEN(2),
        LIVING_ROOM(3) { // для констант можно создавать собственные методы
            public int getNum(int x) {
                return x*2;
            }
        },
        BEDROOM(4),
        BATHROOM(5),
        HALL(6),
        OFFICE(7);

        private int num;
        Room2 (int i) {
            this.num = i;
        }
        public int getNum(int x) {
            return x+this.num;
        }
    }
}
