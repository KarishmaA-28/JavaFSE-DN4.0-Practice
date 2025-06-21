class SingletonPattern {
    static class Logger {
        private static Logger singleInstance = null;
        
        private Logger() {
            System.out.println("Logger instance created.");
        }
        
        public static Logger getInstance() {
            if (singleInstance == null) {
                singleInstance = new Logger();
            }
            return singleInstance;
        }
        
        public void log(String message) {
            System.out.println("Log: " + message);
        }
    }
    
    public static void main(String[] args) {
        Logger firstLogger = Logger.getInstance();
        firstLogger.log("Hello from logger 1!");
        
        Logger secondLogger = Logger.getInstance();
        secondLogger.log("Hello again from logger 2!");
        
        if (firstLogger == secondLogger) {
            System.out.println("Both firstLogger and secondLogger are the same instance.");
        } else {
            System.out.println("Different Logger instances exist.");
        }
    }
}