package tests;

import org.junit.Test;

public class Task7RunSectionAdmin extends BaseFunction
{

    @Test

    public void RunSectionAdmin()
    {
        Login("admin", "admin");
        clickLeftMenu();
    }
}
