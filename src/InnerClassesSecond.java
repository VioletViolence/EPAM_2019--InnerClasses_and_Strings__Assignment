public class InnerClassesSecond {

    interface IReaction {
        void methodAction();
    }

     public static class OuterInterface{

        private int newInt = 20;
        private char importantLetter = 'q';

         static InnerClass getInnerClassInstance(){
            InnerClass innerClassInstance;
            innerClassInstance = new InnerClass();
            return innerClassInstance;
        }

        public void forceMethodAction(InnerClass targetInner){
             targetInner.methodAction();
        }

        static class InnerClass implements IReaction{

             static void intAndCharChange(OuterInterface currentObject){
                 currentObject.newInt = 30;
                 currentObject.importantLetter = 'w';
                 System.out.println(currentObject.newInt + " " + currentObject.importantLetter);
             }
            @Override
             public void methodAction(){
                System.out.println("Method Action Action");
            }
        }
    }
}
