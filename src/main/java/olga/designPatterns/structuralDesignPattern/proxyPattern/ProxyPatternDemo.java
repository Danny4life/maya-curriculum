package olga.designPatterns.structuralDesignPattern.proxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        InternetAccess adminAccess = new ProxyInternetAccess("Admin");
        adminAccess.grantAccess();

        InternetAccess studentAccess = new ProxyInternetAccess("Student");
        studentAccess.grantAccess();
    }
}

/**
 * This activity demonstrates access control through the Proxy pattern —
 * the proxy class decides whether or not to delegate the call to the real implementation.
 */
