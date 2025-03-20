package Sriza.designPattern.classActivity3;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create subject (news agency)
        NewsAgency newsAgency = new NewsAgency();

        // Create observers (news channels)
        Observer cnn = new NewsChannel("CNN");
        Observer bbc = new NewsChannel("BBC");

        // Register observers
        newsAgency.addObserver(cnn);
        newsAgency.addObserver(bbc);

        // Publish news
        newsAgency.publishNews("Breaking News: Observer Pattern Explained!");

        // Unregister BBC and publish another news -- do this secondly to show how the notification works
//        newsAgency.removeObserver(bbc);
//        newsAgency.publishNews("Latest Update: Java Design Patterns in Action!");
    }
}
