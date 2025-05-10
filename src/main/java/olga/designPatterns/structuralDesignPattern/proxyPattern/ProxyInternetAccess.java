package olga.designPatterns.structuralDesignPattern.proxyPattern;

public class ProxyInternetAccess implements InternetAccess{
    private final String employeeName;
    private RealInternetAccess realAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    private boolean isAdmin(String user) {
        return "Admin".equalsIgnoreCase(user);
    }

    @Override
    public void grantAccess() {
        if (isAdmin(employeeName)) {
            realAccess = new RealInternetAccess(employeeName);
            realAccess.grantAccess();
        } else {
            System.out.println("Access denied to: " + employeeName);
        }
    }
}
