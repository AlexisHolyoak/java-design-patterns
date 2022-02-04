package abstractfactory;

public class LinuxDeluxeHostingPlan implements DeluxeHostingPlan {

    @Override
    public String getFeatures() {
        return "Linux Deluxe Hosting";
    }

}
