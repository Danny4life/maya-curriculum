package aiz.collections.aitTechInstitute.service;

import aiz.collections.aitTechInstitute.model.Cafeteria;
import aiz.collections.aitTechInstitute.model.Developers;

public interface CafeteriaService {

    void addDevelopersToQueue(Developers developers);


    String collectMeal(Cafeteria meal);
}
