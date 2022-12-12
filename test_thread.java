public class test_thread {
    public test_thread listCurrentTread() {
        //ThreadGroup grupOne = new ThreadGroup("Executor");
        //Thread ex1 = new Thread(grupOne, "Executor 1");
        //Thread ex2 = new Thread(grupOne, "Executor 2");;

        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int numThreads = currentGroup.activeCount();
        Thread[] listOfThread = new Thread[numThreads];

        currentGroup.enumerate(listOfThread);

        for (int i = 0; i < numThreads; i++) {
            System.out.println("Thread #" + i + " = " + listOfThread[i].getName());
        }
        return null;
    }

    public static void main(String[] args){
        test_thread current = new test_thread().listCurrentTread();
        System.out.println(current);
    }
}

