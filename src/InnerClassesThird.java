import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class InnerClassesThird {

    interface IReaction {
        void methodAction();
    }

     class OuterClass{
        private String instanceCode = " ";

        public void forceMethodFire(IReaction innerClass){
            innerClass.methodAction();
        }
         IReaction getInnerClassInstance(){

             class AllInnerClass extends OuterClass implements IReaction{
                @Override
                public void methodAction(){
                    System.out.println("Do not be Jared Leto");
                }

                public void OuterClassLoopFactoryMethod(){
                    for(int i = 0; i <= 10; i++){
                        OuterClass outerClass = new OuterClass();
                        outerClass.getInnerClassInstance().methodAction();
                    }
                }
                public void newInstanceCode(int i){
                    OuterClass.this.instanceCode = String.valueOf(i);
                    System.out.println(OuterClass.this.instanceCode);
                }
            }

            AllInnerClass innerClassInstance;
            innerClassInstance = new AllInnerClass();
            return innerClassInstance;
        }
    }
}
