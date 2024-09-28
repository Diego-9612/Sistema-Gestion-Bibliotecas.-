package interfacesDAO;

import java.util.List;
import models.Reports;

/**
 *
 * @author Diego Guerrero
 */
public interface ReportsInterface {

    public void registerReport(Reports report) throws Exception;

    public void modifyReport(Reports report) throws Exception;

    public void deleteReport(Reports report) throws Exception;

    public List<Reports> listReports() throws Exception;

}
