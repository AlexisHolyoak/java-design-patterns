package proxy.remote;

public class Client {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        // TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        //System.out.println(service.getTimeline("Microservices"));

        try {
            service.postToTimeline("Microservices", "Some message that shouldn't go through.");
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
