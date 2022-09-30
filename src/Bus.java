public class Bus extends Transport {
    // static int bus_number_cnt =0;
    int fee = 1000;      // 요금

    Bus(int number){
        super(number, 30, 1);
    }


    // 현재 버스 상태
    @Override
    void printState(){
        if(state == 0){
            System.out.println("상태 = 차고지행");
        }
        else
            System.out.println("상태 = 운행중");
    }

    // 연료 변화
    @Override
    void changeFuel(int amount) {
        fuel += amount;
        if(fuel < 10){
            System.out.println("주유량 = " + fuel);
            System.out.println("주유 필요");
            changeState(0);
        }
        else
            System.out.println("주유랑 = " + fuel);

    }

    // 승객 탄다.
    int ride(int passenger) {
        fee = 1000;
        curPass += passenger;
        if (curPass > maxPass) {
            System.out.println("최대 승객 수 초과");
            curPass -= passenger;
            return 0;
        } else {
            int leftSeat = maxPass - curPass;
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + leftSeat );
            fee *= passenger;
            System.out.println("요금 확인 = " + fee);
        }
        return 0;
    }
}
