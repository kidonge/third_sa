public class Transport {
    int number;
    int fuel = 100;
    int speed = 0;
    int acceleration;
    int maxPass;
    int curPass = 0;
    int state;


    public Transport(int number, int maxPass, int state) {
        this.number = number;
        this.maxPass = maxPass;
        this.state = state;
    }


    void changeFuel(int amount){
        fuel += amount;
    }

    void changeState(int state){
        this.state = state;
        if(state!=1) curPass =0;
    }

    void printState(){
        System.out.println("대중교통 상태 출태");
    }

    void changeSpeed(int acceleration){
        speed += acceleration;
    }

    void leftSeat(){
        System.out.println(maxPass - curPass);
    }
}

