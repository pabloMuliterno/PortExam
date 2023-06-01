
package PackagePort;

public class Port {
    public Hub[] hubs = new Hub[3];

    public Port(Hub firstHub, Hub secondHub, Hub thirdHub) {
        hubs[0] = firstHub;
        hubs[1] = secondHub;
        hubs[2] = thirdHub;

    }


    public void checkAvailable(Container container){
        if(hubs[0].stackContainer(container) == false){
            if(hubs[1].stackContainer(container) == false){
                if(hubs[2].stackContainer(container) == false){
                    System.out.println("The level " + container.getPriority() + " is full.");
                }
            }
        }
    }
    public int getTotalCheckedContainersByPriority(int priority) {
        int totalCheckedContainers = 0;
        for (Hub hub : hubs) {
            totalCheckedContainers += hub.checkedContainer(priority);
        }
        return totalCheckedContainers;
    }
}


