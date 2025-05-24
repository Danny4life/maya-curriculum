package olga.designPatterns.behaviouralDesignPattern.chainOfResponsibilyPatttern;

public abstract class SupportHandler {
    protected SupportHandler next;

    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(String issueType);
}
