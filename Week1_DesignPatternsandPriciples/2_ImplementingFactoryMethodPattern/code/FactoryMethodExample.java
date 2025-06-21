import java.util.Scanner;

class FactoryMethodExample {
    interface Document {
        void open();
    }
    
    static class WordDocument implements Document {
        public void open() {
            System.out.println(" Opening a Word document.");
        }
    }
    
    static class PdfDocument implements Document {
        public void open() {
            System.out.println(" Opening a PDF document.");
        }
    }
    
    static class ExcelDocument implements Document {
        public void open() {
            System.out.println(" Opening an Excel document.");
        }
    }
    
    static abstract class DocumentCreator {
        public abstract Document createDocument();
    }
    
    static class WordDocumentCreator extends DocumentCreator {
        public Document createDocument() {
            return new WordDocument();
        }
    }
    
    static class PdfDocumentCreator extends DocumentCreator {
        public Document createDocument() {
            return new PdfDocument();
        }
    }
    
    static class ExcelDocumentCreator extends DocumentCreator {
        public Document createDocument() {
            return new ExcelDocument();
        }
    }
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nEnter the type of document to open (word/pdf/excel) or type 'close' to quit:");
            String userChoice = userInput.nextLine().toLowerCase();
            
            if (userChoice.equals("close")) {
                System.out.println(" Exiting the document manager. Goodbye!");
                break;
            }
            
            DocumentCreator creator = null;
            
            switch (userChoice) {
                case "word":
                    creator = new WordDocumentCreator();
                    break;
                case "pdf":
                    creator = new PdfDocumentCreator();
                    break;
                case "excel":
                    creator = new ExcelDocumentCreator();
                    break;
                default:
                    System.out.println(" Invalid input. Please enter 'word', 'pdf', 'excel', or 'close'.");
                    continue;
            }
            
            Document doc = creator.createDocument();
            doc.open();
        }
        
        userInput.close();
    }

}