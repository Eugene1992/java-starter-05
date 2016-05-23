package hw.hwBasic3Hw4;

/**
 * Created by User on 22.05.2016.
 */
public class ProDocumentWorker extends DocumentWorker {
    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
