package tests;

import org.junit.Test;

public class Task8SearchSticker extends BaseFunction
{
    @Test
    public void SearchSticker()
    {
        Login("admin", "admin");
        goToMainDirectory();
        searchImageSticker();
    }
}
