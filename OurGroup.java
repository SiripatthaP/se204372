import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Siripattha Pinyosamosorn"); //PUT YOUR NAME HERE
        groupMembers.add("Suthida Khrueanak"); //PUT YOUR NAME HERE
        groupMembers.add("Nattawat Sripatpiriyakul"); //PUT YOUR NAME HERE
        groupMembers.add("Weerawut Srikrasem"); //PUT YOUR NAME HERE
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}