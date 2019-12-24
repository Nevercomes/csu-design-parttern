package org.csu.dp.experiment2.exp4;

/**
 * Created by sun on 2019/12/24
 */
public class XmlFacade extends AbstractFacade {

    private FileReader fileReader = new FileReader();
    private ReportDisplay reportDisplay = new ReportDisplay();

    public void showReport(String path) {
        String file = fileReader.read(path);
        reportDisplay.display(file);
    }
}
