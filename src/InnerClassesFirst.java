 class InnerClassesFirst {

     void AirplaneRunner(){
        Airplane VriskaPlane = new Airplane(8,"8riska", "8 flyer", 10);
        VriskaPlane.showEngines();
    }


    interface IEngine{
        void engage();
        void rewUp();
        void slowDown();
        int showCurrentSpeed();
        void stop();
    }


    class Airplane{
        public String model;
        public String name;
        private AirplaneEngine[] engines;

        Airplane(int engineNumber, String model, String name, int enginesTopSpeed){
            engines = new AirplaneEngine[engineNumber];
            for (int i = 0; i< engineNumber; i++){
                AirplaneEngine airplaneEngine = new AirplaneEngine(enginesTopSpeed, i);
                engines[i] = airplaneEngine;
            }
        }

        void showEngines(){
            if(engines != null){
                for (AirplaneEngine engine: engines) {
                    System.out.println( engine.toString());
                }
            }
        }

            class AirplaneEngine implements IEngine{
                private int topSpeed;
                private int currentSpeed;
                private boolean isOperating;
                private int engineNumber;

                AirplaneEngine(int engineTopSpeed, int assignedEngineNumber){
                    topSpeed = engineTopSpeed;
                    engineNumber = assignedEngineNumber+1;
                }

                public boolean isOn(){
                    return isOperating;
                }

                @Override
                public void engage() {
                    isOperating = true;
                }

                @Override
                public void rewUp() {
                    if (currentSpeed <= 0){
                        isOperating = true;
                    }
                    currentSpeed += 10;
                }

                @Override
                public void slowDown() {
                    currentSpeed -= 10;
                    if (currentSpeed <= 0){isOperating = false; currentSpeed = 0;}
                }

                @Override
                public int showCurrentSpeed() {
                    return currentSpeed;
                }

                @Override
                public void stop() {
                    isOperating = false;
            //        Airplane.this.showEngines();
                }

                @Override
                public String toString(){
                    String onOff = isOperating ? "on" : "off";
                    return "This is engine # " + engineNumber + ", it has top speed of " + topSpeed + ", current speed of "
                            + currentSpeed + " and is currently " + onOff + ".";
                }
            }
    }
}
