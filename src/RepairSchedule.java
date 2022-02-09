import java.util.ArrayList;

public class RepairSchedule
{
    /** Each element represents a repair by an individual mechanic in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;

    /** Constructs a RepairSchedule object.
     * Precondition: n >= 0
     */
    public RepairSchedule(int n)
    {
        schedule = new ArrayList<CarRepair>();
        numberOfMechanics = n;
    }

    public ArrayList<CarRepair> getSchedule()
    {
        return schedule;
    }

    /** Attempts to schedule a repair by a given mechanic in a given bay as described in part (a).
     * Precondition: 0 <= m < numberOfMechanics and b >= 0
     */
    public boolean addRepair(int m, int b)
    {
        if (schedule.size() == 0) {
            schedule.add(new CarRepair(m,b));
            return true;
        }
        else {
            for (int x = 0; x < schedule.size(); x ++) {
                if (schedule.get(x).getMechanicNum() == m || schedule.get(x).getBayNum() == b) {
                    return false;
                }
            }
            schedule.add(new CarRepair(m,b));
            return true;
        }

    }

    /** Returns an ArrayList containing the mechanic identifiers of all available mechanics,
     * as described in part (b).
     */
    public ArrayList<Integer> availableMechanics()
    {
        ArrayList<Integer> availableMechs = new ArrayList<Integer>();
        for (int x = 0; x < numberOfMechanics; x ++) {
            availableMechs.add(x);
        }
        for (int y = 0; y < schedule.size(); y ++){
            int currMech = schedule.get(y).getMechanicNum();
            for (int x = 0; x < availableMechs.size(); x++) {
                if (availableMechs.get(x) == currMech) {
                    availableMechs.remove(x);
                    x --;
                }
            }
        }
        return availableMechs;
    }

    /** Removes an element from schedule when a repair is complete. */
    public void carOut(int b)
    {
        for (int i = 0; i < schedule.size(); i++)
        {
            CarRepair carAtIdx = schedule.get(i);
            if (carAtIdx.getBayNum() == b)
            {
                schedule.remove(i);
            }
        }
    }
}