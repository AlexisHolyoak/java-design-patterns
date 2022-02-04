package abstractfactory;

public class WindowsHostingPlanFactory extends HostingPlanAbstractFactory {

    @Override
    public EconomyHostingPlan createEconomyHosting() {
        return new WindowsEconomyHostingPlan();
    }

    @Override
    public DeluxeHostingPlan createDeluxeHosting() {
        return new WindowsDeluxeHostingPlan();
    }

    @Override
    public UltimateHostingPlan createUltimateHosting() {
        return new WindowsUltimateHostingPlan();
    }

}
