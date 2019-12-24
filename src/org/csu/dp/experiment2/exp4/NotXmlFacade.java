package org.csu.dp.experiment2.exp4;

/**
 * Created by sun on 2019/12/24
 */
public class NotXmlFacade extends AbstractFacade {

    private FileReader fileReader = new FileReader();
    private File2Xml file2Xml = new File2Xml();
    private ReportDisplay reportDisplay = new ReportDisplay();

    public void showReport(String path) {
        String file = fileReader.read(path);
        String xml = file2Xml.file2Xml(file);
        reportDisplay.display(xml);
    }
}
