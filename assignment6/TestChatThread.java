package Thread;

import java.util.function.Consumer;

public class TestChatThread {
	public static void main(String[] args) {
        Chat m = new Chat();
        //Q q = new Q();
        new PokerNumber(m);
        new CharSequence(m);
        //new Producer(q);
        //new Consumer1(q);
    }
}
