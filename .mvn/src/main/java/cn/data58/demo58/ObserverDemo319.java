package cn.data58.demo58;

// 20220319,源自：https://en.wikipedia.org/wiki/Observer_pattern

public class ObserverDemo319 {
    public static void main(String[] args) {
        System.out.println("Enter Text : ");
        EventSource319 eventSource = new EventSource319();

        eventSource.addObserver(event -> {
            System.out.println("Received response: " + event);
        });

        eventSource.scanSystemIn();
    }
}