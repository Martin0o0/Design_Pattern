package AbstractFactory;

//클라
public class AbstractFactoryMain {
    public static void main(String[] args) {
        System.out.println("맥북 기본형");
        MacbookFactory basicMacbookFactory = new BasicMacbookFactory();
        CPU basicCPU = basicMacbookFactory.createCPU();
        RAM basicRAM = basicMacbookFactory.createRAM();
        Storage basicStorage = basicMacbookFactory.createStorage();

        basicCPU.whichProcessor();
        basicRAM.howManyMemory();
        basicStorage.howManyStorage();

        System.out.println("맥북 CTO형");
        MacbookFactory CTOMacbookFactory = new CTOMacbookFactory();
        CPU ctoCPU = CTOMacbookFactory.createCPU();
        RAM ctoRAM = CTOMacbookFactory.createRAM();
        Storage ctoStorage = CTOMacbookFactory.createStorage();

        ctoCPU.whichProcessor();
        ctoRAM.howManyMemory();
        ctoStorage.howManyStorage();
    }
}
