package abstractfactory;

public class LinuxHostingPlanFactory extends HostingPlanAbstractFactory {

    @Override
    public EconomyHostingPlan createEconomyHosting() {
        return new LinuxEconomyHostingPlan();
    }

    @Override
    public DeluxeHostingPlan createDeluxeHosting() {
        return new LinuxDeluxeHostingPlan();
    }

    @Override
    public UltimateHostingPlan createUltimateHosting() {
        return new LinuxUltimateHostingPlan();
    }

}
