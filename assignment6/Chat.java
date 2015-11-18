package Thread;

class Chat {
    boolean flag = false;

    public synchronized void Question(String msg) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //System.out.println(msg);
        System.out.print(msg);
        flag = true;
        notify();
    }

    public synchronized void Answer(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //System.out.println(msg);
        System.out.print(msg);
        flag = false;
        notify();
    }
}

class PokerNumber implements Runnable {
    Chat m;

    public PokerNumber(Chat m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    public void run() {
    	String snumber;
        for (int i = 0; i < 26; i++) {
        	snumber = String.valueOf((i+1)*2-1) + String.valueOf((i+1)*2);
            m.Question(snumber);
        }
    }
}

class CharSequence implements Runnable {
    Chat m;

    public CharSequence(Chat m2) {
        this.m = m2;
        new Thread(this, "Answer").start();
    }

    public void run() {
    	char ch = 'A';
    	while( ch <= 'Z' ) {
    		m.Answer(String.valueOf(ch));
    		ch++;
    	}
    }
}