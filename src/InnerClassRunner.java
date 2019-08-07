public class InnerClassRunner {

    public static void main(String[] args) {

        // First class instance and runer
        InnerClassesFirst innerClassesFirst = new InnerClassesFirst();
        innerClassesFirst.AirplaneRunner();

        // Second class instance and runer
        InnerClassesSecond.OuterInterface.getInnerClassInstance().methodAction();
        InnerClassesSecond.OuterInterface.InnerClass.intAndCharChange(new InnerClassesSecond.OuterInterface());

        // Third class instance and runer
        InnerClassesThird innerClassesThird = new InnerClassesThird();
        InnerClassesThird.OuterClass outerClass = innerClassesThird.new OuterClass();
        outerClass.getInnerClassInstance().methodAction();

        // Forth class instance and runer
        InnerClassesForth innerClassesForth = new InnerClassesForth();
        InnerClassesForth.OuterClass outerClassForth = innerClassesForth.new OuterClass();
        outerClassForth.getInnerClassInstance().methodAction();
    }
}
