public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(2);

        // 두 버스 번호 값 비교.
        System.out.println("bus1 번호 : " + bus1.number + "    bus2 번호 : " + bus2.number);

        // 승객 두명 탑승
        bus1.ride(2);

        // 주유 -50 -> 남은 기름 :50
        bus1.changeFuel(-50);

        // 버스 상태 변화
        bus1.changeState(0);
        bus1.printState();
        bus1.changeFuel(10);
        bus1.changeState(1);

        // 최대 승객 수 보다 많은 승객 탑승
        bus1.ride(45);

        // 승객 다섯명 탑승
        bus1.ride(5);

        // 주유 -55
        bus1.changeFuel(-55);
        bus1.printState();

        System.out.println("-----------------------------------------------------------------");

        Taxi taxi1 = new Taxi(1);
        Taxi taxi2 = new Taxi(2);

        // 두 버스 번호 값 비교.
        System.out.println("taxi1 번호 : " + taxi1.number + "    taxi2 번호 : " + taxi2.number);

        // 주유량
        System.out.println("주유량 = " + taxi1.fuel);

        // 택시 상태
        taxi1.printState();

        // 승객 탑승 및 운행 정보
        int fee= taxi1.ride("서울역", 2, 2);
        System.out.println("탑승 승객 수 = " + taxi1.curPass );
        int leftSeat = taxi1.maxPass - taxi1.curPass;
        System.out.println("잔여 승객 수 = " + leftSeat);
        System.out.println("기본 요금 확인 = " + taxi1.basicFee);
        System.out.println("목적지 = " + taxi1.destination);
        System.out.println("목적지까지 거리 = " + taxi1.distance + "km");

        // 운행 요금
        System.out.println("지불할 요금 = " +  fee);

        // 택시 상태
        taxi1.printState();
        taxi1.state = 0;

        // 주유 변화
        taxi1.changeFuel(-80);

        // 승객 탑승 초과
        taxi1.ride("", 1, 5);

        // 승객 탑승
        fee = taxi1.ride("구로디지털단지역", 12, 3);
        System.out.println("탑승 승객 수 = " + taxi1.curPass );
        leftSeat = taxi1.maxPass - taxi1.curPass;
        System.out.println("잔여 승객 수 = " + leftSeat);
        System.out.println("기본 요금 확인 = " + taxi1.basicFee);
        System.out.println("목적지 = " + taxi1.destination);
        System.out.println("목적지까지 거리 = " + taxi1.distance + "km");
        System.out.println(fee);

        // 주유령 변화
        taxi1.changeFuel(-20);
        System.out.println("주유량 = " + taxi1.fuel);
        taxi1.printState();
        System.out.println("누적요금 = " + taxi1.totalFee);


    }
}
