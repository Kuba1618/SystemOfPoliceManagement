package User;

public class Dispatcher {
    boolean permission;

    public void setPermission(boolean havePermission)
    {
        this.permission = havePermission;
    }
    public void addPerrmision() {
        this.permission = true;
    }
    public void suspendEmployee() {
        this.permission = false;
    }
}
