package exercise01.Case_study.Services.impl;

import exercise01.Case_study.Libs.impl.FuramaRepository;
import exercise01.Case_study.Services.Service;

public class FuramaService implements Service {
    private static final FuramaRepository furamaRepository = new FuramaRepository();
    @Override
    public void displayMenu() {
        furamaRepository.displayMenu();
    }

    @Override
    public void addEmployee() {

    }
}
