import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {

    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage;

    // Visit a new website
    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }

        currentPage = url;
        forwardStack.clear();

        System.out.println("Visited: " + currentPage);
    }

    // Go back to the previous website
    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("No previous page available.");
            return;
        }

        forwardStack.push(currentPage);
        currentPage = backStack.pop();

        System.out.println("Back to: " + currentPage);
    }

    // Go forward to the next website
    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward page available.");
            return;
        }

        backStack.push(currentPage);
        currentPage = forwardStack.pop();

        System.out.println("Forward to: " + currentPage);
    }

    // Show the current website
    public void currentPage() {
        if (currentPage == null) {
            System.out.println("No page is currently open.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }

    // Show browsing history
    public void showHistory() {
        if (currentPage == null && backStack.isEmpty()) {
            System.out.println("History is empty.");
            return;
        }

        System.out.println("\n--- Browsing History ---");

        for (String url : backStack) {
            System.out.println(url);
        }

        if (currentPage != null) {
            System.out.println(currentPage + " <- Current");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BrowserHistory browser = new BrowserHistory();

        while (true) {

            System.out.println("\n===== Browser History Simulator =====");
            System.out.println("1. Visit Website");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Current Page");
            System.out.println("5. Show History");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter website URL: ");
                    String url = scanner.nextLine();
                    browser.visit(url);
                    break;

                case 2:
                    browser.back();
                    break;

                case 3:
                    browser.forward();
                    break;

                case 4:
                    browser.currentPage();
                    break;

                case 5:
                    browser.showHistory();
                    break;

                case 6:
                    System.out.println("Exiting Browser History Simulator...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please Try Again.");
            }
        }
    }
}