package abstractfactory;

import common.Util;

public class AbstractFactoryTest {

    public static void main(String[] args) throws Exception {
        String hostingPlan = Util.getPropertyValue("hosting.properties", "HostingOS");
        HostingPlanAbstractFactory hostingFactory = HostingPlanAbstractFactory.getHostingFactory(hostingPlan);

        EconomyHostingPlan economyHostingPlan = hostingFactory.createEconomyHosting();
        System.out.println(economyHostingPlan.getFeatures());

        DeluxeHostingPlan deluxeHostingPlan = hostingFactory.createDeluxeHosting();
        System.out.println(deluxeHostingPlan.getFeatures());

        UltimateHostingPlan ultimateHostingPlan = hostingFactory.createUltimateHosting();
        System.out.println(ultimateHostingPlan.getFeatures());
    }
}
