package hw.hwBasic3Hw4;

/**
 * Created by User on 22.05.2016.
 */
public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument() {
        super.saveDocument();
        System.out.println("Документ сохранен в новом формате");
    }
}
