package framework.actions;

public class RedirectToMethod {
    public static void redirectToMethod(String keyword)
    {
        switch (keyword)
        {
            case "login":
                Login.login();
                break;

            case "test1":
                Login.test1();
                break;

            case "test2":
                Login.test2();
                break;

            case "test3":
                Login.test3();
                break;

            case "home1":
                HomePage.home1();
                break;

            case "home2":
                HomePage.home2();
                break;

                default:
                    System.out.println("invalid keyword");
        }
    }
}
