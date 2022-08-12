package exercise01.Case_study.Controllers;

import exercise01.Case_study.Services.impl.FuramaService;

public class FuramaController {
    private static final FuramaService furamaService = new FuramaService();
    public void displayMainMenu() {
        furamaService.displayMenu();
    }

}
