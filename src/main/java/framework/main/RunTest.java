package framework.main;

import framework.actions.Login;
import framework.actions.RedirectToMethod;
import framework.workbookoperations.ReadKeyword;

import java.io.IOException;
import java.util.List;

public class RunTest {
    public static void main(String[] args) throws IOException {

        List<String> keywords= ReadKeyword.readKeyword();
        for(String s:keywords)
        {
            RedirectToMethod.redirectToMethod(s);
        }

    }
}
