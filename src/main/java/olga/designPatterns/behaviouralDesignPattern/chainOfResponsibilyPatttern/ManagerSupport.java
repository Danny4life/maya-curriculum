package olga.designPatterns.behaviouralDesignPattern.chainOfResponsibilyPatttern;

public class ManagerSupport extends SupportHandler{

    @Override
    public void handleRequest(String issueType) {
        if ("critical".equalsIgnoreCase(issueType)) {
            System.out.println("ManagerSupport: Handled the issue.");
        } else {
            System.out.println("ManagerSupport: Cannot handle the issue.");
        }
    }
}
