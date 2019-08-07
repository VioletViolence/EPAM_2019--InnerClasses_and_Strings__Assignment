 class InnerClassesForth {

    interface IReaction {
        void methodAction();
    }

    class OuterClass{

        private int someValue = 0;

         IReaction getInnerClassInstance(){

            return new IReaction() {
                @Override
                public void methodAction(){
                    System.out.println("Do not be Jared Leto");
                }
            };
        }
    }
}
