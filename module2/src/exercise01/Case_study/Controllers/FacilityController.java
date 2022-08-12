package exercise01.Case_study.Controllers;

import exercise01.Case_study.Services.impl.FacilityService;

public class FacilityController {
    private static final FacilityService facilityService = new FacilityService();
    public void display() {
        facilityService.displayMenu();
    }
}
