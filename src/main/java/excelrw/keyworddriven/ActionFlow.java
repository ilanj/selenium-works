package excelrw.keyworddriven;

public class ActionFlow {
    public static void actionsCall(String keyword) throws InterruptedException {
        switch (keyword) {
            case "openBrowser":
                ActionsMethod.openBrowser();
                break;
            case "search":
                ActionsMethod.search();
                break;
            case "closeBrowser":
                ActionsMethod.closeBrowser();
                break;
            default:
                System.out.println("workbookoperations mis-match");
        }
    }
}
