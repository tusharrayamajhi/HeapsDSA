
public class heap1 {
    static class Animal{
        void makesound(){
            System.out.println("animal make sound");
        }
    }
    static class dog extends Object{
        @Override
        protected void finalize(){
            System.out.println("obj called");
        }
    }
    public static void main(String[] args) {
        dog d1 = new dog();
        d1 = null;
        System.gc();
    }
}
