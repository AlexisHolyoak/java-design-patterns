package abstractfactory;

public abstract class HostingPlanAbstractFactory {
    public static final String WINDOWS = "Windows";
    public static final String LINUX = "Linux";

    public static HostingPlanAbstractFactory getHostingFactory(String type) {
        if (type.equals(HostingPlanAbstractFactory.WINDOWS)) {
            return new WindowsHostingPlanFactory();
        }
        if (type.equals(HostingPlanAbstractFactory.LINUX)) {
            return new LinuxHostingPlanFactory();
        }
        return new LinuxHostingPlanFactory();
    }

    public abstract EconomyHostingPlan createEconomyHosting();

    public abstract DeluxeHostingPlan createDeluxeHosting();

    public abstract UltimateHostingPlan createUltimateHosting();
}
