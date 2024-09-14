public class Driver {
    public static void main(String[] args) {

    }

    class Vehicle{
        public void start(){
            System.out.println("Vehicle has started");
        }
        public void stop() {
            System.out.println("Vehicle has stopped");
        }
    }

    class driveable extends Vehicle{
        public void accelerating(){
            System.out.println("Vehicle accelerating");
        }
    }

    class rideable extends Vehicle{
        public void nonaccelerating(){
            System.out.println("Vehicle doesn't accelerate");
        }
    }

    class car extends driveable{
        @Override
        public void start() {
            System.out.println("car has started");
        }
    }
    class bus extends driveable{

    }
    class bicycle extends rideable{

    }
}
