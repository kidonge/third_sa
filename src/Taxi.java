public class Taxi extends Transport{
    String destination;
    int distance;
    int basicDis = 1;
    int basicFee = 3000;
    int feePerDis = 1000;
    int totalFee;

    Taxi(int number){
        super(number, 4, 0);
    }

    @Override
    void changeFuel(int amount) {
        fuel += amount;
        if(fuel <10) {
            changeState(-1); // 운행 불가 상태로 변경
        }
    }


    @Override
    void changeState(int state) {
        this.state = state;
    }

    @Override
    void printState() {
        if (state == 0)
            System.out.println("상태 = 일반");
        else if(state == -1)
            System.out.println("상태 = 운행불가");
        else if(state == 1)
            System.out.println("상태 = 운행중");
    }

    int ride(String destination, int distance, int passenger){
        if(state != 0)
            return 0;

        curPass = 0;
        curPass += passenger;

        if(curPass > maxPass){
            System.out.println("최대 승객 수 초과");
            curPass -= passenger;
            return 0;
        }
        changeState(1);
        this.destination = destination;
        this.distance = distance;
        totalFee += basicFee + (distance- basicDis) * feePerDis; // 누적
        return basicFee + (distance- basicDis) * feePerDis; // 지금 운행 지불
    }
}
