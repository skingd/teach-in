package stephen.greenrivertech.net.mwoapp;

/**
 * Created by Stephen on 4/26/2016.
 */
public class Mech {
    int mechID;
    String mechName;
    String mechClass;
    String mechIcon;
    int maxTons;
    int baseTons;
    int totalArmor;
    int maxArmor;
    int maxJumpJets;
    boolean ecmCapable;
    String chassisType;
    int mechFirepower;
    float heatEfficiency;

    public Mech(int mechID, String mechName, String mechClass, String mechIcon, int maxTons, int baseTons, int totalArmor, int maxArmor, int maxJumpJets, boolean ecmCapable, String chassisType, int mechFirepower, float heatEfficiency){
        this.mechID = mechID;
        this.mechName = mechName;
        this.mechClass = mechClass;
        this.mechIcon = mechIcon;
        this.maxTons = maxTons;
        this.baseTons = baseTons;
        this.totalArmor = totalArmor;
        this.maxArmor = maxArmor;
        this.maxJumpJets = maxJumpJets;
        this.ecmCapable = ecmCapable;
        this.chassisType = chassisType;
        this.mechFirepower = mechFirepower;
        this.heatEfficiency = heatEfficiency;
    }
}
